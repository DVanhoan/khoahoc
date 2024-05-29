/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author HOAN
 */
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.io.*;

public class Hash {
    private static final String ALGORITHM = "RSA";
    private static final int KEY_SIZE = 2048;
    private static final String PRIVATE_KEY_FILE = "private.key";
    private static final String PUBLIC_KEY_FILE = "public.key";

    private static Hash instance = null;

    private PrivateKey privateKey;
    private static PublicKey publicKey;

    // Singleton pattern: Constructor is private to prevent instantiation from outside
    private Hash() throws Exception {
        File privateKeyFile = new File(PRIVATE_KEY_FILE);
        File publicKeyFile = new File(PUBLIC_KEY_FILE);

        if (privateKeyFile.exists() && publicKeyFile.exists()) {
            // If keys exist, read from files
            privateKey = readPrivateKey(privateKeyFile);
            publicKey = readPublicKey(publicKeyFile);
        } else {
            // If keys don't exist, generate new keys and save to files
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            keyPairGenerator.initialize(KEY_SIZE);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();

            savePrivateKey(privateKey, privateKeyFile);
            savePublicKey(publicKey, publicKeyFile);
        }
    }

    // Singleton pattern: Method to get the singleton instance
    public static Hash getInstance() throws Exception {
        if (instance == null) {
            instance = new Hash();
        }
        return instance;
    }

    // Static method to sign data
    public static String signData(String data) throws Exception {
        Hash hash = getInstance();
        return hash.sign(data);
    }

    // Static method to verify signature
    public static boolean verifySignature(String data, String signature) throws Exception {
        Hash hash = getInstance();
        return hash.verify(data, signature);
    }

    // Sign data using private key
    private String sign(String data) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(data.getBytes());
        byte[] signedData = signature.sign();
        return Base64.getEncoder().encodeToString(signedData);
    }

    // Verify signature using public key
    public static boolean verify(String data, String signature) {
        try {
            Signature sig = Signature.getInstance("SHA256withRSA");
            sig.initVerify(publicKey);
            sig.update(data.getBytes());
            byte[] signatureBytes = Base64.getDecoder().decode(signature);
            return sig.verify(signatureBytes);
        } catch (Exception e) {
            return false;
        }
    }


    // Read private key from file
    private PrivateKey readPrivateKey(File file) throws Exception {
        byte[] privateKeyBytes = readFileBytes(file);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(privateKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        return keyFactory.generatePrivate(spec);
    }

    // Read public key from file
    private PublicKey readPublicKey(File file) throws Exception {
        byte[] publicKeyBytes = readFileBytes(file);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        return keyFactory.generatePublic(spec);
    }

    // Save private key to file
    private void savePrivateKey(PrivateKey privateKey, File file) throws Exception {
        byte[] privateKeyBytes = privateKey.getEncoded();
        saveBytesToFile(privateKeyBytes, file);
    }

    // Save public key to file
    private void savePublicKey(PublicKey publicKey, File file) throws Exception {
        byte[] publicKeyBytes = publicKey.getEncoded();
        saveBytesToFile(publicKeyBytes, file);
    }

    // Read data from file
    private byte[] readFileBytes(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fis.read(bytes);
        fis.close();
        return bytes;
    }

    // Save data to file
    private void saveBytesToFile(byte[] bytes, File file) throws Exception {
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.close();
    }
    
    public static void setPublicKey(PublicKey pk) {
        publicKey = pk;
    }



    //o day mat khau 123 da duoc ma hoa trong co so du lieu va khi dua ra de kiem tra
    //mat khau nay co dung khong va ket qua la dung
    public static void main(String[] args) {
        try {
            String data = "123";
            String signature = Hash.signData(data);

            System.out.println(signature);




//            boolean isValid = Hash.verifySignature(data, signature);
//            System.out.println("Signature is valid: " + isValid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


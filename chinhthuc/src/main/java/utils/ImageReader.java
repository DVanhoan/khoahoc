package utils;

import java.awt.Image;
import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.ImageIcon;
import model.ImageCustom;

public class ImageReader {

  

    public static ArrayList<String> readImages(String folderPath) {
        Path dir = Paths.get(folderPath);
        String[] extensions = new String[]{".png", ".jpg", ".jpeg"}; // Extensions array
        List<String> allowedExtensions = Arrays.asList(extensions);
        ArrayList<String> listImage = new ArrayList<>();
        try (Stream<Path> files = Files.walk(dir)) {
            files.forEach(file -> {
                // Checks if the file is regular and ends with any of the specified extensions
                if (Files.isRegularFile(file) && allowedExtensions.stream().anyMatch(file.toString()::endsWith)) {
                    listImage.add(file.toString());
                }
            });
        } catch (IOException e) {
            System.out.println("Error reading files");
            e.printStackTrace();
        }
        return listImage;
    }

    public static  ImageIcon createImageIcon(String path, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(path);  // Load the image from the specified path
        Image image = imageIcon.getImage();         // Transform it into an Image object
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);  // Resize the image smoothly
        return new ImageIcon(resizedImage);        // Return the resized ImageIcon
    }

    public static ArrayList<ImageCustom> getIcons(String folderPath, int width, int height) {
        ArrayList<ImageCustom> imagesIcon = new ArrayList<>();
        ArrayList<String> images = readImages(folderPath);
        for (String imageName : images) {
            ImageCustom imageCustom = new ImageCustom();
            imageCustom.setIcon(createImageIcon(imageName, width, height));
            imageCustom.setPath(imageName);
            imagesIcon.add(imageCustom);
        }
        return imagesIcon;
    }
}

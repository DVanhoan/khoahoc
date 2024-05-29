/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80035 (8.0.35)
 Source Host           : localhost:3306
 Source Schema         : doancoso1

 Target Server Type    : MySQL
 Target Server Version : 80035 (8.0.35)
 File Encoding         : 65001

 Date: 30/05/2024 03:36:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_user` bigint NOT NULL,
  `id_lesson` bigint NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idUser`(`id_user` ASC) USING BTREE,
  INDEX `idLesson`(`id_lesson` ASC) USING BTREE,
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`id_lesson`) REFERENCES `lessons` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (1, 'bai hoc rat hay', 1, 1);
INSERT INTO `comments` VALUES (2, 'kthay day nhanh qua', 2, 3);
INSERT INTO `comments` VALUES (3, 'ffsdfsdf', 1, 1);
INSERT INTO `comments` VALUES (4, 'efwefwefwe', 1, 1);
INSERT INTO `comments` VALUES (5, 'fdsfsdf', 1, 1);

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `userId` bigint NOT NULL,
  `price` decimal(20, 2) NULL DEFAULT NULL,
  `image` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `userId`(`userId` ASC) USING BTREE INVISIBLE,
  CONSTRAINT `courses_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES (1, 'lap trinh co ban', '12', 21, 1.00, 'avatars\\1.png');
INSERT INTO `courses` VALUES (8, 'Cấu trúc dữ liệu và giải thuật', '12', 21, 0.00, 'avatars\\1.png');
INSERT INTO `courses` VALUES (9, 'Giải Tích 1', '32', 2, 10.00, 'avatars\\21.png');
INSERT INTO `courses` VALUES (10, 'Đại Số Tuyến Tính', '4', 18, 3.00, 'avatars\\21.png');
INSERT INTO `courses` VALUES (11, 'mi thuat', '34', 3, 3.00, 'avatars\\1.png');

-- ----------------------------
-- Table structure for enrollments
-- ----------------------------
DROP TABLE IF EXISTS `enrollments`;
CREATE TABLE `enrollments`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_user` bigint NOT NULL,
  `id_course` bigint NOT NULL,
  `start_date` varchar(222) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `finish_date` varchar(222) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idUser`(`id_user` ASC) USING BTREE,
  INDEX `idCourse`(`id_course` ASC) USING BTREE,
  CONSTRAINT `enrollments_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `enrollments_ibfk_2` FOREIGN KEY (`id_course`) REFERENCES `courses` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of enrollments
-- ----------------------------
INSERT INTO `enrollments` VALUES (1, 8, 1, '2024-05-16', '2024-05-30', 1);
INSERT INTO `enrollments` VALUES (2, 9, 8, '2024-05-16', '2024-06-26', 1);
INSERT INTO `enrollments` VALUES (3, 5, 8, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (4, 4, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (5, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (6, 2, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (7, 2, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (8, 2, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (9, 2, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (10, 2, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (11, 3, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (14, 11, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (15, 5, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (16, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (17, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (18, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (19, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (21, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (22, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (24, 1, 1, '1970-01-01', '1970-01-01', 1);
INSERT INTO `enrollments` VALUES (25, 1, 1, '2024-05-21', '2024-05-21', 1);
INSERT INTO `enrollments` VALUES (26, 1, 1, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (27, 1, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (28, 7, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (29, 13, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (30, 8, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (31, 7, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (32, 8, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (33, 11, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (34, 4, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (35, 9, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (36, 5, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (37, 5, 11, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (38, 1, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (39, 1, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (40, 1, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (41, 1, 8, '2024-05-21', '2024-08-21', 1);
INSERT INTO `enrollments` VALUES (42, 1, 10, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (43, 9, 10, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (44, 8, 10, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (45, 6, 9, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (46, 2, 9, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (47, 15, 9, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (48, 11, 9, '2024-05-22', '2024-08-22', 1);
INSERT INTO `enrollments` VALUES (49, 10, 9, '2024-05-22', '2024-08-22', 1);

-- ----------------------------
-- Table structure for lessons
-- ----------------------------
DROP TABLE IF EXISTS `lessons`;
CREATE TABLE `lessons`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_course` bigint NOT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `order` tinyint NOT NULL,
  `video` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `lessons_ibfk_1`(`id_course` ASC) USING BTREE,
  CONSTRAINT `lessons_ibfk_1` FOREIGN KEY (`id_course`) REFERENCES `courses` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lessons
-- ----------------------------
INSERT INTO `lessons` VALUES (1, 1, 'bai1: lam quen voi c++', 'mở đầu', 1, NULL);
INSERT INTO `lessons` VALUES (2, 1, 'bai2: biến và kiểu dữ liệu', '', 2, NULL);
INSERT INTO `lessons` VALUES (3, 1, 'bai3', '', 3, NULL);
INSERT INTO `lessons` VALUES (4, 1, 'bai4: mảng một chiều', '', 4, NULL);
INSERT INTO `lessons` VALUES (5, 1, 'bai5: mảng 2 chiều', '', 5, NULL);
INSERT INTO `lessons` VALUES (6, 1, 'bai6: con trỏ', '', 6, NULL);
INSERT INTO `lessons` VALUES (7, 1, 'bai7', '', 7, NULL);
INSERT INTO `lessons` VALUES (8, 1, 'bai8', '', 8, NULL);
INSERT INTO `lessons` VALUES (9, 1, 'bai9', '', 9, NULL);
INSERT INTO `lessons` VALUES (14, 9, 'bai1: Mở đầu', 'bài học quan trọng', 0, NULL);
INSERT INTO `lessons` VALUES (15, 1, 'bai2: nhớ lại kiến thức phổ thông', '123', 0, NULL);
INSERT INTO `lessons` VALUES (16, 1, '213312', '1231', 0, NULL);
INSERT INTO `lessons` VALUES (17, 1, '13qwe', 'ưqeq', 11, NULL);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `role` enum('admin','teacher','student') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` int NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`, `username`) USING BTREE,
  INDEX `id`(`id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'Võ Chí Luân', '+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 1, 'luan@gmail.com');
INSERT INTO `users` VALUES (2, 'Dương Văn Minh', '+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 1, 'minh@gmail.com');
INSERT INTO `users` VALUES (3, 'admin', 'O/KEmqbVeBio1ycqy9geO/AqldUP1XrSKao0tlAeLaDL1YQVDPumReoEun++RBbMLN4nCX2wPhNyfINbS85FC0eajD5ic0Vft/VhsHZmqSsnxDZJGb7nnuZgveeMWCoGJbJrDCYmgcv4H/xgu4FDKMWCes3Ks1rdb+dPDYB2xVUzxo2BH1vAORx/bEi0WOxoMQhhNYIy2IPM8x0kfReM22Czfo1AaaB9XWqzXynnCt/0VdLiojrth4aY76mCOL6TG+Hv9RaxRpvDgACxKKJ4cJvbTue488vna2oeqvO83Yldj3qcXDjWYusWFXcT2/6+hMA3rTHuwGNnWim40h+gxQ==', 'admin', 1, 'vhoan148@gmail.com');
INSERT INTO `users` VALUES (4, 'Đặng Thành Luân', '+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 1, 'luan@gmail.com');
INSERT INTO `users` VALUES (5, 'Lang Thanh Trường', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'truong@gmail.com');
INSERT INTO `users` VALUES (6, 'Trương Huỳnh Đạt', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'dat@gmail.com');
INSERT INTO `users` VALUES (7, 'Dương Văn Hoan', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'hoan@gmail.com');
INSERT INTO `users` VALUES (8, 'Lương Minh Chiến', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'chien@gmail.com');
INSERT INTO `users` VALUES (9, 'Đào Mạnh Hùng', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'hung@gmail.com');
INSERT INTO `users` VALUES (10, 'Nguyễn Tấn Tài', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 0, 'tai@gmail.com');
INSERT INTO `users` VALUES (11, 'Phạm Văn Long', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 0, 'long@gmail.com');
INSERT INTO `users` VALUES (12, 'Nguyễn Quang Hải', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'hai@gmail.com');
INSERT INTO `users` VALUES (13, 'Nguyễn Công Phượng', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'phuong@gmail.com');
INSERT INTO `users` VALUES (14, 'Đặng Văn Lâm', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'lam@gmail.com');
INSERT INTO `users` VALUES (15, 'Ngô Văn Nhân', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'nhan@gmail.com');
INSERT INTO `users` VALUES (16, 'Nguyễn Văn Nam', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'nam@gmail.com');
INSERT INTO `users` VALUES (17, 'Nguyễn Thị Kim', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'student', 1, 'kim@gmail.com');
INSERT INTO `users` VALUES (18, 'Ngô Đức Phúc', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'teacher', 1, 'phuc@gmail.com');
INSERT INTO `users` VALUES (19, 'Nguyễn Đắc Huy', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'teacher', 1, 'huynl@gmail.com');
INSERT INTO `users` VALUES (20, 'Võ Hải Triều', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'teacher', 1, 'trieu@gmail.com');
INSERT INTO `users` VALUES (21, 'Quách Xuân Tước', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'teacher', 1, 'tuoc@gmail.com');
INSERT INTO `users` VALUES (22, 'Nguyễn Tấn Dũng', 'BFh7bGyPCmbkUyE0h7vDwT2bF+3DpqR76H+0PsxwVgT5K4l5oVRVZzzbtv3GdvnfQCq9kndlzcGoyHK/XdQveeBiZHj3OMpIQGkQh2TP9hWSmpchDFRHFXFcm1Q/Mxn713KxgfGBCqONeU3uW27yH2JXNpgEyHYBnxWE5oXcTNSJSuRyDHylKAwwGSddKwvflwM4d0Mz48NThdp4aczRsnVxT40O1AZQamOcrOkiFJAs4HTUPKBeEeqM6g6gXx9+0kutgFnDE3J41WLSoon50FWc+3BxiQ2Kn63LVhEX86iY6S+39HujAYQLDRGCkwYMylZtKOOvA2sELkNXTDvlZQ==', 'teacher', 1, 'dung@gmail.com');
INSERT INTO `users` VALUES (23, 'Võ Xuân Phúc', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'teacher', 1, 'phucnl@gmail.com');
INSERT INTO `users` VALUES (24, 'd', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 1, 'd@gmail.com');
INSERT INTO `users` VALUES (25, 's', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'teacher', 1, 's@gmail.com');
INSERT INTO `users` VALUES (26, '2@gmail.com', 'YhdWYrQ344f4s/jssv3FtHlZSWVd9OR8cYyoBHwoeUzq9IKiCyQapNnM5CLoHmgWqxPNUYppYzajmLuNcbvgzloC1/bMJDvDJjeCnzjj/r1bkxPC9+zFcU+60VoWkNPqBmCP8rIbk+N5M08GF03i1JrufNq5AhhoP1ZBcJOHzYfScynTsaNvusza6XVi0yFX0myG3H1trvOrYhWbRQTeA1MLXmioQufaJ3FYvsgzRfiztNfrBJFcjauzRhuuxTHvI7kmpnwMRSK/vAKE3l64VndAnAYJcHWEA5nr8/OgBvn9u8X0kEqsLmrGD3FQLeR0CS1qIkCgpbHM3a8dNHNNWQ==', 'student', 0, '2@gmail.com');
INSERT INTO `users` VALUES (27, 'dat', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 0, '2@gmail.com');
INSERT INTO `users` VALUES (28, 'huy', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'student', 1, 'E@gmail.com');
INSERT INTO `users` VALUES (29, 'Nguyễn Thành Công', 'WCxjEa8JS+zAuSC9a493YYbh+nbfP2Lqkv0IeR7QYfnu0CuXlXC0HJVKzlqCHO4R1Upz4RydnIe77xX2fQst5QAAGKtqYhheqlSj0hPAQF/XjuCqClmWB+i1alF/87Hbx4qHMZ0TCUkFAEbFbnzO4rhUyo0QKobPWg8Vt/IgQCUd42/IuEcK7zbuThzqiEI+aLc7U5YbgfqonrVjByaSKmFuDR5/w/vIOkBnFxbe/UOl0elxPcRNVXXgu3adgwqw3vX4Cw1pyMP4fs+wsCeTj14l7iLl/a+lxIvTRXxjU8Z7COZrlRIiVnZdNbJ9KhLwFb1JgP4tF/cvbh1MeVSkSA==', 'teacher', 1, 'cong@gmail.com');

SET FOREIGN_KEY_CHECKS = 1;

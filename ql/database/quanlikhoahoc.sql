CREATE database quanlikhoahoc;

use quanlikhoahoc;

CREATE TABLE `KhoaHoc` (
    `maKhoaHoc` varchar(50) NOT NULL,
    `tenKhoaHoc` varchar(100) DEFAULT NULL,
    `soLuong` int(11) NOT NULL DEFAULT 0,
    `thoiGian` timestamp NULL DEFAULT NULL,
    `nguoiTao` varchar(50) DEFAULT NULL,
    `nguoiDuyet` varchar(50) DEFAULT NULL,
    `trangThai` int(11) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `PhieuDangKy` (
    `maPhieu` varchar(50) NOT NULL,
    `thoiGianTao` timestamp NULL DEFAULT NULL,
    `nguoiTao` varchar(50) DEFAULT NULL,
    `maKhoaHoc` varchar(50) DEFAULT NULL,
    `tongTien` double NOT NULL




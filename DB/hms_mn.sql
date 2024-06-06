-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3377
-- Generation Time: Jun 02, 2024 at 10:53 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms_mn`
--

-- --------------------------------------------------------

--
-- Table structure for table `check_room`
--

CREATE TABLE `check_room` (
  `id` varchar(10) NOT NULL,
  `room_number` varchar(10) NOT NULL,
  `id_customer` varchar(10) NOT NULL,
  `checkin_date` date NOT NULL,
  `checkout_date` date DEFAULT NULL,
  `total` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `check_room`
--

INSERT INTO `check_room` (`id`, `room_number`, `id_customer`, `checkin_date`, `checkout_date`, `total`) VALUES
('CR01', 'p204', 'KH01', '2024-06-02', '2024-06-02', '500000'),
('CR02', 'p301', 'KH02', '2024-06-02', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `check_ser`
--

CREATE TABLE `check_ser` (
  `id` varchar(10) NOT NULL,
  `idDriver` varchar(10) NOT NULL,
  `id_customer` varchar(10) NOT NULL,
  `time` varchar(10) NOT NULL,
  `total` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `check_ser`
--

INSERT INTO `check_ser` (`id`, `idDriver`, `id_customer`, `time`, `total`) VALUES
('CR01', 'Dri08', 'KH01', '2', '1600000');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(30) NOT NULL,
  `number` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `phone_number` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `number`, `name`, `gender`, `country`, `phone_number`) VALUES
('KH01', '034201005642', 'Nguyễn Công Chức', 'Nam', 'Hà Nội', '0974823353'),
('KH02', '034201668643', 'Nguyễn Công Cốc', 'Nam', 'Hà Nội', '0967465356');

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `idDriver` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` varchar(10) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `company` varchar(30) NOT NULL,
  `brand` varchar(30) NOT NULL,
  `available` varchar(10) NOT NULL,
  `location` varchar(50) NOT NULL,
  `price` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`idDriver`, `name`, `age`, `gender`, `company`, `brand`, `available`, `location`, `price`) VALUES
('Dri01', 'Nguyễn Văn Bằng', '30', 'Nam', 'GSM', 'vinfast', 'Không', 'Big C Thăng Long', '200000'),
('Dri02', 'Nguyễn Văn Khánh', '30', 'nam', 'Mai Linh', 'Toyota', 'không', 'Nhà hát lớn Hà Nội', '500000'),
('Dri03', 'Nguyễn Văn An', '30', 'nam', 'GSM', 'vinfast', 'không', 'Sân bay nội bài', '500000'),
('Dri04', 'Trần Văn Bình', '32', 'nam', 'GSM', 'vinfast', 'không', 'Ga Hà Nội', '600000'),
('Dri05', 'Lê Văn Cường', '28', 'nam', 'GSM', 'vinfast', 'không', 'Sân bay Nội Bài', '650000'),
('Dri06', 'Phạm Văn Dũng', '34', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Mỹ Đình', '700000'),
('Dri07', 'Ngô Văn Em', '29', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Giáp Bát', '750000'),
('Dri08', 'Hoàng Văn Phú', '31', 'nam', 'GSM', 'vinfast', 'có khách', 'Sân bay nội bài', '800000'),
('Dri09', 'Vũ Văn Hoàng', '33', 'nam', 'GSM', 'vinfast', 'không', 'Ga Hà Nội', '850000'),
('Dri10', 'Đặng Văn Hùng', '29', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Mỹ Đình', '900000'),
('Dri11', 'Bùi Văn Khải', '30', 'nam', 'GSM', 'vinfast', 'không', 'Sân bay Nội Bài', '950000'),
('Dri12', 'Nguyễn Văn Lâm', '32', 'nam', 'GSM', 'vinfast', 'không', 'Ga Hà Nội', '1000000'),
('Dri13', 'Trần Văn Minh', '28', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Mỹ Đình', '1050000'),
('Dri14', 'Phạm Văn Nam', '34', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Giáp Bát', '1100000'),
('Dri15', 'Ngô Văn Phong', '31', 'nam', 'GSM', 'vinfast', 'không', 'Sân bay Nội Bài', '1150000'),
('Dri16', 'Hoàng Văn Quý', '33', 'nam', 'GSM', 'vinfast', 'không', 'Ga Sài Gòn', '1200000'),
('Dri17', 'Vũ Văn Sơn', '29', 'nam', 'GSM', 'vinfast', 'không', 'Bến xe Giáp Bát', '1250000'),
('Dri18', 'Nguyễn Văn Khánh', '30', 'nam', 'Mai Linh', 'Toyota', 'không', 'Sân bay Nội Bài', '500000'),
('Dri19', 'Trần Văn Hiếu', '32', 'nam', 'Vinasun', 'Honda', 'không', 'Bến xe Mỹ Đình', '450000'),
('Dri20', 'Lê Văn Mạnh', '29', 'nam', 'VietThanh', 'Hyundai', 'không', 'Ga Hà Nội', '400000'),
('Dri21', 'Phạm Văn Sang', '28', 'nam', 'Grab', 'Kia', 'không', 'Bến xe Giáp Bát', '350000'),
('Dri22', 'Ngô Văn Long', '34', 'nam', 'Be Group', 'Ford', 'không', 'Bến xe Nước Ngầm', '500000'),
('Dri23', 'Hoàng Văn Hải', '31', 'nam', 'GoViet', 'Chevrolet', 'không', 'Sân bay Nội Bài', '500000'),
('Dri24', 'Vũ Văn An', '33', 'nam', 'FastGo', 'Mazda', 'không', 'Bến xe Mỹ Đình', '450000'),
('Dri25', 'Đặng Văn Đạt', '30', 'nam', 'Aber', 'Mitsubishi', 'không', 'Ga Hà Nội', '400000'),
('Dri26', 'Bùi Văn Minh', '32', 'nam', 'Emddi', 'Nissan', 'không', 'Bến xe Giáp Bát', '350000'),
('Dri27', 'Nguyễn Văn Tài', '28', 'nam', 'TaxiGroup', 'Suzuki', 'không', 'Bến xe Nước Ngầm', '500000'),
('Dri28', 'Trần Văn Tú', '34', 'nam', 'G7 Taxi', 'Peugeot', 'không', 'Sân bay Nội Bài', '500000'),
('Dri29', 'Lê Văn Bảo', '31', 'nam', 'Thành Hưng', 'Renault', 'không', 'Bến xe Mỹ Đình', '450000'),
('Dri30', 'Phạm Văn Phú', '33', 'nam', 'Vic Taxi', 'Subaru', 'không', 'Ga Hà Nội', '400000'),
('Dri31', 'Ngô Văn Thanh', '29', 'nam', 'Group Taxi', 'Volvo', 'không', 'Bến xe Giáp Bát', '350000'),
('Dri32', 'Hoàng Văn Nam', '30', 'nam', 'City Taxi', 'Mercedes-Benz', 'không', 'Bến xe Nước Ngầm', '500000'),
('Dri33', 'Đặng Văn Đạt', '30', 'nam', 'Aber', 'Mitsubishi', 'không', 'Công viên Thống Nhất', '400000'),
('Dri34', 'Bùi Văn Minh', '32', 'nam', 'Emddi', 'Nissan', 'không', 'Khu du lịch sinh thái Ba Vì', '350000'),
('Dri35', 'Nguyễn Văn Tài', '28', 'nam', 'TaxiGroup', 'Suzuki', 'không', 'Sân vận động quốc gia Mỹ Đình', '500000'),
('Dri36', 'Trần Văn Tú', '34', 'nam', 'G7 Taxi', 'Peugeot', 'không', 'Hồ Tây Water Park', '500000'),
('Dri37', 'Lê Văn Bảo', '31', 'nam', 'Thành Hưng', 'Renault', 'không', 'Nhà hát lớn Hà Nội', '450000'),
('Dri38', 'Phạm Văn Phú', '33', 'nam', 'Vic Taxi', 'Subaru', 'không', 'Chợ Đồng Xuân', '400000'),
('Dri39', 'Ngô Văn Thanh', '29', 'nam', 'Group Taxi', 'Volvo', 'không', 'Lăng Chủ tịch Hồ Chí Minh', '350000'),
('Dri40', 'Hoàng Văn Nam', '30', 'nam', 'City Taxi', 'Mercedes-Benz', 'không', 'Nhà hàng Sen Hồ Tây', '500000'),
('Dri41', 'Trần Văn Hiếu', '32', 'nam', 'Vinasun', 'Honda', 'không', 'Khu đô thị Gamuda Gardens', '450000'),
('Dri42', 'Lê Văn Mạnh', '29', 'nam', 'VietThanh', 'Hyundai', 'không', 'Công viên nước Hồ Tây', '400000'),
('Dri43', 'Phạm Văn Sang', '28', 'nam', 'Grab', 'Kia', 'không', 'Vincom Center Ba Trieu', '350000'),
('Dri44', 'Ngô Văn Long', '34', 'nam', 'Be Group', 'Ford', 'không', 'Chùa Trấn Quốc', '500000'),
('Dri45', 'Hoàng Văn Hải', '31', 'nam', 'GoViet', 'Chevrolet', 'không', 'Bảo tàng Hồ Chí Minh', '500000'),
('Dri46', 'Vũ Văn An', '33', 'nam', 'FastGo', 'Mazda', 'không', 'Nhà hát Tuổi Trẻ', '450000');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empID` varchar(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` varchar(10) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `job` varchar(30) NOT NULL,
  `salary` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empID`, `name`, `age`, `gender`, `job`, `salary`, `phone`, `address`, `email`) VALUES
('NV01', 'Nguyễn Ngọc Lương', '24', 'Nam', 'Nhân viên bếp', '8000000', '0999888777', 'Hòa Bình', 'nguyenngocluong@gmail.com'),
('NV02', 'Phạm Bình Lưu', '22', 'Nam', 'Nhân viên bếp', '8000000', '0897686654', 'Hưng Yên', 'phambinhluu@gmail.com'),
('NV03', 'trần đình quốc', '30', 'Nam', 'Nhân viên bếp', '15000000', '0986758457', 'Vĩnh Phúc', 'trandinhquoc@gmail.com'),
('NV04', 'Nguyễn Quang Thứ', '29', 'nam', 'nhân viên bếp', '8000000', '0985684623', 'Hà Nam', 'nguyenquangthu@gmail.com'),
('NV05', 'Phạm Thị Dung', '26', 'nữ', 'nhân viên bếp', '7500000', '0987123456', 'Hồ Chí Minh', 'phamthidung@gmail.com'),
('NV06', 'Vũ Văn Hải', '27', 'nam', 'nhân viên bếp', '6500000', '0918671234', 'Hà Nội', 'vuvanhai@gmail.com'),
('NV07', 'Đỗ Thị Hoa', '29', 'nữ', 'nhân viên bếp', '6000000', '0923456789', 'Hải Dương', 'dothihoa@gmail.com'),
('NV08', 'Bùi Văn Dũng', '31', 'nam', 'nhân viên bếp', '10000000', '0945671234', 'Ninh Bình', 'buivandung@gmail.com'),
('NV09', 'Hoàng Thị Lan', '24', 'nữ', 'nhân viên bếp', '6800000', '0956781234', 'Thanh Hóa', 'hoangthilan@gmail.com'),
('NV10', 'Nguyễn Văn Hùng', '35', 'nam', 'nhân viên bếp', '9000000', '0934567890', 'Bắc Ninh', 'nguyenvanhung@gmail.com'),
('NV11', 'Phan Thị Minh', '33', 'nữ', 'nhân viên bếp', '8500000', '0912346789', 'Thái Bình', 'phanthiminh@gmail.com'),
('NV12', 'Trịnh Văn Kiên', '28', 'nam', 'nhân viên bếp', '9500000', '0909876543', 'Quảng Ninh', 'trinhvankien@gmail.com'),
('NV13', 'Ngô Thị Liên', '32', 'nữ', 'nhân viên bếp', '7200000', '0987654321', 'Nam Định', 'ngothilien@gmail.com'),
('NV14', 'Đặng Văn Nam', '29', 'nam', 'nhân viên bếp', '7000000', '0941234567', 'Hà Nội', 'dangvannam@gmail.com'),
('NV15', 'Lý Thị Nga', '27', 'nữ', 'nhân viên bếp', '8000000', '0954321765', 'Phú Thọ', 'lythinga@gmail.com'),
('NV16', 'Nguyễn Văn An', '25', 'nam', 'nhân viên bếp', '9000000', '0987654321', 'Hà Nội', 'nguyenvanan@gmail.com'),
('NV17', 'Trần Thị Bích', '28', 'nữ', 'nhân viên bếp', '7000000', '0912345678', 'Hải Phòng', 'tranthibich@gmail.com'),
('NV18', 'Lê Văn Cường', '30', 'nam', 'nhân viên bếp', '8500000', '0901234567', 'Đà Nẵng', 'levancuong@example.com'),
('NV19', 'Trần Văn Bình', '29', 'nam', 'lễ tân', '9000000', '0901234561', 'Hà Nội', 'tranvanbinh@gmail.com'),
('NV20', 'Nguyễn Thị Cúc', '27', 'nữ', 'lễ tân', '8000000', '0901234562', 'Hồ Chí Minh', 'nguyenthicuc@gmail.com'),
('NV21', 'Lê Văn Dũng', '30', 'nam', 'lễ tân', '8500000', '0901234563', 'Đà Nẵng', 'levandung@gmail.com'),
('NV22', 'Phạm Thị Hạnh', '25', 'nữ', 'lễ tân', '7000000', '0901234564', 'Hải Phòng', 'phamthihanh@gmail.com'),
('NV23', 'Bùi Văn Hùng', '31', 'nam', 'lễ tân', '9500000', '0901234565', 'Ninh Bình', 'buivanhung@gmail.com'),
('NV24', 'Đỗ Thị Lan', '26', 'nữ', 'lễ tân', '7500000', '0901234566', 'Hà Nam', 'dothilan@gmail.com'),
('NV25', 'Hoàng Văn Minh', '28', 'nam', 'lễ tân', '8200000', '0901234567', 'Thanh Hóa', 'hoangvanminh@gmail.com'),
('NV26', 'Vũ Thị Ngọc', '32', 'nữ', 'lễ tân', '9200000', '0901234568', 'Thái Bình', 'vuthingoc@gmail.com'),
('NV27', 'Lý Văn Phúc', '29', 'nam', 'lễ tân', '8800000', '0901234569', 'Nam Định', 'lyvanphuc@gmail.com'),
('NV28', 'Phan Thị Quỳnh', '24', 'nữ', 'lễ tân', '6900000', '0901234570', 'Bắc Ninh', 'phanthiquynh@gmail.com'),
('NV29', 'Trịnh Văn Sơn', '33', 'nam', 'lễ tân', '9700000', '0901234571', 'Hải Dương', 'trinhvanson@gmail.com'),
('NV30', 'Ngô Thị Thảo', '27', 'nữ', 'lễ tân', '8100000', '0901234572', 'Phú Thọ', 'ngothithao@gmail.com'),
('NV31', 'Đặng Văn Tú', '26', 'nam', 'lễ tân', '7300000', '0901234573', 'Hà Nội', 'dangvantu@gmail.com'),
('NV32', 'Lê Thị Uyên', '28', 'nữ', 'lễ tân', '8300000', '0901234574', 'Hải Phòng', 'lethiuyen@gmail.com'),
('NV33', 'Phạm Văn Vinh', '35', 'nam', 'lễ tân', '9200000', '0901234575', 'Quảng Ninh', 'phamvanvinh@gmail.com'),
('NV34', 'Nguyễn Văn Quang', '26', 'nam', 'phục vụ', '8000000', '0912345678', 'Hà Nội', 'nguyenvanquang@gmail.com'),
('NV35', 'Trần Thị Hương', '25', 'nữ', 'phục vụ', '7500000', '0912345679', 'Hải Phòng', 'tranthihuong@gmail.com'),
('NV36', 'Lê Văn Tâm', '29', 'nam', 'phục vụ', '8200000', '0912345680', 'Đà Nẵng', 'levantam@gmail.com'),
('NV37', 'Phạm Thị Mai', '27', 'nữ', 'phục vụ', '7800000', '0912345681', 'Hà Nam', 'phamthimai@gmail.com'),
('NV38', 'Bùi Văn Việt', '30', 'nam', 'phục vụ', '8500000', '0912345682', 'Ninh Bình', 'buivanviet@gmail.com'),
('NV39', 'Đỗ Thị Nhung', '28', 'nữ', 'phục vụ', '7300000', '0912345683', 'Thanh Hóa', 'dothinhung@gmail.com'),
('NV40', 'Hoàng Văn Đức', '31', 'nam', 'phục vụ', '8700000', '0912345684', 'Thái Bình', 'hoangvanduc@gmail.com'),
('NV41', 'Vũ Thị Ánh', '26', 'nữ', 'phục vụ', '7500000', '0912345685', 'Nam Định', 'vuthianh@gmail.com'),
('NV42', 'Lý Văn Bình', '32', 'nam', 'phục vụ', '9000000', '0912345686', 'Bắc Ninh', 'lyvanbinh@gmail.com'),
('NV43', 'Phan Thị Cẩm', '24', 'nữ', 'phục vụ', '7200000', '0912345687', 'Hải Dương', 'phanthicam@gmail.com'),
('NV44', 'Trịnh Văn Đạt', '29', 'nam', 'phục vụ', '8300000', '0912345688', 'Phú Thọ', 'trinhvandat@gmail.com'),
('NV45', 'Ngô Thị Hiền', '27', 'nữ', 'phục vụ', '7600000', '0912345689', 'Hà Nội', 'ngothihien@gmail.com'),
('NV46', 'Đặng Văn Lâm', '30', 'nam', 'phục vụ', '8200000', '0912345690', 'Hải Phòng', 'dangvanlam@gmail.com'),
('NV47', 'Lê Thị Ngân', '25', 'nữ', 'phục vụ', '7700000', '0912345691', 'Quảng Ninh', 'lethingan@gmail.com'),
('NV48', 'Phạm Văn Khoa', '33', 'nam', 'phục vụ', '9200000', '0912345692', 'Hà Nội', 'phamvankhoa@gmail.com'),
('NV49', 'Nguyễn Thị Oanh', '28', 'nữ', 'phục vụ', '8000000', '0912345693', 'Hải Phòng', 'nguyenthioanh@gmail.com'),
('NV50', 'Nguyễn Văn Khải', '25', 'nam', 'dọn phòng', '7500000', '0912345700', 'Hà Nội', 'nguyenvankhai@gmail.com'),
('NV51', 'Trần Thị Thu', '28', 'nữ', 'dọn phòng', '8000000', '0912345701', 'Hải Phòng', 'tranthithu@gmail.com'),
('NV52', 'Lê Văn Lực', '30', 'nam', 'dọn phòng', '8200000', '0912345702', 'Đà Nẵng', 'levanluc@gmail.com'),
('NV53', 'Phạm Thị Tuyết', '26', 'nữ', 'dọn phòng', '7800000', '0912345703', 'Hà Nam', 'phamthituyet@gmail.com'),
('NV54', 'Bùi Văn Tâm', '29', 'nam', 'dọn phòng', '8100000', '0912345704', 'Ninh Bình', 'buivantam@gmail.com'),
('NV55', 'Đỗ Thị Hằng', '27', 'nữ', 'dọn phòng', '7300000', '0912345705', 'Thanh Hóa', 'dothihang@gmail.com'),
('NV56', 'Hoàng Văn Hùng', '31', 'nam', 'dọn phòng', '8500000', '0912345706', 'Thái Bình', 'hoangvanhung@gmail.com'),
('NV57', 'Vũ Thị Mai', '24', 'nữ', 'dọn phòng', '7000000', '0912345707', 'Nam Định', 'vuthimai@gmail.com'),
('NV58', 'Lý Văn Phong', '32', 'nam', 'dọn phòng', '8900000', '0912345708', 'Bắc Ninh', 'lyvanphong@gmail.com'),
('NV59', 'Phan Thị Dương', '25', 'nữ', 'dọn phòng', '7200000', '0912345709', 'Hải Dương', 'phanthiduong@gmail.com'),
('NV60', 'Trịnh Văn Lộc', '29', 'nam', 'dọn phòng', '8300000', '0912345710', 'Phú Thọ', 'trinhvanloc@gmail.com'),
('NV61', 'Ngô Thị Yến', '27', 'nữ', 'dọn phòng', '7600000', '0912345711', 'Hà Nội', 'ngothiyen@gmail.com'),
('NV62', 'Đặng Văn Cường', '28', 'nam', 'dọn phòng', '7900000', '0912345712', 'Hải Phòng', 'dangvancuong@gmail.com'),
('NV63', 'Lê Thị Thanh', '30', 'nữ', 'dọn phòng', '8100000', '0912345713', 'Quảng Ninh', 'lethithanh@gmail.com'),
('NV64', 'Phạm Văn Thành', '34', 'nam', 'dọn phòng', '9200000', '0912345714', 'Hà Nội', 'phamvanthanh@gmail.com'),
('NV65', 'Nguyễn Thị Ngọc', '26', 'nữ', 'dọn phòng', '8000000', '0912345715', 'Hải Phòng', 'nguyenthiongoc@gmail.com'),
('NV66', 'Nguyễn Thị Bích', '40', 'nữ', 'quản lý', '15000000', '0912345716', 'Hà Nội', 'nguyenthibich@gmail.com'),
('NV67', 'Trần Văn Phú', '42', 'nam', 'quản lý', '16000000', '0912345717', 'Hải Phòng', 'tranvanphu@gmail.com'),
('NV68', 'Lê Thị Kim', '38', 'nữ', 'quản lý', '17000000', '0912345718', 'Đà Nẵng', 'lethikim@gmail.com'),
('NV69', 'Phạm Văn Hòa', '45', 'nam', 'quản lý', '18000000', '0912345719', 'Hồ Chí Minh', 'phamvanhoa@gmail.com'),
('NV70', 'Bùi Thị Thanh', '39', 'nữ', 'quản lý', '19000000', '0912345720', 'Ninh Bình', 'buithithanh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', '12345'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_number` varchar(20) NOT NULL,
  `availability` varchar(20) NOT NULL,
  `clean_status` varchar(20) NOT NULL,
  `price` varchar(20) NOT NULL,
  `bed_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_number`, `availability`, `clean_status`, `price`, `bed_type`) VALUES
('p200', 'phòng đơn', 'Trống', '500000', 'việt nam đồng'),
('p201', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p202', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p203', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p204', 'phòng đơn', 'Trống', '500000', 'việt nam đồng'),
('p205', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p206', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p207', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p208', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p209', 'phòng đơn', 'trống', '500000', 'việt nam đồng'),
('p300', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p301', 'phòng đôi', 'có khách', '800000', 'việt nam đồng'),
('p302', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p303', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p304', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p305', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p306', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p307', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p308', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p309', 'phòng đôi', 'trống', '800000', 'việt nam đồng'),
('p400', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p401', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p402', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p403', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p404', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p405', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p406', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p407', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p408', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p409', 'phòng vip đơn', 'trống', '1500000', 'việt nam đồng'),
('p500', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p501', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p502', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p503', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p504', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p505', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p506', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p507', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p508', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p509', 'phòng vip đôi', 'trống', '2000000', 'việt nam đồng'),
('p800', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p801', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p802', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p803', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p804', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p805', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p806', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p807', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p808', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng'),
('p809', 'phòng tổng thống', 'trống', '5000000', 'việt nam đồng');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `check_room`
--
ALTER TABLE `check_room`
  ADD PRIMARY KEY (`id`),
  ADD KEY `room_number` (`room_number`),
  ADD KEY `id_customer` (`id_customer`);

--
-- Indexes for table `check_ser`
--
ALTER TABLE `check_ser`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idDriver` (`idDriver`),
  ADD KEY `id_customer` (`id_customer`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`idDriver`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_number`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `check_room`
--
ALTER TABLE `check_room`
  ADD CONSTRAINT `check_room_ibfk_1` FOREIGN KEY (`room_number`) REFERENCES `room` (`room_number`),
  ADD CONSTRAINT `check_room_ibfk_2` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`);

--
-- Constraints for table `check_ser`
--
ALTER TABLE `check_ser`
  ADD CONSTRAINT `check_ser_ibfk_1` FOREIGN KEY (`idDriver`) REFERENCES `driver` (`idDriver`),
  ADD CONSTRAINT `check_ser_ibfk_2` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jun 2020 pada 05.09
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gaji`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `gaji`
--

CREATE TABLE `gaji` (
  `No.Karyawan` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Nama Karyawan` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Alamat Karyawan` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Pelanggan Perhari` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Gaji Perhari` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Masuk Perbulan` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Gaji Perbulan` varchar(50) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `gaji`
--

INSERT INTO `gaji` (`No.Karyawan`, `Nama Karyawan`, `Alamat Karyawan`, `Pelanggan Perhari`, `Gaji Perhari`, `Masuk Perbulan`, `Gaji Perbulan`) VALUES
('001', 'Arman', 'Jl.Sumatra', '6 orang', '50.000', '12 hari', '600.000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

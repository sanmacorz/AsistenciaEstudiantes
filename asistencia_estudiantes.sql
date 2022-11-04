-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 24, 2022 at 05:12 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `asistencia_estudiantes`
--

-- --------------------------------------------------------

--
-- Table structure for table `asistencias_22948`
--

CREATE TABLE `asistencias_22948` (
  `id_asistencia` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `asistencia_1` tinyint(1) NOT NULL,
  `asistencia_2` tinyint(1) NOT NULL,
  `asistencia_3` tinyint(1) NOT NULL,
  `asistencia_4` tinyint(1) NOT NULL,
  `asistencia_5` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `asistencias_22948`
--

INSERT INTO `asistencias_22948` (`id_asistencia`, `id_estudiante`, `asistencia_1`, `asistencia_2`, `asistencia_3`, `asistencia_4`, `asistencia_5`) VALUES
(1, 2224503, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `asistencias_22951`
--

CREATE TABLE `asistencias_22951` (
  `id_asistencia` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `asistencia_1` tinyint(1) NOT NULL,
  `asistencia_2` tinyint(1) NOT NULL,
  `asistencia_3` tinyint(1) NOT NULL,
  `asistencia_4` tinyint(1) NOT NULL,
  `asistencia_5` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `asistencias_22951`
--

INSERT INTO `asistencias_22951` (`id_asistencia`, `id_estudiante`, `asistencia_1`, `asistencia_2`, `asistencia_3`, `asistencia_4`, `asistencia_5`) VALUES
(1, 2224503, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `estudiantes`
--

CREATE TABLE `estudiantes` (
  `id_estudiante` int(11) NOT NULL,
  `nombres` text NOT NULL,
  `apellidos` text NOT NULL,
  `materia` int(11) NOT NULL,
  `matriculado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `estudiantes`
--

INSERT INTO `estudiantes` (`id_estudiante`, `nombres`, `apellidos`, `materia`, `matriculado`) VALUES
(2224503, 'Santiago', 'Macías Corzo', 22951, 0);

-- --------------------------------------------------------

--
-- Table structure for table `grupos`
--

CREATE TABLE `grupos` (
  `id_grupo` int(11) NOT NULL,
  `id_profesor` int(11) DEFAULT NULL,
  `id_clase` int(11) DEFAULT NULL,
  `nombre_clase` text DEFAULT NULL,
  `grupo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grupos`
--

INSERT INTO `grupos` (`id_grupo`, `id_profesor`, `id_clase`, `nombre_clase`, `grupo`) VALUES
(1, 4518, 22948, 'FUNDAMENTOS DE PROGRAMACION', 'S1');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id_profesor` int(11) NOT NULL,
  `nombres` text NOT NULL,
  `apellidos` text NOT NULL,
  `contraseña` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id_profesor`, `nombres`, `apellidos`, `contraseña`) VALUES
(4518, 'Nestor Jesús', 'Páez Sarmiento', 'programar123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asistencias_22948`
--
ALTER TABLE `asistencias_22948`
  ADD PRIMARY KEY (`id_asistencia`),
  ADD KEY `estudiantes_22948` (`id_estudiante`);

--
-- Indexes for table `asistencias_22951`
--
ALTER TABLE `asistencias_22951`
  ADD PRIMARY KEY (`id_asistencia`),
  ADD KEY `estudiantes_22951` (`id_estudiante`);

--
-- Indexes for table `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id_estudiante`);

--
-- Indexes for table `grupos`
--
ALTER TABLE `grupos`
  ADD PRIMARY KEY (`id_grupo`),
  ADD KEY `Profesores` (`id_profesor`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_profesor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asistencias_22948`
--
ALTER TABLE `asistencias_22948`
  MODIFY `id_asistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `asistencias_22951`
--
ALTER TABLE `asistencias_22951`
  MODIFY `id_asistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `grupos`
--
ALTER TABLE `grupos`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `asistencias_22948`
--
ALTER TABLE `asistencias_22948`
  ADD CONSTRAINT `estudiantes_22948` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiantes` (`id_estudiante`);

--
-- Constraints for table `asistencias_22951`
--
ALTER TABLE `asistencias_22951`
  ADD CONSTRAINT `estudiantes_22951` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiantes` (`id_estudiante`);

--
-- Constraints for table `grupos`
--
ALTER TABLE `grupos`
  ADD CONSTRAINT `Profesores` FOREIGN KEY (`id_profesor`) REFERENCES `usuarios` (`id_profesor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

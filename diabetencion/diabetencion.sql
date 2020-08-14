-- phpMyAdmin SQL Dump
-- version 4.4.15.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 14, 2020 at 03:17 PM
-- Server version: 5.5.46
-- PHP Version: 5.4.45

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diabetencion`
--

-- --------------------------------------------------------

--
-- Table structure for table `complicacionespacientes`
--

CREATE TABLE `complicacionespacientes` (
  `cedula` varchar(20) NOT NULL,
  `V` varchar(2) NOT NULL,
  `R` varchar(2) NOT NULL,
  `CV` varchar(2) NOT NULL,
  `N` varchar(2) NOT NULL,
  `PD` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `medicamentos`
--

CREATE TABLE `medicamentos` (
  `cedula` varchar(20) NOT NULL,
  `ins_n` varchar(10) NOT NULL,
  `ins_r` varchar(10) NOT NULL,
  `ins_7030` varchar(10) NOT NULL,
  `analogo_corta` varchar(10) NOT NULL,
  `analogo_larga` varchar(10) NOT NULL,
  `analogo_7525` varchar(10) NOT NULL,
  `glimenclamida` varchar(10) NOT NULL,
  `metformina` varchar(10) NOT NULL,
  `enalapril` varchar(10) NOT NULL,
  `amlodipina` varchar(10) NOT NULL,
  `sivastatina` varchar(10) NOT NULL,
  `otros_medicamentos` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `pacientes`
--

CREATE TABLE `pacientes` (
  `cedula` varchar(20) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `edad` varchar(10) NOT NULL,
  `sexo` varchar(6) NOT NULL,
  `tipo_diabetes` varchar(20) NOT NULL,
  `hta` varchar(20) NOT NULL,
  `dislipidemia` varchar(20) NOT NULL,
  `masa_corporal` varchar(20) NOT NULL,
  `hba1c` varchar(20) NOT NULL,
  `glucometro` varchar(20) NOT NULL,
  `suma_sensor` varchar(20) NOT NULL,
  `inyectadoras` varchar(20) NOT NULL,
  `direccion_paciente` varchar(50) NOT NULL,
  `tipo_paciente` varchar(20) NOT NULL,
  `fecha_dx` varchar(10) NOT NULL,
  `enfermedad_asociada` varchar(30) NOT NULL,
  `establecimiento_control` varchar(50) NOT NULL,
  `establecimiento_municipio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(20) NOT NULL,
  `contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `contraseña`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complicacionespacientes`
--
ALTER TABLE `complicacionespacientes`
  ADD PRIMARY KEY (`cedula`);

--
-- Indexes for table `medicamentos`
--
ALTER TABLE `medicamentos`
  ADD PRIMARY KEY (`cedula`);

--
-- Indexes for table `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `complicacionespacientes`
--
ALTER TABLE `complicacionespacientes`
  ADD CONSTRAINT `complicacionespacientes_ibfk_1` FOREIGN KEY (`cedula`) REFERENCES `pacientes` (`cedula`);

--
-- Constraints for table `medicamentos`
--
ALTER TABLE `medicamentos`
  ADD CONSTRAINT `medicamentos_ibfk_1` FOREIGN KEY (`cedula`) REFERENCES `pacientes` (`cedula`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

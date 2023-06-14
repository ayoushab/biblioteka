-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema biblioteka
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema biblioteka
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biblioteka` DEFAULT CHARACTER SET utf8 ;
USE `biblioteka` ;

-- -----------------------------------------------------
-- Table `biblioteka`.`dodajclan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`dodajclan` (
  `cid` VARCHAR(20) NOT NULL,
  `ime` VARCHAR(50) NOT NULL,
  `prezime` VARCHAR(15) NOT NULL,
  `pol` VARCHAR(1) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `brojtel` INT(20) NOT NULL,
  `tip` VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteka`.`dodajknjigu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`dodajknjigu` (
  `kid` VARCHAR(50) NOT NULL,
  `naziv` VARCHAR(50) NOT NULL,
  `sifra` VARCHAR(50) NOT NULL,
  `kategorija` VARCHAR(25) NOT NULL,
  `autor` VARCHAR(25) NOT NULL,
  `godina` VARCHAR(25) NOT NULL,
  `tip` VARCHAR(50) NOT NULL,
  `cena` VARCHAR(50) NULL DEFAULT NULL,
  `ozn` INT(20) NOT NULL,
  PRIMARY KEY (`kid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteka`.`iznajmljivanje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`iznajmljivanje` (
  `iznaid` VARCHAR(25) NOT NULL,
  `cid` VARCHAR(25) NOT NULL,
  `kid` VARCHAR(25) NOT NULL,
  `datumuzimanje` VARCHAR(20) NOT NULL,
  `datumvrac` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`iznaid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteka`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`login` (
  `ID` INT(11) NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteka`.`usernames`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`usernames` (
  `ime` VARCHAR(50) NOT NULL,
  `prezime` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteka`.`vratiknjigu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteka`.`vratiknjigu` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `kid` VARCHAR(25) NOT NULL,
  `cid` VARCHAR(20) NOT NULL,
  `zakdat` VARCHAR(10) NOT NULL,
  `ur` VARCHAR(25) NOT NULL,
  `ozn` INT(10) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

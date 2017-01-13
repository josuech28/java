CREATE SCHEMA `SoccrerResult` ;

/* League TABLE */
CREATE TABLE `SoccrerResult`.`League` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(250) NULL,
  PRIMARY KEY (`id`));

/* Teams  Table*/
CREATE TABLE `SoccrerResult`.`Team` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `league` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `league_idx` (`league` ASC),
  CONSTRAINT `league`
    FOREIGN KEY (`league`)
    REFERENCES `SoccrerResult`.`League` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

  /*  Table Player*/
CREATE TABLE `SoccrerResult`.`Player` (
  `id` VARCHAR(45) NOT NULL,
  `matchPlayed` INT NOT NULL,
  `matchWon` INT NOT NULL,
  `matchLost` INT NOT NULL,
  `matchTied` INT NOT NULL,
  `goalFavor` INT NOT NULL,
  `goalAgainst` INT NOT NULL,
  PRIMARY KEY (`id`));

/* Match Table  */
CREATE TABLE `SoccrerResult`.`new_table` (
  `id` INT NOT NULL,
  `homePlayer` VARCHAR(20) NOT NULL,
  `awayPlayer` VARCHAR(20) NOT NULL,
  `homeGoal` INT NOT NULL,
  `awayGoal` INT NOT NULL,
  `homeTeam` INT NOT NULL,
  `awayTeam` INT NOT NULL,
  `homeLeague` INT NOT NULL,
  `awayLeague` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `homePlayer_idx` (`homePlayer` ASC),
  INDEX `awayPlayer_idx` (`awayPlayer` ASC),
  INDEX `homeTeam_idx` (`homeTeam` ASC),
  INDEX `awayTeam_idx` (`awayTeam` ASC),
  INDEX `homeLeague_idx` (`homeLeague` ASC),
  INDEX `awayLeague_idx` (`awayLeague` ASC),
  CONSTRAINT `homePlayer`
    FOREIGN KEY (`homePlayer`)
    REFERENCES `SoccrerResult`.`Player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `awayPlayer`
    FOREIGN KEY (`awayPlayer`)
    REFERENCES `SoccrerResult`.`Player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `homeTeam`
    FOREIGN KEY (`homeTeam`)
    REFERENCES `SoccrerResult`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `awayTeam`
    FOREIGN KEY (`awayTeam`)
    REFERENCES `SoccrerResult`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `homeLeague`
    FOREIGN KEY (`homeLeague`)
    REFERENCES `SoccrerResult`.`League` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `awayLeague`
    FOREIGN KEY (`awayLeague`)
    REFERENCES `SoccrerResult`.`League` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



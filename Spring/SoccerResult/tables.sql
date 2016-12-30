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
  `id` INT NOT NULL,
  `idHomePlayer` VARCHAR(20) NOT NULL,
  `idAwayPlayer` VARCHAR(20) NOT NULL,
  `homeGoal` INT NOT NULL,
  `awayGoal` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idHomePlayer_idx` (`idHomePlayer` ASC),
  INDEX `idAwayPlayer_idx` (`idAwayPlayer` ASC),
  CONSTRAINT `idHomePlayer`
    FOREIGN KEY (`idHomePlayer`)
    REFERENCES `SoccrerResult`.`Player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idAwayPlayer`
    FOREIGN KEY (`idAwayPlayer`)
    REFERENCES `SoccrerResult`.`Player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



CREATE TABLE `indragt3`.`employees` (
  `employee_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone_int` VARCHAR(45) NULL,
  `hire_date` DATE NULL,
  `job_id` VARCHAR(45) NOT NULL,
  `salary` INT NULL,
  `comission_pct` INT NULL,
  `manager_id` INT NULL,
  `department_id` INT NULL,
  `bonus` VARCHAR(45) NULL,
  PRIMARY KEY (`employee_id`),
  INDEX `email_unique` (`email` ASC) VISIBLE);

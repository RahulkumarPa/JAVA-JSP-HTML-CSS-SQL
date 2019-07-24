/*
Name:	Rahulkumar Patel
File:	students.sql
Date:	25 Jan 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS students CASCADE;

CREATE TABLE students(
	id bigint PRIMARY KEY REFERENCES users(id),
	programCode  VARCHAR(6) NOT NULL,
	programDescription VARCHAR(70) NOT NULL,
	year  SMALLINT NOT NULL
	
);
ALTER TABLE students OWNER TO webd4201_admin ;

INSERT INTO students(id,programCode,programDescription,year) VALUES(
	'100680118',
	'CSTY',
	'Computer Prommering',
	'2');

INSERT INTO students(id,programCode,programDescription,year) VALUES(
	'100111111',
	'CSTY',
	'Computer System Technology',
	'3');

INSERT INTO students(id,programCode,programDescription,year) VALUES(
	'100680112',
	'CSTY',
	'Computer System Technology',
	'2');
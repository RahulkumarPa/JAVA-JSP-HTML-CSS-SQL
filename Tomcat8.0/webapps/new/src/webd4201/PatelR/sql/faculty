/*
Name:	Rahulkumar Patel
File:	faculty.sql
Date:	25 Jan 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS faculty CASCADE;

-- To CREATE the table, 
CREATE TABLE faculty(
	id bigint PRIMARY KEY  REFERENCES users(id) ,
	schoolCode VARCHAR(6) NOT NULL,
	schoolDescription VARCHAR(70) NOT NULL,
	office VARCHAR(20) NOT NULL,
	extension VARCHAR(5) NOT NULL
);
ALTER TABLE faculty OWNER TO webd4201_admin ;

INSERT INTO faculty(id,schoolCode,schoolDescription,office,extension) VALUES(
	'100681561',
	'SET',
	'School of Science & Engineering Technology',
	'H-12',
	'0012');

INSERT INTO faculty(id,schoolCode,schoolDescription,office,extension) VALUES(
	'112045687',
	'SET',
	'School of Science & Engineering Technology',
	'H-18',
	'0018');

INSERT INTO faculty(id,schoolCode,schoolDescription,office,extension) VALUES(
	'111546256',
	'BITM',
	'School of Business, IT & Management',
	'H-115',
	'0115');
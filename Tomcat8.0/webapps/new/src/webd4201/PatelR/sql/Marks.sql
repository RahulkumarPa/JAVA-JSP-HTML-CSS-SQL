/*
Name:	Rahulkumar Patel
File:	Marks.sql
Date:	20 Fab 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS Marks CASCADE;

-- To CREATE the table, 
CREATE TABLE Marks(
	id bigint PRIMARY KEY  REFERENCES users(id) ,
	courseCode VARCHAR(6) NOT NULL,
	courseName VARCHAR(70) NOT NULL,
	gpaWeighting VARCHAR(4) NOT NULL,
	result VARCHAR(5) NOT NULL
);
ALTER TABLE Marks OWNER TO webd4201_admin ;

INSERT INTO Marks(id,courseCode,courseName,gpaWeighting,result) VALUES(
	'100681561',
	'WEBD',
	'School of Science & Engineering Technology',
	'H12',
	'0012');

INSERT INTO Marks(id,courseCode,courseName,gpaWeighting,result) VALUES(
	'112045687',
	'NETD',
	'School of Science & Engineering Technology',
	'H18',
	'0018');

INSERT INTO Marks(id,courseCode,courseName,gpaWeighting,result) VALUES(
	'111546256',
	'OOP',
	'School of Business, IT & Management',
	'H115',
	'0115');
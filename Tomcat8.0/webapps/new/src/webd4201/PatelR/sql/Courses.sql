/*
Name:	Rahulkumar Patel
File:	Courses.sql
Date:	20 Fab 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS Courses CASCADE;

-- To CREATE the table, 
CREATE TABLE Courses(
	id bigint PRIMARY KEY  REFERENCES users(id) ,
	courseCode VARCHAR(6) NOT NULL,
	courseName VARCHAR(70) NOT NULL);
ALTER TABLE Courses OWNER TO webd4201_admin ;

INSERT INTO Courses(id,courseCode,courseName) VALUES(
	'100681561',
	'WEBD',
	'School of Science & Engineering Technology');

INSERT INTO Courses(id,courseCode,courseName) VALUES(
	'112045687',
	'NETD',
	'School of Science & Engineering Technology');

INSERT INTO Courses(id,courseCode,courseName) VALUES(
	'111546256',
	'OOP',
	'School of Business, IT & Management');
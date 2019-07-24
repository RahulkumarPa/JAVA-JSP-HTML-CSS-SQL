/*
Name:	Rahulkumar Patel
File:	Programs.sql
Date:	20 Fab 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS Programs CASCADE;


CREATE TABLE Programs
(
     ProgramCode VARCHAR(5) PRIMARY KEY,
     ProgramDescription VARCHAR(50) NOT NULL,
     SchoolCode VARCHAR(2) NOT NULL,    
     DiplomaCode VARCHAR(10) NOT NULL
);
ALTER TABLE Programs OWNER TO webd4201_admin ;

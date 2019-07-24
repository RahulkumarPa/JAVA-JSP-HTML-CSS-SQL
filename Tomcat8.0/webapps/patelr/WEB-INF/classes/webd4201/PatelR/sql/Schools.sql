/*
Name:	Rahulkumar Patel
File:	Schools.sql
Date:	20 Fab 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data
DROP TABLE IF EXISTS Schools CASCADE;


CREATE TABLE Schools
(
     SchoolCode VARCHAR(2) NOT NULL,    
     SchoolDescription VARCHAR(50) NOT NULL
);
ALTER TABLE Schools OWNER TO webd4201_admin ;

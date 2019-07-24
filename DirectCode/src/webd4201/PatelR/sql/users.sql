/*
Name:	Rahulkumar Patel
File:	users.sql
Date:	25 Jan 2019
Course:	WEBD4201
*/
-- To DROP the table and clear out any existing data

DROP TABLE IF EXISTS users CASCADE;
CREATE EXTENSION IF NOT EXISTS pgcrypto;

-- To CREATE the table, 
CREATE TABLE users(
	id bigint PRIMARY KEY,
	password VARCHAR(40) NOT NULL,
	firstname VARCHAR(30) NOT NULL,
	lastname VARCHAR(30) NOT NULL,
	emailaddress VARCHAR(255) NOT NULL,
	enable BOOLEAN NOT NULL,
	enroldate DATE NOT NULL,
	lastaccess DATE NOT  NULL,
	type char(1) NOT NUll
);
ALTER TABLE users OWNER TO webd4201_admin ;

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100680118',
	ENCODE(digest('password','sha1'),'hex'),
	'Rahulkumar',
	'Patel',
	'Rahulkumarpatel@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	's'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100111111',
	 ENCODE(digest('password','sha1'),'hex'),
	'Mike',
	'Jones ',
	'MaganlalBhosad@gmail.com',
	'true',
	'11-Sep-2015',
	'2019-01-20',
	's'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100680112',
	 ENCODE(digest('password','sha1'),'hex'),
	'Diku',
	'Gando',
	'Dikugando@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	's'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100681561',
	ENCODE(digest('password','sha1'),'hex'),
	'Navinkumar',
	'Nagarvel',
	'Navinukmarnagarvel@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	'f'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type)  
VALUES
(
	'111546256',
	 ENCODE(digest('password','sha1'),'hex'),
	'Lagesh',
	'Lukhesh',
	'Lageshlukhesh@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	'f'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'112045687',
	ENCODE(digest('password','sha1'),'hex'),
	'Jay',
	'Mataji',
	'jayMataji@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	'f'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100111110',
	ENCODE(digest('password','sha1'),'hex'),
	'Mike',
	'Mataji',
	'MikeMataji@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	'f'
);

INSERT INTO users(id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) 
VALUES
(
	'100111114',
	ENCODE(digest('password','sha1'),'hex'),
	'Dipak',
	'Mataji',
	'DipakMataji@gmail.com',
	'true',
	'2018-10-01',
	'2019-01-20',
	'f'
);

SELECT * FROM users;
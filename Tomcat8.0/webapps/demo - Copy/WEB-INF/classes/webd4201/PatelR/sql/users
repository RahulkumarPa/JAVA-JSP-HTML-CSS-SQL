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
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	email_address VARCHAR(255) NOT NULL,
	enabled BOOLEAN NOT NULL,
	enrol_date DATE NOT NULL,
	last_access DATE NOT  NULL,
	type char(1) NOT NUll
);
ALTER TABLE users OWNER TO webd4201_admin ;

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type) 
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

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type)
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

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type) 
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

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type)
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

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type) 
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

INSERT INTO users(id, password,first_name,last_name, email_address,enabled,enrol_date,last_access,type)
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

SELECT * FROM users;
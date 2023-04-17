/* multi line
comment */
-- single line comment (minus minus space)

-- creating table

CREATE TABLE persons(
	personID int,
    lastName varchar(100),
    -- (100) atļauj tekstu ar 100 simboliem
    firstName varchar(100),
    address varchar(255),
    city varchar(50),
    -- to specify which coloumn will be our primary key
    PRIMARY KEY (personID)
);

-- Delete table

DROP TABLE persons;
-- DROP TABLE IF EXISTS persons;


-- insert data in the table
INSERT INTO persons (personID, lastName, firstName, address, city)
VALUES (1000, 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480', 'Florida');

-- to insert short data; only works if there are all fields filled
INSERT INTO persons VALUES (1001, 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114', 'Florida');

-- to insert partial data
INSERT INTO persons (personID, lastName, firstName) VALUES (1002, 'Biden', 'Joe');

INSERT INTO persons (personID, lastName, firstName) VALUES (1003, 'George W.', 'Bush'); 


-- to view table data
SELECT * FROM persons;

-- to see individual coloumns
SELECT lastName, city FROM persons;

-- filter out only specific values
SELECT lastName, city FROM persons WHERE city = 'Florida';
SELECT lastName, city FROM persons WHERE city = 'NY';

-- update data
UPDATE persons SET address = '120 E 14th St, New York, NY 10003, USA' WHERE personId = 1003;

-- to delete specific data
DELETE FROM persons WHERE personID = 1002;

CREATE TABLE users(
-- to put extra settings
userID int PRIMARY KEY NOT NULL AUTO_INCREMENT,
-- not null - prasam vērtību, ja nav vērtība šajā laukā, tad neļauj pievienot rindu (manditory and optional fields)
-- auto_increment - for primary fields - automātiski piešķir ID palielinot par viens

userName varchar(45) NOT NULL,
password varchar(45) NOT NULL,
fullName varchar(100) NOT NULL,
email varchar(45)
);

INSERT INTO users (username, password, fullname, email)
VALUES ('trumwall', 'mexico', 'Donald Trump', 'maga@gmail.com');

INSERT INTO users (username, password, fullname)
VALUES ('joeRogan', '12345678', ' Joe Rogan');

INSERT INTO users (username, password, email)
VALUES ('Obama333', '123', 'obama@gmail.com');

INSERT INTO users (username, password, email, fullname)
VALUES ('Obama333', '123', 'obama@gmail.com', 'Barack Obama');
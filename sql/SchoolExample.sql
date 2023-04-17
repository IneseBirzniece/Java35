CREATE TABLE students(
	sid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;

CREATE TABLE teachers(
	tid int NOT NULL PRIMARY KEY,
	name text NOT NULL
);

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;
drop table teachers;

CREATE TABLE subjects(
	subid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;

CREATE TABLE grades(
studentID int NOT NULL REFERENCES students(sid),
-- this is how we create key using different table
teacherID int NOT NULL REFERENCES teachers(tid),
subjectID int NOT NULL REFERENCES subjects(subid),
grade int NOT NULL,
-- we have to set primary key for this table as well
-- in this case combination of sid, tid and subid will be unique - so we can uses that as a primary key
primary key (studentID, teacherID, subjectID)
);

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;

-- students in order by names
select * from students order by name asc;

-- Simons grade in History
select grade from grades where studentID = 1 and subjectID = 1;

-- select subquery - to see the names for all students who hasn't any grade in grades table; to read information from two tables
select name from students where sid not in (select studentID from grades);

-- select students who have at least one grade

select name from students where sid in (select studentID from grades);

select name from teachers where tid not in (select teacherID from grades);


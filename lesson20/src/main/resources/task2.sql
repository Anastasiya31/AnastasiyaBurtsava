use
students;

CREATE TABLE `groups`
(
    group_ID integer NOT NULL,
    name     VARCHAR(100),
    PRIMARY KEY (group_ID)
);

CREATE TABLE student
(
    student_ID integer NOT NULL,
    name       char(100),
    rating     float DEFAULT 0.0,
    group_ID   integer,
    PRIMARY KEY (student_ID)
);

CREATE TABLE course
(
    course_ID integer NOT NULL,
    name      char(100),
    PRIMARY KEY (course_ID)
);


CREATE TABLE studentscources
(
    id         integer NOT NULL,
    course_ID  integer,
    student_ID integer,
    PRIMARY KEY (id)
);

INSERT INTO `groups` (group_ID, name)
VALUES (1, "e01");
INSERT INTO `groups` (group_ID, name)
VALUES (2, "e02");
INSERT INTO `groups` (group_ID, name)
VALUES (3, "e03");

INSERT INTO course (course_ID, name)
VALUES (1, "java basic");
INSERT INTO course (course_ID, name)
VALUES (2, "java pro");

INSERT INTO student (student_ID, name, rating, group_ID)
VALUES (1, "nick", 5, 1),
       (2, "tim", 7, 2),
       (3, "jonh", 4, 3),
       (4, "mike", 2, 1),
       (5, "joe", 8, 2),
       (6, "martin", 5, 3),
       (7, "niki", 9, 1),
       (8, "jimi", 6, 2),
       (9, "ante", 6, 3),
       (10, "antun", 6, 1);

INSERT INTO studentscources (id, course_ID, student_ID)
VALUES (1, 1, 1),
       (2, 2, 1),
       (3, 1, 3),
       (4, 2, 3),
       (5, 1, 5),
       (6, 2, 5),
       (7, 1, 7),
       (8, 2, 7),
       (9, 1, 9),
       (10, 2, 9),
       (11, 1, 2),
       (12, 1, 4),
       (13, 1, 6),
       (14, 1, 8),
       (15, 2, 10),
       (16, 1, 1);

-- # 1) наиболее успешного студента
SELECT *
FROM student
WHERE rating = (SELECT MAX(rating) FROM student);
-- # 1) наиболее неуспевающего студента
SELECT *
FROM student
WHERE rating = (SELECT MIN(rating) FROM student);

-- #2) сгруппируйте студентов по группам и посчитайте средний балл гпуппы, выведите на экран название группы, количество студентов и средний балл
SELECT `groups`.name, COUNT(student.name), AVG(rating)
FROM student
         JOIN `groups`
WHERE `groups`.group_ID = student.group_ID
group by student.group_ID;

-- #3) найдите студентов у которых рейтинг выше среднего по группе
SELECT *
FROM student
WHERE rating > (SELECT AVG(rating) FROM student)
order by group_ID;
-- #3) найдите студентов у которых рейтинг выше среднего по курсу
SELECT student.name, rating, course_ID
FROM student
         JOIN studentscources
WHERE student.student_ID = studentscources.student_ID
  AND rating > (SELECT AVG(rating) FROM student)
ORDER BY course_ID;

-- #4) найдите студентов которые посещали только один курс
SELECT *
FROM student
         JOIN studentscources
WHERE student.student_ID = studentscources.student_ID
GROUP BY studentscources.student_ID
HAVING COUNT(*) = 1;

-- #5) выведите наиболее посещаемый курс
SELECT name
FROM course
         JOIN studentscources
WHERE studentscources.course_ID = (SELECT COUNT(studentscources.course_ID) = MAX(studentscources.course_ID))
  AND course.course_ID = studentscources.course_ID
group by name;

-- #6) найдите пожалуйста наиболее часто используемую оценку
SELECT rating
FROM student
GROUP BY rating
ORDER BY count(*)
        DESC LIMIT 1;

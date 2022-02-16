create
database university;
use
university;

create table faculty
(
    faculty_ID integer NOT NULL,
    name       char(100),
    PRIMARY KEY (faculty_ID)
);

create table if not exists department
(
    department_ID
    integer
    NOT
    NULL,
    faculty_ID
    integer,
    name
    varchar
(
    100
),
    PRIMARY KEY
(
    department_ID
),
    FOREIGN KEY
(
    faculty_ID
) REFERENCES faculty
(
    faculty_ID
) on update restrict
  on delete restrict
    );

create table if not exists deanery
(
    deanery_ID
    integer
    NOT
    NULL,
    faculty_ID
    integer,
    name
    varchar
(
    100
),
    PRIMARY KEY
(
    deanery_ID
),
    FOREIGN KEY
(
    faculty_ID
) REFERENCES faculty
(
    faculty_ID
) on update restrict
  on delete restrict
    );

create table if not exists specialty
(
    specialty_ID
    integer
    NOT
    NULL,
    department_ID
    integer,
    faculty_ID
    integer,
    name
    varchar
(
    100
),
    specialty_code int,
    PRIMARY KEY
(
    specialty_ID
),
    FOREIGN KEY
(
    faculty_ID
) REFERENCES faculty
(
    faculty_ID
) on update restrict
  on delete restrict,
    FOREIGN KEY
(
    department_ID
) REFERENCES department
(
    department_ID
)
    );

create table if not exists educator
(
    educator_ID
    integer
    NOT
    NULL,
    department_ID
    integer,
    FIO
    varchar
(
    100
),
    degree varchar
(
    100
),
    PRIMARY KEY
(
    educator_ID
),
    FOREIGN KEY
(
    department_ID
) REFERENCES department
(
    department_ID
)
    );

create table if not exists `group`
(
    group_ID
    integer
    NOT
    NULL,
    specialty_ID
    integer,
    name
    varchar
(
    100
),
    number_of_students int,
    PRIMARY KEY
(
    group_ID
),
    FOREIGN KEY
(
    specialty_ID
) REFERENCES specialty
(
    specialty_ID
)
    );

create table if not exists discipline
(
    discipline_ID
    integer
    NOT
    NULL,
    group_ID
    integer,
    educator_ID
    integer,
    name
    varchar
(
    100
),
    description varchar
(
    200
),
    PRIMARY KEY
(
    discipline_ID
),
    FOREIGN KEY
(
    group_ID
) REFERENCES `group`
(
    group_ID
),
    FOREIGN KEY
(
    educator_ID
) REFERENCES educator
(
    educator_ID
)
    on update restrict
    on delete restrict
    );
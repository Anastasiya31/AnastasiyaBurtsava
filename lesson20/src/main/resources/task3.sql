-- 3 задание не поняла до конца
create
database post;
use
post;

create table user
(
    id    int          not null primary key auto_increment,
    name  varchar(255) not null,
    email varchar(255) not null
);

create table post
(
    id   int          not null primary key auto_increment,
    type varchar(255) not null,
    time timestamp
);

create table user_posts
(
    id                int not null primary key auto_increment,
    user_id           int not null,
    post_id           int not null,
    foreign key (user_id) references user (id),
    foreign key (post_id) references post (id),
    registration_type enum('active','inactive', 'pending')
);

insert into user (name, email)
values ('Ann', 'ann@gmail.com'),
       ('Sam', 'sam@gmail.com'),
       ('Den', 'den@gmail.com'),
       ('Kate', 'kate@gmail.com'),
       ('Aррр', 'annппп@gmail.com');

insert into post(type, time)
values ('sss', '2016-10-18 13:10:10'),
       ('sss', '2017-07-18 13:10:10'),
       ('sss', '2019-10-18 13:10:10'),
       ('aaa', '2018-07-18 13:10:10'),
       ('aaa', '2020-10-18 13:10:10'),
       ('ggg', '2018-10-18 13:10:10'),
       ('ggg', '2020-10-18 13:10:10'),
       ('ggg', '2019-10-18 13:10:10'),
       ('ggg', '2020-10-18 13:10:10');

insert into user_posts(user_id, post_id, registration_type)
VALUES (1, 1, 'inactive'),
       (1, 3, 'active'),
       (1, 9, 'pending'),
       (2, 2, 'inactive'),
       (2, 8, 'active'),
       (2, 3, 'active'),
       (2, 4, 'active'),
       (2, 6, 'active'),
       (3, 1, 'inactive'),
       (3, 2, 'active'),
       (3, 7, 'pending'),
       (4, 3, 'inactive'),
       (4, 5, 'active'),
       (4, 8, 'active'),
       (4, 9, 'pending');

SELECT name, DATEDIFF(min(time), max(time))
from post
         join user_posts up on post.id = up.post_id
         join user u on u.id = up.user_id
ORDER BY time DESC;

select registration_type, count(name)
from user
         join user_posts up on user.id = up.user_id
         join post u on u.id = up.post_id
where registration_type = 'active'
  and time
    > '2018-06-01 00:10:10';

select email, post_id, time
from user
    left join user_posts up
on user.id = up.user_id
    left join post p on p.id = up.post_id
;
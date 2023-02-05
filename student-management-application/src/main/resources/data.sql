insert into roles values(1,'ADMIN');
insert into roles values(2,'USER');

insert into users values(1, 'user1@email.com', '$2a$12$JASyaA68sUdEGA0DXXkrHuGneJrM27/NyK/mcVX.kZR2N6qcPK/gu', 'User1');
insert into users values(2, 'user2@email.com', '$2a$12$qZN6.zsqLDjh6WTR7tz4E.tIif.RhrXS6VauNnm.HmDbOFWOj9dFy', 'User2');

insert into users_roles values(1,1);
insert into users_roles values(1,2);
insert into users_roles values(2,2);
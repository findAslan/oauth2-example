use userdbs;
insert into users (username, password, enabled) values ('user', 'admin', true);
insert into users (username, password, enabled) values ('dave', 'secret', true);
insert into user_roles (username, role) values ('user', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('user', 'ROLE_ADMIN');
insert into authorities (username, authority) values ('dave', 'ROLE_USER');

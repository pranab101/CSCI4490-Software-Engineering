DROP TABLE users; 

CREATE TABLE users(
username varchar(30),
password varbinary(16),
wins int(5);


ALTER TABLE users
	add constraint users_username_pk primary key(username);
	
	
insert into users
	values('team4', aes_encrypt('password', 'key'), 0);



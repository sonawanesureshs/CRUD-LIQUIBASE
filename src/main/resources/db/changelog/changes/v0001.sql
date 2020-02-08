create table category(id integer primary key, name varchar(50), description varchar(50));

create table product(id integer primary key, name varchar(50), description varchar(50), category integer, foreign key (category) references category(id));
create table book(
id number(10) primary key,
name varchar2(50),
price number(8,2)

)

insert into book values(1,'Harry Potter',1000)
insert into book values(2,'Da Vinci Code',500)
insert into book values(3,'NCERT',450)

select * from book

delete  from book where id=1
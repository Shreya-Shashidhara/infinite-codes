create database test;
use test;
create table Worker(
Worker_Id varchar(20) not null primary key,
First_Name varchar(50),
Last_Name varchar(50),
Salary double,
Joining_Date datetime,
Department varchar(50));
drop table Worker;
select * from Worker;
insert into Worker values('001','Monika','Arora',100000,'2014-02-20 09:00:00','HR');
insert into Worker values('002','Niharika','Verma',80000,'2014-06-11 09:00:00','Admin');
insert into Worker values('003','Vishal','Singhal',300000,'2014-02-20 09:00:00','HR');
insert into Worker values('004','Amitabh','Singh',500000,'2014-02-20 09:00:00','Admin');
insert into Worker values('005','Vivek','Bhati',500000,'2014-06-11 09:00:00','Admin');
insert into Worker values('006','Vipul','Diwan',200000,'2014-06-11 09:00:00','Account');
insert into Worker values('007','Satish','Kumar',75000,'2014-01-20 09:00:00','Account');
insert into Worker values('008','Geetika','Chauhan',90000,'2014-04-11 09:00:00','Admin');
select First_Name,replace(First_name,'a','A') from test.Worker;
select concat(First_Name, ' ',Last_Name) AS Complete_Name from test.Worker;
select* from test.Worker Order By First_Name,Department DESC;
select * from test.Worker where Department ='Admin';
select * from test.Worker where First_Name IN ('Vipul','Satish');
select * from test.Worker where First_Name like '%a';
select * from test.Worker where First_Name like '______h';
select First_Name as Worker_Name from test.Worker;
select First_Name,upper(First_Name) from test.Worker;
select * from test.Worker where Salary between 100000 and 500000;

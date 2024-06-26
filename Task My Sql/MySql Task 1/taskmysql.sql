create database task;
use task;
create table empl(empno int,ename varchar(100),job varchar(50),mgr int,hiredate date,sal double,comm double,deptno int);

insert into empl(empno,ename,job,mgr,hiredate,sal,comm,deptno)
values(8369,'SMITH','CLERK',8902,'1990-12-18',800.00,null,20);

insert into empl(empno,ename,job,mgr,hiredate,sal,comm,deptno)
values(8499,'ANYA','SALESMAN',8698,'1991-02-20',1600.00,300.00,30),(8521,'SETH','SALESMAN',8698,'1991-02-22',1250.00,500.00,30),
(8566,'MAHADEVAN','MANAGER',8839,'1991-04-02',2985.00,null,20),(8654,'MOMIN','SALESMAN',8698,'1991-09-28',1250.00,1400.00,30),
(8698,'BINA','MANAGER',8839,'1991-05-01',2850.00,null,30),(8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450.00,null,10),
(8888,'SCOTT','ANALYST',8566,'1991-12-09',3000.00,null,20),(8839,'AMIR','PRESIDENT',null,'1991-11-18',5000.00,null,10),
(8844,'KULDEEP','SALESMAN',8698,'1991-09-08',1500.00,0.00,30);

/*A*/
SELECT ename, sal FROM empl WHERE sal >= 2200;
/*B*/
select * from empl where comm is null;
/*C*/
select ename,sal from empl where sal>2500 or sal<4000;
/*D*/
select ename,job,sal from empl where mgr is null;
/*E*/
select ename from empl where substring(ename, 3 ,1 )='A';
/*F*/
select ename from empl where right(ename,1);




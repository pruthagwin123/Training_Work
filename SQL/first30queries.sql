
use practice;

create table employee(
	emp_id int primary key, 
	first_name varchar(50), 
	last_name varchar(10), 
	salary int, 
	joining_date date, 
	department varchar(20)
);

select * from employee;

INSERT INTO employee (emp_id, first_name, last_name, salary, joining_date, department)
VALUES
(101, 'John', 'Smith', 55000, '2022-01-15', 'HR'),
(102, 'Emma', 'Johnson', 62000, '2021-07-10', 'Finance'),
(103, 'Michael', 'Brown', 75000, '2020-03-20', 'IT'),
(104, 'Sophia', 'Davis', 68000, '2023-02-05', 'Marketing'),
(105, 'James', 'Wilson', 80000, '2019-11-12', 'IT'),
(106, 'Olivia', 'Miller', 58000, '2022-09-18', 'HR'),
(107, 'William', 'Moore', 72000, '2021-05-25', 'Finance'),
(108, 'Ava', 'Taylor', 65000, '2023-06-01', 'Sales'),
(109, 'Benjamin', 'Anderson', 90000, '2018-08-30', 'Management'),
(110, 'Mia', 'Thomas', 60000, '2022-12-14', 'Marketing');

select * from employee;

select first_name,last_name from employee;

select first_name as "Employee Name" from employee;

select upper(first_name) from employee;

select lower(first_name) from employee;

select distinct department from employee;

select left(first_name,3) from employee;

select right(first_name,2) from employee;

select locate('n',"john");

select length("raghavi") - locate('a', reverse("raghavi"))+1;

select trim(first_name) from employee;

select ltrim(first_name) from employee;

select rtrim(first_name) from employee;

select length(first_name) from employee;

select replace(first_name,'a','$') from employee;

select concat(first_name, '_', last_name) as full_name from employee;

select * from employee order by first_name desc;

select * from employee order by first_name asc;

select * from employee order by  salary desc, first_name asc;

select * from employee where first_name ="John";

select * from employee where first_name= "John" or last_name = "Wilson";

select * from employee where not first_name= "John" order by salary desc;

select * from employee where first_name like '%a';
select * from employee where first_name like 'a%';
select * from employee where first_name like '%a%';
select * from employee where first_name like '%_a';

select * from employee where first_name like '___n';

select * from employee where first_name like'a___';

select * from employee where salary >50000;
select * from employee where salary >50000 order by salary desc;

select * from employee where salary < 40000;

select * from employee where salary >30000 and salary <70000 order by first_name asc;

select * from employee where first_name ="John" or first_name="James";
select * from employee where first_name in('John','Olivia');

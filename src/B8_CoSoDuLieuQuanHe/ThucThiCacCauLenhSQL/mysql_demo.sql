drop database if exists mysql_demo;
create database mysql_demo;
use mysql_demo;
create table Customer (
	CustomerID int primary key,
    CustomerName nvarchar(255),
    Phone nvarchar(12),
    City nvarchar(255),
    Country nvarchar(255)
);
insert into Customer(CustomerId, CustomerName, Phone, City, Country) values(1, 'Nguyễn Văn Anh', '0935123456', 'Đà Nẵng', 'Việt Nam');
insert into Customer(CustomerId, CustomerName, Phone, City, Country) values(2, 'Hoàng Bảo Quốc', '0935123456', 'Đà Nẵng', 'Việt Nam');
insert into Customer(CustomerId, CustomerName, Phone, City, Country) values(3, 'Phạm Văn Bảo', '0935123456', 'Quảng Nam', 'Việt Nam');
insert into Customer(CustomerId, CustomerName, Phone, City, Country) values(4, 'Nguyễn Thị Bé', '0935123456', 'Hà Nội', 'Việt Nam');
select * from Customer;
select * from Customer where CustomerName like '%Quốc';
select * from Customer where CustomerName like 'Hoảng%';
select * from Customer where CustomerName like '%Bảo%';
select * from Customer where City in ('Đà Nẵng','Quảng Nam');
delete from Customer where CustomerId = 1;
select * from Customer;
update Customer set Phone='0935111222' where CustomerId=2;
select * from Customer where CustomerId = 2;
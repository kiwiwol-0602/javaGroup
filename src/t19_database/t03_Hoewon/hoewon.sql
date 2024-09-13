show tables;

create table hoewon (
	idx				int 				not	null	auto_increment primary key, /*고유번호*/
	name			varchar(30)	not null,															/*이름*/
	age				int					default 20,														/*나이*/
	gender		char(2)			default '여자',												/*성별*/
	joinday	datetime		default now(),									/*가입일(yyyy-MM-dd)*/
	address		varchar(20)	
);

desc hoewon;
--drop table hoewon;
--delete from hoewon;

insert into hoewon (name, age, gender, address) values ('홍길동',23,'남자','서울');		--- 레코드 삽입
insert into hoewon values (default,'김말숙',30,'여자',default,'청주');/*hoewon와 values 사이에 필드를 적지 않았을땐, 데이터필드의 갯수와 순서가 똑같이 들어가 있어야 함*/
insert into hoewon values (default,'오하늘',default,default,default,'');
insert into hoewon (name) values ('이사랑');
insert into hoewon values (default,'가나다',22,'여자','2000-01-05','청주');
insert into hoewon values (default,'강감찬',24,'남자','2015-11-12','청주');
insert into hoewon values (default,'이사랑',25,'여자','2011-08-22','천안');
insert into hoewon values (default,'김그린',27,'남자','2021-06-02','대전');
insert into hoewon values (default,'강현민',29,'여자','2023-09-06','인천');
insert into hoewon values (default,'고릴라',33,'남자','1996-02-16','서울');
insert into hoewon values (default,'전감자',37,'여자',default,'제주');
insert into hoewon values (default,'이자바',40,'남자',default,'청주');
insert into hoewon values (default,'김자월',22,'여자','1999-08-04','제주');
insert into hoewon values (default,'오자월',22,'여자',default,'제주');
insert into hoewon values (default,'오이자월',22,'여자','2000-07-14','청주');
insert into hoewon values (default,'김자월화',36,'여자',default,'청주');

select * from hoewon;
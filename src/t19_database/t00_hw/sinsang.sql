show tables;

create table hoewon ( 
	mid		varchar(15)	not null, 
	pwd 	varchar(15) not null,
	name	varchar(20) not null,
    age		int 		default 20,
    sex 	char(2) 	default '남자',
	ipsail	datetime	default now(),
    address varchar(50)				
);

desc hoewon;

select * from sinsang;

desc sinsang;

insert into sinsang values ('hong','1234','홍길동',25,'남자','1990-10-05','서울');
insert into sinsang values ('kim','1234','김말숙',33,'여자','1997-12-3','부산');
insert into sinsang values ('lee','1234','이순자',24,'여자','1985-7-25','광주');
insert into sinsang values ('lee1','1234','이기자',40,'남자','1999-10-3','울산');
insert into sinsang values ('park','1234','박찬호',32,'남자','1980-6-08','대전');
insert into sinsang values ('bae','1234','배은숙',19,'여자','1993-11-22','마산');
insert into sinsang values ('son','1234','손기정',45,'남자','1987-12-15','제주');
insert into sinsang values ('kim1','1234','김영숙',36,'여자','2002-10-5','부천');
insert into sinsang values ('kim2','1234','김영철',39,'남자','1988-10-05','인천');
insert into sinsang values ('lee2','1234','이겨라',29,'남자','2000-10-09','서울');
insert into sinsang values ('son2','1234','손오공',23,'남자','2005-12-15','서울');

select * from sinsang;

select * from sinsang where mid like 'kim%';

select * from sinsang where gender = '남자';

select * from sinsang where address = '서울';

select * from sinsang where address in('서울', '인천');

select * from sinsang where address = '서울' and gender = '남자';

desc sinsang;

select * from sinsang;

update sinsang set point = point + 100 where gender = '여자';

select * from sinsang;

update sinsang set point = point + 50 where gender = '남자' and age>=35;

select * from sinsang;

update sinsang set address='서울' where mid = 'kim1';

select mid, age, address from sinsang;

select  mid as 아이디, gender as 성별, ipsail as 입사일 from sinsang where ipsail >= '2000-01-01';

insert into sinsang values ('park','1234','박세리',35,'여자',default,'인천',default);

select mid,gender, address, age from sinsang where (age>=30 and age<40) and gender='여자';

update sinsang set point = point + 500 where gender = '여자' and address !='서울' and address != '인천' ;

update sinsang set point = 0 where gender = '남자' and ipsail<'1990-01-01' ;

update sinsang set gender = '여자' where point = 0 and age >= 40 ;

update sinsang set pwd = '0000' and point = point + 300 where address = '서울';

delete from sinsang where point=0 and gender = '남자' and ipsail<'1985-01-01';

select * from sinsang where gender='여자' and age >=30 and age<40; 

select * from sinsang where gender='여자' and age between 30 and 39;

select name, age, gender, address from sinsang where address= '서울' or address= '부산' ;

select name, age, gender, address from sinsang where address in ('서울','부산');

select * from sinsang order by age desc, name,  idx ;

insert into sinsang (name, mid, pwd) values ('홍길공자','hkgj','1234');

select * from sinsang where name like '홍%';

select * from sinsang where name like '%자';

select * from sinsang where name like '%공%';

select mid as '아이디', name as '이름', gender as '성별' from sinsang where  name like '_기%';

select * from sinsang where name like '%공_';

select mid, name, gender from sinsang order by idx limit 5; 

select mid as '아이디', name as '이름', gender as '성별' from sinsang order by idx limit 4,5;

select mid, name, gender from sinsang order by gender desc, name, idx limit 5; 

select * from sinsang order by age desc limit 3;

  
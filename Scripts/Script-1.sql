desc student;


-- 마이바티스
CREATE SCHEMA JDBC_Mybatis;

-- 학생
CREATE TABLE student (
	stud_id INTEGER     NOT NULL COMMENT '학번', -- 학번
	name    VARCHAR(50) NOT NULL COMMENT '성명', -- 성명
	email   VARCHAR(40) NOT NULL COMMENT '메일', -- 메일
	dob     DATE        NULL     COMMENT '입학일자' -- 입학일자
)
COMMENT '학생';

-- 학생
ALTER TABLE student
	ADD CONSTRAINT PK_student -- 학생 기본키
		PRIMARY KEY (
			stud_id -- 학번
		);

insert into student values
(1,'student1','student1@gmail.com','1983-06-25'),
(2,'student2','student2@gmial.com','1983-06-25');

select stud_id,name,email,dob from student;
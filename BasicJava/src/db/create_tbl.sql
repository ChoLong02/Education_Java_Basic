create table tbl_study
(
    no      int auto_increment primary key,
    name    varchar(50)        null,
    age     INT                null
);


# 제품 목록
create table tbl_product
( 
    pno       INT auto_increment primary key,
    pname     VARCHAR(50) NOT NULL,
    company  VARCHAR(50) NOT NULL,
    price    INT NOT NULL,
    cnt    INT NOT NULL,
    regdate   datetime default current_timestamp() null
);


# 제품 판매시 판매 목록을 저장하는 테이블
create table tbl_sale
( 
    sno       INT auto_increment primary key,
    sname     VARCHAR(50) NOT NULL,
    cnt    INT NOT NULL,
    tprice    INT NOT NULL,
    rgdate   datetime default current_timestamp() null
);

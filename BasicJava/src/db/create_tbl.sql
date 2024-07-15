create table tbl_study
(
    no      int auto_increment primary key,
    name    varchar(50)        null,
    age     INT                null
);


create table tbl_product
( 
    pno       INT auto_increment primary key,
	 pname     VARCHAR(50) NOT NULL,
	 company  VARCHAR(50) NOT NULL,
	 price    INT NOT NULL,
	 cnt    INT NOT NULL,
	 regdate   datetime default current_timestamp() null
);

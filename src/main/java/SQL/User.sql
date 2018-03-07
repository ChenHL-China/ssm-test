CREATE TABLE tb_UserInfo(
	Id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
	UserName VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'UserName',
	UserPhone VARCHAR (15) NOT NULL DEFAULT '' COMMENT 'UserPhone',
	UserMoney DOUBLE (11,2) NOT NULL DEFAULT -1.0 COMMENT 'UserMoney',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'tb_UserInfo';

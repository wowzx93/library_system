--
--创建数据库
--
CREATE DATABASE IF NOT EXISTS db_librarySys;
USE db_librarySys;
--创建书记信息表
CREATE TABLE `bookinfo` (
  `isbn` varchar(20) NOT NULL,
  `book_name` varchar(70) default NULL,
  `type_id` int(10) unsigned default NULL,
  `author` varchar(30) default NULL,
  `translator` varchar(30) default NULL,
  `price` float(8,2) default NULL,
  `page` int(10) unsigned default NULL,
  `publication_date` varchar(10) default NULL,
  `press` varchar(30) default NULL,
  `stock` int(10) default 0,
  PRIMARY KEY  (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--添加信息
INSERT INTO `bookinfo`
VALUES
('9787111255833','Effective Java',1,'[美]Joshua Bloch','杨春花,俞黎敏',52.00,287,'2016年7月','机械工业出版社',5),
('9787544283144','精神科的故事:在游泳池',2,'[日]奥田英朗','王维幸',35.00,242,'2016年7月','南海出版公司',3)
;
--书籍表
CREATE TABLE `book` (
`book_id` int(20) unsigned NOT NULL auto_increment,
`isbn` varchar(20) NOT NULL,
`status` tinyint(1) default 1,
`position` varchar(10) default NULL,
PRIMARY KEY (`book_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
--添加信息
INSERT INTO `book` (`isbn`,`position`)
VALUES
('9787111255833','A3-1'),
('9787111255833','A3-2'),
('9787111255833','A3-3'),
('9787111255833','A3-4'),
('9787111255833','A3-5'),
('9787544283144','B2-1'),
('9787544283144','B2-2'),
('9787544283144','B2-3')
;
--书籍类别表
CREATE TABLE `booktype` (
  `type_id` int(10) unsigned NOT NULL auto_increment,
  `type_name` varchar(30) default NULL,
  PRIMARY KEY  (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--添加信息
INSERT INTO `booktype` (`type_name`)
VALUES
('电子技术'),
('文学'),
('自然科学'),
('人文地理'),
('外语')
;
--借出表
CREATE TABLE `borrow`(
`book_id` int(10) unsigned NOT NULL,
`user_id` int(10) unsigned NOT NULL,
`borrow_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`back_time` DATE default NULL,
`status` tinyint(1) default 0,
PRIMARY KEY  (`book_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--用户表
CREATE TABLE `user`(
	`user_id` int(10) unsigned NOT NULL auto_increment,
	`user_name` varchar(20) NOT NULL,
	`user_pwd` varchar(20) default '123456',
	`user_status` tinyint(1) default 1,
	PRIMARY KEY  (`user_id`),
	KEY `uname` (`user_name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
--添加信息
INSERT INTO `user` (`user_name`,`user_pwd`)
VALUES
('admin1','666666'),
('admin2','111111')
;
--管理员表
CREATE TABLE `manager`(
	`manager_id` int(10) unsigned NOT NULL auto_increment,
	`manager_name` varchar(20) NOT NULL,
	`manager_pwd` varchar(20) default '123456',
	`manager_power` tinyint(1) default 1,
	PRIMARY KEY  (`manager_id`),
	key mname (manager_name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
--添加信息
INSERT INTO `manager` (`manager_name`,`manager_pwd`,`manager_power`)
VALUES
('supermanager','123456',0),
('narmal','000000',1)
;
















CREATE TABLE `coordinates` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `latitude` double(20,4) DEFAULT '0.0000',
  `longitude` double(20,4) DEFAULT '0.0000',
PRIMARY KEY (`id`)
);

insert into coordinates(latitude,longitude) values(18.975,72.8258);
insert into coordinates(latitude,longitude) values(23.03,72.58);
insert into coordinates(latitude,longitude) values(13.0839,80.27);
insert into coordinates(latitude,longitude) values(22.5667,88.3667);
insert into coordinates(latitude,longitude) values(26.847,80.947);
insert into coordinates(latitude,longitude) values(28.6139,77.2089);
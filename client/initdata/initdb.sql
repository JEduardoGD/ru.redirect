CREATE DATABASE ru_redirect CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT SELECT ON performance_schema.user_variables_by_thread TO 'root'@'%';
#--
#--CREATE USER 'ru_redirect'@'%' IDENTIFIED BY 'EB0M3KFkbrV';
#--GRANT ALL PRIVILEGES ON ru_redirect.* TO 'ru_redirect'@'%';
#--GRANT SELECT ON performance_schema.user_variables_by_thread TO 'ru_redirect'@'%';
use ru_redirect;
CREATE TABLE `hst_request_log` (
  `id` bigint(20) NOT NULL,
  `date_time` datetime(6) DEFAULT NULL,
  `remote_address` varchar(255) DEFAULT NULL,
  `requested_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `hst_request_log`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `hst_request_log`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

CREATE TABLE `tbl_req_redirect` (
  `id` bigint(20) NOT NULL,
  `callsign` varchar(255) DEFAULT NULL,
  `disable_date_time` datetime(6) DEFAULT NULL,
  `enable_date_time` datetime(6) DEFAULT NULL,
  `new_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tbl_req_redirect`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `tbl_req_redirect`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

INSERT INTO `tbl_req_redirect` (`id`, `callsign`, `disable_date_time`, `enable_date_time`, `new_url`) VALUES ('1', 'xe1jeg', NULL, NOW(), 'https://espanol.yahoo.com');
INSERT INTO `tbl_req_redirect` (`id`, `callsign`, `disable_date_time`, `enable_date_time`, `new_url`) VALUES ('2', 'xe1vp', NULL, NOW(), 'https://rpc.ift.org.mx/vrpc/pdfs/98582_190926162825_8490.pdf');


CREATE TABLE IF NOT EXISTS `hst_request_log` (
  `id` bigint(20) NOT NULL,
  `date_time` datetime(6) DEFAULT NULL,
  `remote_address` varchar(255) DEFAULT NULL,
  `requested_url` varchar(255) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `tbl_req_redirect` (
  `id` bigint(20) NOT NULL,
  `callsign` varchar(255) DEFAULT NULL,
  `disable_date_time` datetime(6) DEFAULT NULL,
  `enable_date_time` datetime(6) DEFAULT NULL,
  `new_url` varchar(255) DEFAULT NULL
);
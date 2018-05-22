/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2018/5/21 22:16:01                           */
/*==============================================================*/

DROP TABLE IF EXISTS check_in_out_time_arrange;

DROP TABLE IF EXISTS city;

DROP TABLE IF EXISTS city_picture_url;

DROP TABLE IF EXISTS host_family_info;

DROP TABLE IF EXISTS house_base_info;

DROP TABLE IF EXISTS house_detail_info;

DROP TABLE IF EXISTS house_picture_url;

DROP TABLE IF EXISTS order_detail;

DROP TABLE IF EXISTS order_manage;

DROP TABLE IF EXISTS price_and_request_info;

DROP TABLE IF EXISTS tenant_info;

DROP TABLE IF EXISTS user_table;

/*==============================================================*/
/* Table: check_in_out_time_arrange                             */
/*==============================================================*/
CREATE TABLE check_in_out_time_arrange 
(
   time_id              VARCHAR(40)                    NOT NULL,
   house_id             VARCHAR(40)                    NULL,
   preset_start_time    DATETIME                       NULL,
   preset_end_time      DATETIME                       NULL,
   remark               VARCHAR(40)                    NULL,
   CONSTRAINT PK_CHECK_IN_OUT_TIME_ARRANGE PRIMARY KEY clustered (time_id)
);

/*==============================================================*/
/* Table: city                                                  */
/*==============================================================*/
CREATE TABLE city 
(
   city_id              VARCHAR(40)                    NOT NULL,
   city_num             VARCHAR(40)                    NULL,
   city_name            VARCHAR(40)                    NULL,
   hot_level            VARCHAR(40)                    NULL,
   feature              VARCHAR(100)                   NULL,
   remark1              VARCHAR(40)                    NULL,
   remark2              VARCHAR(40)                    NULL,
   CONSTRAINT PK_CITY PRIMARY KEY clustered (city_id)
);

/*==============================================================*/
/* Table: city_picture_url                                      */
/*==============================================================*/
CREATE TABLE city_picture_url 
(
   city_picture_url_id  VARCHAR(40)                    NOT NULL,
   city_id              VARCHAR(40)                    NULL,
   picture_name         VARCHAR(40)                    NULL,
   picture_url          VARCHAR(40)                    NULL,
   pic_desc              VARCHAR(40)                    NULL,
   remark1              VARCHAR(40)                    NULL,
   CONSTRAINT PK_CITY_PICTURE_URL PRIMARY KEY clustered (city_picture_url_id)
);

/*==============================================================*/
/* Table: host_family_info                                      */
/*==============================================================*/
CREATE TABLE host_family_info 
(
   host_family_id       VARCHAR(40)                    NOT NULL,
   user_id              VARCHAR(40)                    NULL,
   real_name            VARCHAR(10)                    NULL,
   sex                  VARCHAR(40)                    NULL,
   age                  VARCHAR(40)                    NULL,
   phone                VARCHAR(40)                    NULL,
   card_type            VARCHAR(40)                    NULL,
   id_card              VARCHAR(40)                    NULL,
   ethnic               VARCHAR(40)                    NULL,
   job                  VARCHAR(40)                    NULL,
   host_desc            VARCHAR(100)                   NULL,
   remark1              VARCHAR(40)                    NULL,
   CONSTRAINT PK_HOST_FAMILY_INFO PRIMARY KEY clustered (host_family_id)
);

/*==============================================================*/
/* Table: house_base_info                                       */
/*==============================================================*/
CREATE TABLE house_base_info 
(
   house_id             VARCHAR(40)                    NOT NULL,
   city_id              VARCHAR(40)                    NULL,
   host_family_id       VARCHAR(40)                    NULL,
   house_name           VARCHAR(40)                    NULL,
   rent_out_type        VARCHAR(10)                    NULL,
   house_type           VARCHAR(10)                    NULL,
   home_type            VARCHAR(10)                    NULL,
   price                VARCHAR(10)                    NULL,
   address              VARCHAR(100)                   NULL,
   facility             VARCHAR(500)                   NULL,
   house_desc           VARCHAR(500)                   NULL,
   traffic              VARCHAR(500)                   NULL,
   rim_desc             VARCHAR(500)                   NULL,
   other                VARCHAR(500)                   NULL,
   hot_level            VARCHAR(10)                    NULL,
   STATUS               VARCHAR(10)                    NULL,
   remark               VARCHAR(40)                    NULL,
   CONSTRAINT PK_HOUSE_BASE_INFO PRIMARY KEY clustered (house_id)
);

/*==============================================================*/
/* Table: house_detail_info                                     */
/*==============================================================*/
CREATE TABLE house_detail_info 
(
   detail_id            VARCHAR(40)                    NOT NULL,
   hou_house_id         VARCHAR(40)                    NULL,
   house_id             VARCHAR(40)                    NULL,
   home_num             VARCHAR(10)                    NULL,
   bed_num              VARCHAR(10)                    NULL,
   available_people_num VARCHAR(10)                    NULL,
   bed_type             VARCHAR(10)                    NULL,
   extra_add_people_num VARCHAR(10)                    NULL,
   toilet_num           VARCHAR(10)                    NULL,
   toilet_type          VARCHAR(10)                    NULL,
   tower_level          VARCHAR(10)                    NULL,
   total_level          VARCHAR(10)                    NULL,
   AREA                 VARCHAR(10)                    NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_HOUSE_DETAIL_INFO PRIMARY KEY clustered (detail_id)
);

/*==============================================================*/
/* Table: house_picture_url                                     */
/*==============================================================*/
CREATE TABLE house_picture_url 
(
   house_picture_url_id VARCHAR(40)                    NOT NULL,
   house_id             VARCHAR(40)                    NULL,
   picture_type         VARCHAR(40)                    NULL,
   picture_url          VARCHAR(40)                    NULL,
   remark1              VARCHAR(40)                    NULL,
   CONSTRAINT PK_HOUSE_PICTURE_URL PRIMARY KEY clustered (house_picture_url_id)
);

/*==============================================================*/
/* Table: order_detail                                          */
/*==============================================================*/
CREATE TABLE order_detail 
(
   order_detail_id      VARCHAR(40)                    NOT NULL,
   order_id             VARCHAR(40)                    NULL,
   check_in_time        VARCHAR(40)                    NULL,
   check_out_time       VARCHAR(40)                    NULL,
   check_in_days        VARCHAR(10)                    NULL,
   check_in_people_num  VARCHAR(10)                    NULL,
   total_price          VARCHAR(10)                    NULL,
   NAME                 VARCHAR(10)                    NULL,
   id_card              VARCHAR(20)                    NULL,
   phone                VARCHAR(20)                    NULL,
   STATUS               VARCHAR(20)                    NULL,
   remark               VARCHAR(100)                   NULL,
   CONSTRAINT PK_ORDER_DETAIL PRIMARY KEY clustered (order_detail_id)
);

/*==============================================================*/
/* Table: order_manage                                          */
/*==============================================================*/
CREATE TABLE order_manage 
(
   order_id             VARCHAR(40)                    NOT NULL,
   order_num            VARCHAR(40)                    NULL,
   house_id             VARCHAR(40)                    NULL,
   user_id              VARCHAR(40)                    NULL,
   order_detail_id      VARCHAR(40)                    NULL,
   CONSTRAINT PK_ORDER_MANAGE PRIMARY KEY clustered (order_id)
);

/*==============================================================*/
/* Table: price_and_request_info                                */
/*==============================================================*/
CREATE TABLE price_and_request_info 
(
   price_info_id        VARCHAR(40)                    NOT NULL,
   house_id             VARCHAR(40)                    NULL,
   day_price            VARCHAR(10)                    NULL,
   week_price           VARCHAR(10)                    NULL,
   clean_price          VARCHAR(10)                    NULL,
   cash_pledge          VARCHAR(10)                    NULL,
   less_day             VARCHAR(10)                    NULL,
   more_day             VARCHAR(10)                    NULL,
   check_in_start_time  VARCHAR(20)                    NULL,
   check_in_end_time    VARCHAR(20)                    NULL,
   check_out_time       VARCHAR(20)                    NULL,
   remark1              VARCHAR(40)                    NULL,
   CONSTRAINT PK_PRICE_AND_REQUEST_INFO PRIMARY KEY clustered (price_info_id)
);

/*==============================================================*/
/* Table: tenant_info                                           */
/*==============================================================*/
CREATE TABLE tenant_info 
(
   tenant_id            VARCHAR(40)                    NOT NULL,
   order_detail_id      VARCHAR(40)                    NULL,
   NAME                 VARCHAR(10)                    NULL,
   sex                  VARCHAR(10)                    NULL,
   id_card              VARCHAR(20)                    NULL,
   phone                VARCHAR(20)                    NULL,
   remark               VARCHAR(100)                   NULL,
   CONSTRAINT PK_TENANT_INFO PRIMARY KEY clustered (tenant_id)
);

/*==============================================================*/
/* Table: user_table                                            */
/*==============================================================*/
CREATE TABLE user_table 
(
   user_id              VARCHAR(40)                    NOT NULL,
   user_name            VARCHAR(40)                    NULL,
   phone                VARCHAR(40)                    NULL,
   email                VARCHAR(40)                    NULL,
   PASSWORD             VARCHAR(40)                    NULL,
   remark               VARCHAR(40)                    NULL,
   CONSTRAINT PK_USER_TABLE PRIMARY KEY clustered (user_id)
);


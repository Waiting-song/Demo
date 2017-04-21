prompt PL/SQL Developer import file
prompt Created on Tuesday, April 11, 2017 by wayne
set feedback off
set define off
prompt Dropping T_ACCOUNT_DETAIL...
drop table T_ACCOUNT_DETAIL cascade constraints;
prompt Dropping T_SYS_USER...
drop table T_SYS_USER cascade constraints;
prompt Creating T_ACCOUNT_DETAIL...
create table T_ACCOUNT_DETAIL
(
  T_ACCOUNT_ID  VARCHAR2(50) not null,
  T_SYSUSER_ID  VARCHAR2(50),
  T_ACTION_TYPE VARCHAR2(50),
  T_CASH        VARCHAR2(50),
  T_TOTAL       VARCHAR2(50),
  T_DATE        VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_ACCOUNT_DETAIL
  add constraint PK_T_ACCOUNT_DETAIL primary key (T_ACCOUNT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_SYS_USER...
create table T_SYS_USER
(
  T_SYSUSER_ID   VARCHAR2(50) not null,
  T_SYSUSER_NAME VARCHAR2(50),
  T_SYSUSER_PWD  VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_SYS_USER
  add constraint PK_T_SYS_USER primary key (T_SYSUSER_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for T_ACCOUNT_DETAIL...
alter table T_ACCOUNT_DETAIL disable all triggers;
prompt Disabling triggers for T_SYS_USER...
alter table T_SYS_USER disable all triggers;
prompt Loading T_ACCOUNT_DETAIL...
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('79d92d3f-ec40-40bd-b9a5-122d5ae1d2b4', '123', '取钱', '100', '200', '2017-04-10 16:04:04');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('b491b397-47d6-4bc7-9f81-adf61258c17b', '123', '取钱', '200', '300', '2017-04-10 11:04:46');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('eb21a2c1-ac9a-4008-984f-b4789f9d8b81', '123', '存钱', '100', '400', '2017-04-10 11:04:29');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('5677544', '444', '转入', '100', '100', '2017-04-11 9:04:22');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('39052e8d-5bb5-4ca7-941a-ff4cc8e0c2da', '123', '取钱', '100', '300', '2017-04-10 11:04:01');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('c9910d75-f917-4420-8bbd-928219730', '123', '转出', '100', '100', '2017-04-11 9:04:20');
insert into T_ACCOUNT_DETAIL (T_ACCOUNT_ID, T_SYSUSER_ID, T_ACTION_TYPE, T_CASH, T_TOTAL, T_DATE)
values ('c9910d75-f917-4420-8bbd-928219730712', '123', '存钱', '500', '500', '2017-04-10 11:04:22');
commit;
prompt 7 records loaded
prompt Loading T_SYS_USER...
insert into T_SYS_USER (T_SYSUSER_ID, T_SYSUSER_NAME, T_SYSUSER_PWD)
values ('123', 'tom', '789');
insert into T_SYS_USER (T_SYSUSER_ID, T_SYSUSER_NAME, T_SYSUSER_PWD)
values ('444', 'kite', '666');
insert into T_SYS_USER (T_SYSUSER_ID, T_SYSUSER_NAME, T_SYSUSER_PWD)
values ('789', 'jack', '666');
commit;
prompt 3 records loaded
prompt Enabling triggers for T_ACCOUNT_DETAIL...
alter table T_ACCOUNT_DETAIL enable all triggers;
prompt Enabling triggers for T_SYS_USER...
alter table T_SYS_USER enable all triggers;
set feedback on
set define on
prompt Done.

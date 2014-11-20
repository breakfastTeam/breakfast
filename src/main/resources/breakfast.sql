/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/11/13 星期四 下午 12:41:28                   */
/*==============================================================*/


/*==============================================================*/
/* Table: t_bf_address                                          */
/*==============================================================*/
create table t_bf_address
(
   adddress_id          varchar(32) not null,
   address_name         varchar(20) comment '地址名',
   address              varchar(200) comment '地址详情',
   status               varchar(20) comment '状态',
   primary key (adddress_id)
);

alter table t_bf_address comment '地址表';

/*==============================================================*/
/* Table: t_bf_coupon                                           */
/*==============================================================*/
create table t_bf_coupon
(
   coupon_id            varchar(32) not null,
   user_id              varchar(32) comment '发放对象ID',
   create_time          datetime comment '发放时间',
   end_time             datetime comment '截止日期',
   price                decimal(8,3) comment '价值',
   source               varchar(32) comment '发放人',
   status               varchar(20) comment '状态',
   primary key (coupon_id)
);

alter table t_bf_coupon comment '代金券表';

/*==============================================================*/
/* Table: t_bf_custom_order_detail                              */
/*==============================================================*/
create table t_bf_custom_order_detail
(
   detail_id            varchar(32) not null,
   food_custom_id       varchar(32) comment '定制表ID',
   food_id              varchar(32) comment '食品数量',
   food_count           int comment '食品数量',
   primary key (detail_id)
);

alter table t_bf_custom_order_detail comment '用户定制详情';

/*==============================================================*/
/* Table: t_bf_customer_service                                 */
/*==============================================================*/
create table t_bf_customer_service
(
   user_id              varchar(32) not null,
   primary key (user_id)
);

alter table t_bf_customer_service comment '客服';

/*==============================================================*/
/* Table: t_bf_express                                          */
/*==============================================================*/
create table t_bf_express
(
   express_id           varchar(32) not null,
   订单ID                 varchar(32) comment '订单ID',
   courier_id           varchar(32) comment '快递员ID',
   start_time           datetime comment '起送时间',
   finish_time          datetime comment '送达时间',
   longitude            varchar(30) comment '经度',
   latitude             varchar(30) comment '纬度',
   status               varchar(20) comment '状态',
   primary key (express_id)
);

alter table t_bf_express comment '订单配送表';

/*==============================================================*/
/* Table: t_bf_feedback                                         */
/*==============================================================*/
create table t_bf_feedback
(
   feedback_id          varchar(32) not null,
   user_id              varchar(32) comment '反馈人',
   target_type          varchar(20) comment '反馈对象类别',
   object_id            varchar(32) comment '反馈对象ID',
   content              varchar(500) comment '反馈内容',
   create_time          datetime comment '创建时间',
   last_modify_time     datetime comment '更新时间',
   状态                   varchar(20) comment '状态',
   primary key (feedback_id)
);

alter table t_bf_feedback comment '评价反馈表';

/*==============================================================*/
/* Table: t_bf_file                                             */
/*==============================================================*/
create table t_bf_file
(
   file_id              varchar(32) not null,
   file_path            varchar(200) comment '文件路径',
   status               varchar(20) comment '状态',
   create_time          datetime comment '上传日期',
   create_by            varchar(32) comment '上传人',
   primary key (file_id)
);

alter table t_bf_file comment '文件表';

/*==============================================================*/
/* Table: t_bf_food                                             */
/*==============================================================*/
create table t_bf_food
(
   food_id              varchar(32) not null comment '主键',
   food_name            varchar(50) comment '名称',
   cost                 decimal(5,3) comment '成本',
   price                decimal(5,3) comment '单价',
   unit                 varchar(20) comment '单位',
   brief_intro          varchar(500) comment '简介',
   status               varchar(20) comment '状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD',
   food_count           int comment '假库存数',
   real_food_count      int comment '真实库存',
   small_pic_id         varchar(32) comment '缩略图',
   orgin_pic_id         varchar(32) comment '原图',
   support_snap_up      bool comment '是否支持抢购',
   support_exchange     bool comment '是否支持兑换',
   exchange_count       int comment '兑换所需黄豆数',
   primary key (food_id)
);

alter table t_bf_food comment '食品表';

/*==============================================================*/
/* Table: t_bf_food_custom                                      */
/*==============================================================*/
create table t_bf_food_custom
(
   food_custom_id       varchar(32) not null,
   custom_order_name    varchar(30) comment '订单名称',
   customer_id          varchar(32) comment '客户ID',
   food_id              varchar(32) comment '食品ID',
   food_count           int comment '食品数量',
   price                decimal(8,3) comment '订单售价',
   create_time          datetime comment '创建时间',
   status               varchar(20) comment '状态',
   primary key (food_custom_id)
);

alter table t_bf_food_custom comment '用户定制表';

/*==============================================================*/
/* Table: t_bf_food_detail                                      */
/*==============================================================*/
create table t_bf_food_detail
(
   detail_id            varchar(32) not null,
   food_id              varchar(32) comment '食品ID',
   raw_material_id      varchar(32) comment '原材料ID',
   count                int comment '原材料数量',
   primary key (detail_id)
);

alter table t_bf_food_detail comment '原材料食品中间表';

/*==============================================================*/
/* Table: t_bf_grade                                            */
/*==============================================================*/
create table t_bf_grade
(
   grade_id             varchar(32) not null,
   user_id              varchar(32) comment '评分人',
   target_type          varchar(20) comment '评分对象类别',
   object_id            varchar(32) comment '评分对象ID',
   grade                int comment '评分',
   create_time          datetime comment '创建时间',
   last_modify_time     datetime comment '更新时间',
   状态                   varchar(20) comment '状态',
   primary key (grade_id)
);

alter table t_bf_grade comment '评分详情表';

/*==============================================================*/
/* Table: t_bf_message                                          */
/*==============================================================*/
create table t_bf_message
(
   message_id           varchar(32),
   user_id              varchar(32) comment '客户ID',
   customer_service_id  varchar(32) comment '客服ID',
   content              varchar(200) comment '内容',
   create_time          datetime comment '创建时间',
   status               varchar(20) comment '状态'
);

alter table t_bf_message comment '聊天信息表';

/*==============================================================*/
/* Table: t_bf_order                                            */
/*==============================================================*/
create table t_bf_order
(
   order_id             varchar(32) not null,
   customer_id          varchar(32) comment '客户ID',
   type                 varchar(32) comment '类别',
   status               varchar(20) comment '状态',
   consignee_name       varchar(20) comment '收货人姓名',
   consignee_address    varchar(200) comment '收货人地址',
   consignee_mobile     varchar(20) comment '收货人手机号',
   order_price          int comment '订单金额',
   exccreadit_count     int comment '消耗黄豆数',
   primary key (order_id)
);

alter table t_bf_order comment '订单表';

/*==============================================================*/
/* Table: t_bf_order_detail                                     */
/*==============================================================*/
create table t_bf_order_detail
(
   detail_id            varchar(32) not null,
   order_id             varchar(32) comment '订单ID',
   food_id              varchar(32) comment '食品',
   food_count           int comment '数量',
   primary key (detail_id)
);

alter table t_bf_order_detail comment '订单详情表';

/*==============================================================*/
/* Table: t_bf_photo_show                                       */
/*==============================================================*/
create table t_bf_photo_show
(
   photo_id             varchar(32) not null,
   file_id              varchar(32) comment '图片文件ID',
   create_time          datetime comment '图片上传日期',
   valid_date           datetime comment '图片有效期',
   createBy             varchar(32) comment '上传机器编号',
   status               varchar(30) comment '图片状态',
   primary key (photo_id)
);

alter table t_bf_photo_show comment '图片展示';

/*==============================================================*/
/* Table: t_bf_provider                                         */
/*==============================================================*/
create table t_bf_provider
(
   provider_id          varchar(32),
   provider_name        varchar(50) comment '供应商名称',
   phone                varchar(20) comment '常用电话',
   alternative_phone    varchar(20) comment '备用电话',
   address              varchar(100) comment '地址',
   intro                varchar(200) comment '描述',
   status               varchar(20) comment '状态'
);

alter table t_bf_provider comment '供应商';

/*==============================================================*/
/* Table: t_bf_raw_material                                     */
/*==============================================================*/
create table t_bf_raw_material
(
   raw_material_id      varchar(32) not null,
   raw_material_name    varchar(30) comment '原材料名称',
   price                decimal(7,3) comment '原材料价格',
   provider_id          varchar(32) comment '供应商ID',
   unit                 varchar(20) comment '单位',
   status               varchar(20) comment '状态',
   primary key (raw_material_id)
);

alter table t_bf_raw_material comment '原材料表';

/*==============================================================*/
/* Table: t_bf_set_foods                                        */
/*==============================================================*/
create table t_bf_set_foods
(
   set_foods_id         varchar(32) not null,
   set_meal_id          varchar(32) comment '套餐ID',
   food_id              varchar(32) comment '食品Id',
   food_count           int comment '食品数量',
   primary key (set_foods_id)
);

alter table t_bf_set_foods comment '套餐食品';

/*==============================================================*/
/* Table: t_bf_set_meal                                         */
/*==============================================================*/
create table t_bf_set_meal
(
   set_meal_id          varchar(32) not null,
   set_name             varchar(50) comment '套餐名称',
   introduce            varchar(200) comment '套餐说明',
   star_time            datetime comment '套餐开始日期',
   end_time             datetime comment '套餐结束日期',
   price                decimal(7,3) comment '套餐价格',
   privilege            decimal(7,3) comment '套餐优惠',
   status               varchar(20) comment '状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD',
   food_count           int comment '假库存数',
   real_food_count      int comment '真实库存',
   small_pic_id         varchar(32) comment '缩略图',
   orgin_pic_id         varchar(32) comment '原图',
   primary key (set_meal_id)
);

alter table t_bf_set_meal comment '套餐表';

/*==============================================================*/
/* Table: t_bf_user                                             */
/*==============================================================*/
create table t_bf_user
(
   user_id              varchar(32) not null,
   login_name           varchar(50) comment '用户名',
   password             varchar(50) comment '密码',
   status               varchar(20) comment '状态',
   user_name            varchar(100) comment '姓名',
   mobile               varchar(20) comment '手机号',
   weixin               varchar(20) comment '微信号',
   qq                   varchar(30),
   create_time          datetime comment '注册日期',
   create_way           varchar(100) comment '注册方式',
   primary key (user_id)
);

alter table t_bf_user comment '人员表';

/*==============================================================*/
/* Table: t_bf_user_customer                                    */
/*==============================================================*/
create table t_bf_user_customer
(
   user_id              varchar(32) not null,
   customer_level       varchar(30) comment '客户等级',
   credits              int comment '小黄豆数量',
   referrer             varchar(50) comment '推荐人',
   recommend_time       datetime comment '推荐时间',
   address1             varchar(200) comment '常用地址1',
   address2             varchar(200) comment '常用地址2',
   address3             varchar(200) comment '常用地址3',
   primary key (user_id)
);

alter table t_bf_user_customer comment '用户详情';

/*==============================================================*/
/* Table: t_br_user_courier                                     */
/*==============================================================*/
create table t_bf_user_courier
(
   user_id              varchar(32) not null,
   source               varchar(100) comment '来源',
   primary key (user_id)
);

alter table t_bf_user_courier comment '快递员详情';


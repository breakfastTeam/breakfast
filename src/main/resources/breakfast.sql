/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/11/21 星期五 下午 15:49:37                   */
/*==============================================================*/


DROP TABLE IF EXISTS t_bf_address;

DROP TABLE IF EXISTS t_bf_coupon;

DROP TABLE IF EXISTS t_bf_custom_order_detail;

DROP TABLE IF EXISTS t_bf_customer_service;

DROP TABLE IF EXISTS t_bf_express;

DROP TABLE IF EXISTS t_bf_feedback;

DROP TABLE IF EXISTS t_bf_file;

DROP TABLE IF EXISTS t_bf_food;

DROP TABLE IF EXISTS t_bf_food_custom;

DROP TABLE IF EXISTS t_bf_food_detail;

DROP TABLE IF EXISTS t_bf_grade;

DROP TABLE IF EXISTS t_bf_information;

DROP TABLE IF EXISTS t_bf_message;

DROP TABLE IF EXISTS t_bf_order;

DROP TABLE IF EXISTS t_bf_order_detail;

DROP TABLE IF EXISTS t_bf_photo_show;

DROP TABLE IF EXISTS t_bf_provider;

DROP TABLE IF EXISTS t_bf_raw_material;

DROP TABLE IF EXISTS t_bf_set_foods;

DROP TABLE IF EXISTS t_bf_set_meal;

DROP TABLE IF EXISTS t_bf_share;

DROP TABLE IF EXISTS t_bf_user;

DROP TABLE IF EXISTS t_bf_user_customer;

DROP TABLE IF EXISTS t_bf_user_courier;


/*==============================================================*/
/* Table: t_bf_address                                          */
/*==============================================================*/
CREATE TABLE t_bf_address
(
  adddress_id      VARCHAR(32) NOT NULL,
  address_name     VARCHAR(20) COMMENT '地址名',
  address          VARCHAR(200) COMMENT '地址详情',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (adddress_id)
)
  COMMENT '地址表';

/*==============================================================*/
/* Table: t_bf_coupon                                           */
/*==============================================================*/
CREATE TABLE t_bf_coupon
(
  coupon_id        VARCHAR(32) NOT NULL,
  user_id          VARCHAR(32) COMMENT '发放对象ID',
  start_time       DATETIME COMMENT '发放时间',
  end_time         DATETIME COMMENT '截止日期',
  price            DECIMAL(8, 3) COMMENT '价值',
  source           VARCHAR(32) COMMENT '发放人',
  status           VARCHAR(20) COMMENT '状态',
  brief_intro      VARCHAR(200) COMMENT '简介',
  small_pic_id     VARCHAR(32) COMMENT '缩略图',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (coupon_id)
)
  COMMENT '代金券表';

/*==============================================================*/
/* Table: t_bf_custom_order_detail                              */
/*==============================================================*/
CREATE TABLE t_bf_custom_order_detail
(
  detail_id        VARCHAR(32) NOT NULL,
  food_custom_id   VARCHAR(32) COMMENT '定制表ID',
  food_id          VARCHAR(32) COMMENT '食品数量',
  food_count       INT COMMENT '食品数量',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (detail_id)
)
  COMMENT '用户定制详情';

/*==============================================================*/
/* Table: t_bf_customer_service                                 */
/*==============================================================*/
CREATE TABLE t_bf_customer_service
(
  user_id          VARCHAR(32) NOT NULL,
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (user_id)
)
  COMMENT '客服';

/*==============================================================*/
/* Table: t_bf_express                                          */
/*==============================================================*/
CREATE TABLE t_bf_express
(
  express_id       VARCHAR(32) NOT NULL,
  order_id         VARCHAR(32) COMMENT '订单ID',
  courier_id       VARCHAR(32) COMMENT '快递员ID',
  start_time       DATETIME COMMENT '起送时间',
  finish_time      DATETIME COMMENT '送达时间',
  longitude        VARCHAR(30) COMMENT '经度',
  latitude         VARCHAR(30) COMMENT '纬度',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (express_id)
)
  COMMENT '订单配送表';

/*==============================================================*/
/* Table: t_bf_feedback                                         */
/*==============================================================*/
CREATE TABLE t_bf_feedback
(
  feedback_id      VARCHAR(32) NOT NULL,
  user_id          VARCHAR(32) COMMENT '反馈人',
  target_type      VARCHAR(20) COMMENT '反馈对象类别',
  target_id        VARCHAR(32) COMMENT '反馈对象ID',
  content          VARCHAR(500) COMMENT '反馈内容',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (feedback_id)
)
  COMMENT '评价反馈表';

/*==============================================================*/
/* Table: t_bf_file                                             */
/*==============================================================*/
CREATE TABLE t_bf_file
(
  file_id          VARCHAR(32) NOT NULL,
  file_path        VARCHAR(200) COMMENT '文件路径',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (file_id)
)
  COMMENT '文件表';

/*==============================================================*/
/* Table: t_bf_food                                             */
/*==============================================================*/
CREATE TABLE t_bf_food
(
  food_id          VARCHAR(32) NOT NULL
  COMMENT '主键',
  food_name        VARCHAR(50) COMMENT '名称',
  cost             DECIMAL(5, 3) COMMENT '成本',
  price            DECIMAL(5, 3) COMMENT '单价',
  unit             VARCHAR(20) COMMENT '单位',
  brief_intro      VARCHAR(1000) COMMENT '简介',
  status           VARCHAR(20) COMMENT '状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD',
  food_count       INT COMMENT '假库存数',
  real_food_count  INT COMMENT '真实库存',
  small_pic_id     VARCHAR(32) COMMENT '缩略图',
  orgin_pic_id     VARCHAR(32) COMMENT '原图',
  support_snap_up  BOOL COMMENT '是否支持抢购',
  support_exchange BOOL COMMENT '是否支持兑换',
  exchange_count   INT COMMENT '兑换所需黄豆数',
  show_order       INT COMMENT '显示顺序',
  sale_time	       DATETIME ,
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (food_id)
)
  COMMENT '食品表';

/*==============================================================*/
/* Table: t_bf_food_custom                                      */
/*==============================================================*/
CREATE TABLE t_bf_food_custom
(
  food_custom_id    VARCHAR(32) NOT NULL,
  custom_order_name VARCHAR(30) COMMENT '订单名称',
  customer_id       VARCHAR(32) COMMENT '客户ID',
  food_id           VARCHAR(32) COMMENT '食品ID',
  food_count        INT COMMENT '食品数量',
  price             DECIMAL(8, 3) COMMENT '订单售价',
  status            VARCHAR(20) COMMENT '状态',
  create_time       DATETIME COMMENT '创建时间',
  create_by         VARCHAR(32) COMMENT '创建人',
  last_modify_time  DATETIME COMMENT '最后修改时间',
  last_modify_by    VARCHAR(32) COMMENT '最后修改人',
  opt_time          INT COMMENT '操作时间',
  PRIMARY KEY (food_custom_id)
)
  COMMENT '用户定制表';

/*==============================================================*/
/* Table: t_bf_food_detail                                      */
/*==============================================================*/
CREATE TABLE t_bf_food_detail
(
  detail_id          VARCHAR(32) NOT NULL,
  food_id            VARCHAR(32) COMMENT '食品ID',
  raw_material_id    VARCHAR(32) COMMENT '原材料ID',
  raw_material_count INT COMMENT '原材料数量',
  create_time        DATETIME COMMENT '创建时间',
  create_by          VARCHAR(32) COMMENT '创建人',
  last_modify_time   DATETIME COMMENT '最后修改时间',
  last_modify_by     VARCHAR(32) COMMENT '最后修改人',
  opt_time           INT COMMENT '操作时间',
  PRIMARY KEY (detail_id)
)
  COMMENT '原材料食品中间表';

/*==============================================================*/
/* Table: t_bf_grade                                            */
/*==============================================================*/
CREATE TABLE t_bf_grade
(
  grade_id         VARCHAR(32) NOT NULL,
  user_id          VARCHAR(32) COMMENT '评分人',
  target_type      VARCHAR(20) COMMENT '评分对象类别',
  target_id        VARCHAR(32) COMMENT '评分对象ID',
  grade            INT COMMENT '评分',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (grade_id)
)
  COMMENT '评分详情表';

/*==============================================================*/
/* Table: t_bf_information                                      */
/*==============================================================*/
CREATE TABLE t_bf_information
(
  information_id    VARCHAR(32) NOT NULL,
  title            VARCHAR(100) COMMENT '信息标题',
  content          VARCHAR(1000) COMMENT '信息内容',
  information_type VARCHAR(20) COMMENT '信息类型',
  post_time        DATETIME COMMENT '发布日期',
  post_by          VARCHAR(32) COMMENT '发布人',
  small_pic_id     VARCHAR(32) COMMENT '缩略图',
  status           VARCHAR(20) COMMENT '状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (information_id)
)
  COMMENT '公告信息表';

/*==============================================================*/
/* Table: t_bf_message                                          */
/*==============================================================*/
CREATE TABLE t_bf_message
(
  message_id          VARCHAR(32),
  user_id             VARCHAR(32) COMMENT '客户ID',
  customer_service_id VARCHAR(32) COMMENT '客服ID',
  content             VARCHAR(200) COMMENT '内容',
  status              VARCHAR(20) COMMENT '状态',
  create_time         DATETIME COMMENT '创建时间',
  create_by           VARCHAR(32) COMMENT '创建人',
  last_modify_time    DATETIME COMMENT '最后修改时间',
  last_modify_by      VARCHAR(32) COMMENT '最后修改人',
  opt_time            INT COMMENT '操作时间',
  PRIMARY KEY (message_id)
)
  COMMENT '聊天信息表';

/*==============================================================*/
/* Table: t_bf_order                                            */
/*==============================================================*/
CREATE TABLE t_bf_order
(
  order_id          VARCHAR(32) NOT NULL,
  customer_id       VARCHAR(32) COMMENT '客户ID',
  order_no          VARCHAR(32) COMMENT '订单号',
  order_type        VARCHAR(32) COMMENT '类别',
  status            VARCHAR(20) COMMENT '状态',
  consignee_name    VARCHAR(20) COMMENT '收货人姓名',
  consignee_address VARCHAR(200) COMMENT '收货人地址',
  consignee_mobile  VARCHAR(20) COMMENT '收货人手机号',
  order_price       DECIMAL(8, 3)  COMMENT '订单金额',
  exccreadit_count  INT COMMENT '消耗黄豆数',
  used_coupons      VARCHAR(200),
  comments	        VARCHAR(200)  COMMENT '订单备注',
  pre_send_date     DATETIME COMMENT '预约送达日期',
  pre_send_time     VARCHAR(24) COMMENT '预约送达时间',
  create_time       DATETIME COMMENT '创建时间',
  create_by         VARCHAR(32) COMMENT '创建人',
  last_modify_time  DATETIME COMMENT '最后修改时间',
  last_modify_by    VARCHAR(32) COMMENT '最后修改人',
  opt_time          INT COMMENT '操作时间',
  PRIMARY KEY (order_id)
)
  COMMENT '订单表';

/*==============================================================*/
/* Table: t_bf_order_detail                                     */
/*==============================================================*/
CREATE TABLE t_bf_order_detail
(
  detail_id        VARCHAR(32) NOT NULL,
  order_id         VARCHAR(32) COMMENT '订单ID',
  food_obj_id      VARCHAR(32) COMMENT '单品/套餐 ID',
  food_obj_count   INT COMMENT '数量',
  food_obj_type	   varchar(20) COMMENT '单品/套餐',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (detail_id)
)
  COMMENT '订单详情表';

/*==============================================================*/
/* Table: t_bf_photo_show                                       */
/*==============================================================*/
CREATE TABLE t_bf_photo_show
(
  photo_id         VARCHAR(32) NOT NULL,
  orgin_file_id    VARCHAR(32) COMMENT '图片文件ID',
  small_file_id    VARCHAR(32),
  upload_time      DATETIME COMMENT '图片上传日期',
  valid_date       DATETIME COMMENT '图片有效期',
  createBy         VARCHAR(32) COMMENT '上传机器编号',
  status           VARCHAR(30) COMMENT '图片状态',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (photo_id)
)
  COMMENT '图片展示';

/*==============================================================*/
/* Table: t_bf_provider                                         */
/*==============================================================*/
CREATE TABLE t_bf_provider
(
  provider_id       VARCHAR(32),
  provider_name     VARCHAR(50) COMMENT '供应商名称',
  phone             VARCHAR(20) COMMENT '常用电话',
  alternative_phone VARCHAR(20) COMMENT '备用电话',
  address           VARCHAR(100) COMMENT '地址',
  intro             VARCHAR(200) COMMENT '描述',
  status            VARCHAR(20) COMMENT '状态',
  create_time       DATETIME COMMENT '创建时间',
  create_by         VARCHAR(32) COMMENT '创建人',
  last_modify_time  DATETIME COMMENT '最后修改时间',
  last_modify_by    VARCHAR(32) COMMENT '最后修改人',
  opt_time          INT COMMENT '操作时间',
  PRIMARY KEY (provider_id)
)
  COMMENT '供应商';

/*==============================================================*/
/* Table: t_bf_raw_material                                     */
/*==============================================================*/
CREATE TABLE t_bf_raw_material
(
  raw_material_id   VARCHAR(32) NOT NULL,
  raw_material_name VARCHAR(30) COMMENT '原材料名称',
  price             DECIMAL(7, 3) COMMENT '原材料价格',
  provider_id       VARCHAR(32) COMMENT '供应商ID',
  unit              VARCHAR(20) COMMENT '单位',
  status            VARCHAR(20) COMMENT '状态',
  create_time       DATETIME COMMENT '创建时间',
  create_by         VARCHAR(32) COMMENT '创建人',
  last_modify_time  DATETIME COMMENT '最后修改时间',
  last_modify_by    VARCHAR(32) COMMENT '最后修改人',
  opt_time          INT COMMENT '操作时间',
  PRIMARY KEY (raw_material_id)
)
  COMMENT '原材料表';

/*==============================================================*/
/* Table: t_bf_set_foods                                        */
/*==============================================================*/
CREATE TABLE t_bf_set_foods
(
  set_foods_id     VARCHAR(32) NOT NULL,
  set_meal_id      VARCHAR(32) COMMENT '套餐ID',
  food_id          VARCHAR(32) COMMENT '食品Id',
  food_count       INT COMMENT '食品数量',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (set_foods_id)
)
  COMMENT '套餐食品';

/*==============================================================*/
/* Table: t_bf_set_meal                                         */
/*==============================================================*/
CREATE TABLE t_bf_set_meal
(
  set_meal_id      VARCHAR(32) NOT NULL,
  set_name         VARCHAR(50) COMMENT '套餐名称',
  introduce        text COMMENT '套餐说明',
  start_time       DATETIME COMMENT '套餐开始日期',
  end_time         DATETIME COMMENT '套餐结束日期',
  price            DECIMAL(7, 3) COMMENT '套餐价格',
  privilege        DECIMAL(7, 3) COMMENT '套餐优惠',
  status           VARCHAR(20) COMMENT '状态：上架PUTAWAY、下架SOLD_PUT、废弃DISCARD',
  food_count       INT COMMENT '假库存数',
  real_food_count  INT COMMENT '真实库存',
  small_pic_id     VARCHAR(32) COMMENT '缩略图',
  orgin_pic_id     VARCHAR(32) COMMENT '原图',
  support_snap_up  BOOL COMMENT '是否支持抢购',
  support_exchange BOOL COMMENT '是否支持兑换',
  exchange_count   INT COMMENT '兑换所需黄豆数',
  show_order       INT COMMENT '显示顺序',
  sale_time	       DATETIME ,
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (set_meal_id)
)
  COMMENT '套餐表';

/*==============================================================*/
/* Table: t_bf_share                                            */
/*==============================================================*/
CREATE TABLE t_bf_share
(
  share_id         VARCHAR(32) NOT NULL
  COMMENT 'ID',
  share_info       VARCHAR(100) COMMENT '分享内容',
  user_id          VARCHAR(32) COMMENT '分享人',
  status           VARCHAR(20) COMMENT '分享结果状态',
  code             VARCHAR(20) COMMENT '邀请码',
  target           VARCHAR(32) COMMENT '分享对象',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (share_id)
)
  COMMENT '分享信息表';

/*==============================================================*/
/* Table: t_bf_user                                             */
/*==============================================================*/
CREATE TABLE t_bf_user
(
  user_id          VARCHAR(32) NOT NULL,
  login_name       VARCHAR(50) COMMENT '用户名',
  password         VARCHAR(50) COMMENT '密码',
  status           VARCHAR(20) COMMENT '状态',
  user_type        VARCHAR(20) COMMENT '用户类型',
  user_name        VARCHAR(100) COMMENT '姓名',
  sex              VARCHAR(10) COMMENT '性别',
  mobile           VARCHAR(20) COMMENT '手机号',
  weixin           VARCHAR(20) COMMENT '微信号',
  qq               VARCHAR(30),
  register_time    DATETIME COMMENT '注册日期',
  register_way     VARCHAR(100) COMMENT '注册方式',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (user_id)
)
  COMMENT '人员表';

/*==============================================================*/
/* Table: t_bf_user_customer                                    */
/*==============================================================*/
CREATE TABLE t_bf_user_customer
(
  user_id          VARCHAR(32) NOT NULL,
  customer_level   VARCHAR(30) COMMENT '客户等级',
  credits          INT COMMENT '小黄豆数量',
  referrer         VARCHAR(50) COMMENT '推荐人',
  recommend_time   DATETIME COMMENT '推荐时间',
  address1         VARCHAR(200) COMMENT '常用地址1',
  address2         VARCHAR(200) COMMENT '常用地址2',
  address3         VARCHAR(200) COMMENT '常用地址3',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (user_id)
)
  COMMENT '用户详情';

/*==============================================================*/
/* Table: t_bf_user_courier                                     */
/*==============================================================*/
CREATE TABLE t_bf_user_courier
(
  user_id          VARCHAR(32) NOT NULL,
  source           VARCHAR(100) COMMENT '来源',
  create_time      DATETIME COMMENT '创建时间',
  create_by        VARCHAR(32) COMMENT '创建人',
  last_modify_time DATETIME COMMENT '最后修改时间',
  last_modify_by   VARCHAR(32) COMMENT '最后修改人',
  opt_time         BIGINT COMMENT '操作时间',
  PRIMARY KEY (user_id)
)
  COMMENT '快递员详情';


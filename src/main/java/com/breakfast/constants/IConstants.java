package com.breakfast.constants;

import java.sql.Timestamp;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public class IConstants {
    public static final String SEESION_USER_ID = "SEESION_USER_ID";
    public static final String WENHUALU_LNG="113.674";//郑州市文化路经度
    public static int DEFAULT_PAGE_SIZE = 5;
    public static int MONEY_SCALE=2;//钱精确小数点位数
    public static int RED_PAPER_EFFECT_DATE = 30;//红包有效期为30天
    public static String ADMIN = "admin";

    public static final String RETURN_CODE = "rtnCode";
    public static final String RETURN_MESSAGE = "rtnMsg";
    public static final String SUCCESS_CODE = "888888";//操作成功
    public static final String EXCEPTION_CODE = "666666";//服务器异常
    public static final String ERROR_CODE = "000000";//操作失败
    public static final String ERROR = "error";
    public static final String SUCCESS = "success";

    public static final String DESC = "desc";
    public static final String ASC = "asc";
    public static final String OPERATE_SUCCESS="success";
    public static final String OPERATE_ERROR = "error";

    public static final String VALID = "VALID";
    public static final String INVALID = "INVALID";


    /**
     * 人员状态  User.status
     */
    public static final String USER_STATUS_ENABLE = "ENABLE";
    public static final String USER_STATUS_DISABLE = "DISABLE";

    /**
     * 套餐状态
     * 上架PUTAWAY、下架SOLD_PUT、废弃DISCARD
     */
    public static final String SET_MEAL_STATUS_PUTAWAY = "PUTAWAY";
    public static final String SET_MEAL_STATUS_SOLDOUT = "SOLDOUT";
    public static final String SET_MEAL_STATUS_DISCARD = "DISCARD";

    /**
     * 公告状态
     */
    public static final String INFORMATION_STATUS_ENABLE = "ENABLE";
    public static final String INFORMATION_STATUS_DISABLE = "DISCARD";

    /**
     * 订单状态
     */
    public static final String ORDER_STATUS_DRAFT = "DRAFT";
    public static final String ORDER_STATUS_DISTRIBUTION = "DISTRIBUTION";
    public static final String ORDER_STATUS_FINISH = "FINISH";

    public static final String COUPON_STATUS_ENABLE = "ENABLE";
    public static final String COUPON_STATUS_DISABLE = "DISCARD";

    public static final String ENABLE = "ENABLE";
    public static final String DISCARD = "DISCARD";



    public static final String USER_TYPE_ADMIN = "ADMIN";
    public static final String USER_TYPE_CUSTOMER = "CUSTOMER";
    public static final String USER_TYPE_COURIER = "COURIER";
    public static final String USER_TYPE_CUSTOMER_SERVICE = "CUSTOMER_SERVICE";
    public static final int DEFAULT_USER_CREDITS = 200;
    public static final double DEFAULT_USER_COUPON = 2;


    public static final String FOOD_OBJ_TYPE_SETMEAL="SETMEAL";
    public static final String FOOD_OBJ_TYPE_FOOD="FOOD";

}

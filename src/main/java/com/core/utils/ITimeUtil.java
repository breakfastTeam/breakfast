package com.core.utils;

import java.sql.Timestamp;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public class ITimeUtil {
    public static Timestamp getCurrentTime(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return ts;
    }
    public static String getCurrentTimeStr(){
        return getCurrentTime().toString();
    }
}

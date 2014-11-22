package com.core.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public class IUUIDGenerator {
    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        return s.replace("-","");
    }
}

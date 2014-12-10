package com.core.utils;

import com.alibaba.fastjson.JSON;
import com.breakfast.constants.IConstants;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qingfeilee on 2014/11/21.
 * update .k:json-lib to fastjson
 */
public class IMsgUtil {
    private MsgMap<String, String> headMap = new MsgMap<String, String>();//返回报文头部信息
    private boolean isValid = false;//报文是否合法，默认是不合法

    /**
     * 生成报文头部信息
     * @author Felix
     * @param code  String 返回报文代码
     * @param msg String 返回提示信息
     * @return MsgUtil
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public IMsgUtil generateHeadMsg(String code, String msg){
        headMap.put(IConstants.RETURN_CODE, code);
        headMap.put(IConstants.RETURN_MESSAGE, msg);
        this.setHeadMap(headMap);
        return this;
    }

    /**
     * 生成整个报文信息并以JSON格式返回
     * @author Felix
     * @param bodyObj 将要生成的对象
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    @SuppressWarnings("unchecked")
    public String generateRtnMsg(Object bodyObj) {

        String head = JSON.toJSONString(this.headMap);
        String body =  JSON.toJSONString(bodyObj);
        String headStr = "{\"head\":" + head + ",";
        String bodyStr = "\"body\":{\"results\":" + body + "}}";
        return headStr + bodyStr;
    }


    /**
     * 生成整个报文信息并以JSON格式返回，消息体为空
     * @author Felix
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public String generateRtnMsg(){
        String head = JSON.toJSONString(this.headMap);
        String headStr="{\"head\":"+head+",";
        String bodyStr="\"body\":{}}";
        return headStr+bodyStr;
    }

    /**
     * 生成整个报文信息并以JSON格式返回，消息体为空
     * @author Felix
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public String generateMsg(String code, String msg) {
        Map<String, Object> map = Maps.newHashMapWithExpectedSize(2);
        this.headMap.put(IConstants.RETURN_CODE, code);
        this.headMap.put(IConstants.RETURN_MESSAGE, msg);
        map.put("head", this.headMap);
        map.put("body", "");
        return JSON.toJSONString(map);
    }

    /**
     * 生成整个报文信息并以JSON格式返回，消息体为空
     * @author Felix
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public Map generateMsg(String code, String msg ,Object bodyObj) {
        Map<String, Object> map = Maps.newHashMapWithExpectedSize(2);
        this.headMap.put(IConstants.RETURN_CODE, code);
        this.headMap.put(IConstants.RETURN_MESSAGE, msg);
        map.put("head", this.headMap);
        map.put("body", bodyObj);
        return map;
    }

    private void setHeadMap(MsgMap<String, String> headMap){
        this.headMap = headMap;
    }

    private MsgMap<String, String> getHeadMap(){
        return this.headMap;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

}

/**
 * 名称:MsgMap
 * 描述:自定义Map以防止调用generateResData时候传值混乱的问题
 * 类型:工具类
 * 最近修改时间:
 * @since  2014-04-24 08:40
 * @author Felix
 */
@SuppressWarnings("serial")
class MsgMap<T, TT> extends HashMap<T, TT>{
    public MsgMap(){
        super(2);
    }
}

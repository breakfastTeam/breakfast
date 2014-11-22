package com.core.utils;

import com.breakfast.constants.IConstants;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by qingfeilee on 2014/11/21.
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
     * @param bodyList List 将要生成的对象集合
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    @SuppressWarnings("unchecked")
    public String generateRtnMsg(List bodyList){

        JSONObject jsonHead=JSONObject.fromObject(this.getHeadMap());
        JSONArray jsonBody=JSONArray.fromObject(bodyList);
        String headStr="{\"head\":"+jsonHead.toString()+",";
        String bodyStr="\"body\":{\"results\":"+jsonBody.toString()+"}}";
        return headStr+bodyStr;
    }

    /**
     * 生成整个报文信息并以JSON格式返回
     * @author Felix
     * @param bodyMap Map 将要生成的对象
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public String generateRtnMsg(Map<String, Object> bodyMap){
        JSONObject jsonHead=JSONObject.fromObject(this.getHeadMap());
        JSONObject jsonBody=JSONObject.fromObject(bodyMap);
        String headStr="{\"head\":"+jsonHead.toString()+",";
        String bodyStr="\"body\":"+jsonBody.toString()+"}";
        return headStr+bodyStr;
    }
    /**
     * 生成整个报文信息并以JSON格式返回，消息体为空
     * @author Felix
     * @return String
     * @since 2014-04-24 09:09
     * 变更记录：
     */
    public String generateRtnMsg(){
        JSONObject jsonHead=JSONObject.fromObject(this.getHeadMap());
        String headStr="{\"head\":"+jsonHead.toString()+",";
        String bodyStr="\"body\":{}}";
        return headStr+bodyStr;
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
        super();
    }
}

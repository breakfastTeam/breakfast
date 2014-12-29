package com.breakfast.provider;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;
import org.jooq.util.TableDefinition;

/**
 * Created by kkk on 14/11/20.
 */
public class AsInDatabaseStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaIdentifier(Definition definition) {
        String name=super.getJavaIdentifier(definition);
        if(name.startsWith("T_BF_")){
            name=name.substring(5);
        }
        name=camelName(name);
        if(definition instanceof TableDefinition){
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name;
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        String name=super.getJavaClassName(definition, mode);
        if(name.startsWith("TBf")&&name.length()>3&&!mode.name().equals("POJO")){
            name=name.substring(3);
            name="T"+name;
        }else if (mode.name().equals("POJO")) {
            name=name.substring(3);
        }
        return name;
    }

    @Override
    public String getJavaMemberName(Definition definition, Mode mode) {
        String name=super.getJavaMemberName(definition, mode);
        return name;
    }

    public static String camelName(String name) {
        StringBuilder result = new StringBuilder();
        // 快速检查
        if (name == null || name.isEmpty()) {
            // 没必要转换
            return "";
        } else if (!name.contains("_")) {
            // 不含下划线，仅将首字母小写
//            return name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        // 用下划线将原始字符串分割
        String camels[] = name.split("_");
        for (String camel :  camels) {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty()) {
                continue;
            }
            // 处理真正的驼峰片段
            if (result.length() == 0) {
                // 第一个驼峰片段，全部字母都小写
                result.append(camel.toLowerCase());
            } else {
                // 其他的驼峰片段，首字母大写
                result.append(camel.substring(0, 1).toUpperCase());
                result.append(camel.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
    public static String convertToJavaIdentifier(String literal) {

        StringBuilder sb = new StringBuilder();

        if ("".equals(literal)) {
            return "_";
        }

        for (int i = 0; i < literal.length(); i++) {
            char c = literal.charAt(i);

            if (!Character.isJavaIdentifierPart(c)) {
                sb.append(escape(c));
            }
            else if (i == 0 && !Character.isJavaIdentifierStart(literal.charAt(0))) {
                sb.append("_");
                sb.append(c);
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private static String escape(char c) {
        if (c == ' ' || c == '-')
            return "_";
        else
            return "_" + Integer.toHexString(c);
    }
}

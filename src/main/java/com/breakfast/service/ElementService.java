package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;

import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
public interface ElementService {

    /**
     * 获取厨房图片
     * @return
     */
    Element getElementById(String elementId);

    Map<String,Element> getElementsByIds(List<String> elementIds);
}

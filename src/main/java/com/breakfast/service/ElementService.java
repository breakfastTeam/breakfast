package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;

import java.util.List;

/**
 * Created by kkk .
 */
public interface ElementService {

    /**
     * 获取厨房图片
     * @return
     */
    Element getElementById(String elementId);

}

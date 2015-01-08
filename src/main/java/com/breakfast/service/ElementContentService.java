package com.breakfast.service;

import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.PhotoShow;

import java.util.List;

/**
 * Created by kkk .
 */
public interface ElementContentService {

    /**
     * 获取厨房图片
     * @return
     */
    List<ElementContent> findElementContentByObjId(String objId);

}

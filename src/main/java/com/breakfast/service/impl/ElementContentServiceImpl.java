package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TElementContent;
import com.breakfast.domain.tables.TPhotoShow;
import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.PhotoShow;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.ElementService;
import com.breakfast.service.FileService;
import com.breakfast.service.PhotoShowService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class ElementContentServiceImpl implements ElementContentService {

    @Autowired
    DSLContext creator;

    @Autowired
    ElementService elementService;


    @Override
    public List<ElementContent> findElementContentByObjId(String objId){
        TElementContent ec = Tables.ElementContent.as("ec");
        List<ElementContent> elementContents = creator.selectFrom(ec)
                .where(ec.objectId.equal(objId))
                .orderBy(ec.createTime)
                .fetchInto(ElementContent.class);
        for (ElementContent elementContent:elementContents){
            Element element = elementService.getElementById(elementContent.getElementId());
            elementContent.setElement(element);
        }
        return elementContents;
    }
}

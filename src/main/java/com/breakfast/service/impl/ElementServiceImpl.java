package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TElement;
import com.breakfast.domain.tables.TElementContent;
import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.ElementService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class ElementServiceImpl implements ElementService {

    @Autowired
    DSLContext creator;


    @Override
    public Element getElementById(String elementId){
        TElement e = Tables.Element.as("e");
        Element element = creator.selectFrom(e)
                .where(e.elementId.equal(elementId))
                .fetchAnyInto(Element.class);
        return element;
    }

    @Override
    public Map<String,Element> getElementsByIds(List<String> elementIds) {
        TElement e = Tables.Element.as("e");
        Map<String,Element> elements = creator.selectFrom(e)
                .where(e.elementId.in(elementIds))
                .fetchMap(e.elementId, Element.class);
        return elements;
    }
}

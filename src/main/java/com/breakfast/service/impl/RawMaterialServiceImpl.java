package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TRawMaterial;
import com.breakfast.domain.tables.pojos.RawMaterial;
import com.breakfast.service.RawMaterialService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class RawMaterialServiceImpl implements RawMaterialService {

    @Autowired
    DSLContext creator;

    @Override
    public List<RawMaterial> findRawMaterial(){
        TRawMaterial rawMaterial = Tables.RawMaterial.as("r");
        List<RawMaterial> rawMaterials = creator.selectFrom(rawMaterial)
                .where(rawMaterial.status.notEqual(IConstants.DISCARD))
                .fetch().into(RawMaterial.class);
        return rawMaterials;
    }
}

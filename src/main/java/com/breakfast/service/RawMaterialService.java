package com.breakfast.service;

import com.breakfast.domain.tables.pojos.RawMaterial;

import java.util.List;

/**
 * Created by kkk .
 */
public interface RawMaterialService {

    /**
     * 获取食材材料信息
     * @return
     */
    List<RawMaterial> findRawMaterial();

}

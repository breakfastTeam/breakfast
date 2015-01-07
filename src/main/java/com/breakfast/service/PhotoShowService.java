package com.breakfast.service;

import com.breakfast.domain.tables.pojos.PhotoShow;
import com.breakfast.domain.tables.pojos.RawMaterial;

import java.util.List;

/**
 * Created by kkk .
 */
public interface PhotoShowService {

    /**
     * 获取厨房图片
     * @return
     */
    List<PhotoShow> findPhotoShow();

}

package com.trkdmrl.exchangeapp.commonservice.service;

import com.trkdmrl.exchangeapp.commonservice.entity.BaseEntity;

import java.util.List;

public interface BaseService<Entity extends BaseEntity, DTO> {

    void create(DTO dto);

    void update(DTO dto);

    void delete(DTO dto);

    DTO findById(Long id);

}
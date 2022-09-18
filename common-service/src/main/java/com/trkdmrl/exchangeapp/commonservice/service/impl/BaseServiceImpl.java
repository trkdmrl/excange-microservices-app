package com.trkdmrl.exchangeapp.commonservice.service.impl;

import com.google.common.base.Preconditions;
import com.trkdmrl.exchangeapp.commonservice.converter.IObjectMapper;
import com.trkdmrl.exchangeapp.commonservice.entity.BaseEntity;
import com.trkdmrl.exchangeapp.commonservice.model.BaseModel;
import com.trkdmrl.exchangeapp.commonservice.repository.BaseRepository;
import com.trkdmrl.exchangeapp.commonservice.service.BaseService;
import org.springframework.transaction.annotation.Transactional;


public class BaseServiceImpl<Entity extends BaseEntity, DTO extends BaseModel>
        implements BaseService<Entity, DTO> {

    protected IObjectMapper<Entity, DTO> objectMapper;

    protected BaseRepository<Entity> repository;

    public BaseServiceImpl(IObjectMapper<Entity, DTO> objectMapper, BaseRepository<Entity> repository) {
        this.objectMapper = objectMapper;
        this.repository = repository;
    }

    @Transactional
    @Override
    public void create(DTO dto) {
        Preconditions.checkNotNull(dto);
        Entity entity = objectMapper.toEntity(dto);
        repository.insert(entity);
    }

    @Transactional
    @Override
    public void update(DTO dto) {
        Preconditions.checkNotNull(dto);
        Entity entity = objectMapper.toEntity(dto);
        repository.updateByPrimaryKey(entity);
    }


    @Transactional
    @Override
    public void delete(DTO dto) {
        Preconditions.checkNotNull(dto);
        Entity entity = objectMapper.toEntity(dto);
        repository.deleteByPrimaryKey(entity.getId());
    }

    @Override
    public DTO findById(Long id) {
        Preconditions.checkNotNull(id);
        Entity entity = repository.selectByPrimaryKey(id);
         return objectMapper.toDto(null);
    }
}

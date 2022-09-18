package com.trkdmrl.exchangeapp.commonservice.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.trkdmrl.exchangeapp.commonservice.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<Entity extends BaseEntity> extends PagingAndSortingRepository<Entity, Long> {

    void deleteByPrimaryKey(Long id);

    void insert(Entity entity);

    void updateByPrimaryKey(Entity entity);

    Entity selectByPrimaryKey(Long id);
}
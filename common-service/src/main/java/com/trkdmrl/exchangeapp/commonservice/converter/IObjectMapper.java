package com.trkdmrl.exchangeapp.commonservice.converter;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import static com.trkdmrl.exchangeapp.commonservice.utils.StreamUtils.asStream;

public interface IObjectMapper<ENTITY, DTO> extends Serializable {

    default List<DTO> toDtos(List<ENTITY> entityList) {
        return asStream(entityList).map(this::toDto).collect(Collectors.toList());
    }

    /**
     * Maps an entity to a dto.
     */
    DTO toDto(ENTITY entity);

    default List<ENTITY> toEntities(List<DTO> dtoList) {
        return asStream(dtoList).map(this::toEntity).collect(Collectors.toList());
    }

    /**
     * Maps a dto to an entity.
     */
    ENTITY toEntity(DTO dto);
}

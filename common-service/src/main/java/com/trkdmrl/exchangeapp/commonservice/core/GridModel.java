package com.trkdmrl.exchangeapp.commonservice.core;

import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public class GridModel<T> {

    private T content;
    private int page;
    private int size;
    private long total;

    private Sort sort;

    public GridModel(T content, int page, int size, long total) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.total = total;
    }

    public GridModel(T content, int page, int size, long total, Sort sort) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.total = total;
        this.sort = sort;
    }
}
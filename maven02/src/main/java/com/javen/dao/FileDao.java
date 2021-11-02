package com.javen.dao;

import com.javen.model.Files;

import java.util.List;

public interface FileDao {
    public int insert(Files file);

    public List<Files> show();
}

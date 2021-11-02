package com.javen.service;

import com.javen.model.Files;

import java.util.List;

public interface IFileService {
    public int insert(Files file);

    public List<Files> show();
}

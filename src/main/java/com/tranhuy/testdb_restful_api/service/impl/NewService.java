package com.tranhuy.testdb_restful_api.service.impl;

import com.tranhuy.testdb_restful_api.dto.NewDTO;
import com.tranhuy.testdb_restful_api.repository.NewRepository;
import com.tranhuy.testdb_restful_api.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements INewService {
    @Autowired
    private NewRepository newRepository;

    @Override
    public NewDTO save(NewDTO newDTO) {
        return null;
    }
}

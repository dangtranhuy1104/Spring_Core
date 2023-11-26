package com.tranhuy.testdb_restful_api.api;

import com.tranhuy.testdb_restful_api.dto.NewDTO;
import com.tranhuy.testdb_restful_api.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NewAPI {
    @Autowired
    private INewService newService;

    @PostMapping("/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return model;
    }

}

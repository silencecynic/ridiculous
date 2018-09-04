package com.api.provider.handler;

import com.api.commons.http.HttpModel;
import com.api.provider.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping (value = "/api/v1")
@RestController
public class DomainHandler {

    private DomainService domainService;

    @Autowired
    public DomainHandler (DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping (value = "/domain/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public HttpModel getDomain() {
        return domainService.get();
    }



}

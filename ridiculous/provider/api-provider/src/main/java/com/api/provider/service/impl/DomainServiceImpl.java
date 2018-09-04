package com.api.provider.service.impl;

import com.api.commons.http.HttpModel;
import com.api.provider.domain.Domain;
import com.api.provider.service.DomainService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class DomainServiceImpl implements DomainService {


    @Override
    public HttpModel get() {

        Domain domain = new Domain();
        domain.setAttr("attr");
        domain.setName("name");
        return HttpModel.build()
                .setResponse(domain)
                .setMessages("OK")
                .setStatus(HttpServletResponse.SC_OK);

    }
}

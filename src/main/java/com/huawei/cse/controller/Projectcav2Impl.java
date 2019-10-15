package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-15T08:56:07.905Z")

@RestSchema(schemaId = "projectcav2")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectcav2Impl {

    @Autowired
    private Projectcav2Delegate userProjectcav2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectcav2Delegate.helloworld(name);
    }

}

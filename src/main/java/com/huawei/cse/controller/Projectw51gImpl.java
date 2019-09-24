package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-24T06:20:55.644Z")

@RestSchema(schemaId = "projectw51g")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectw51gImpl {

    @Autowired
    private Projectw51gDelegate userProjectw51gDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectw51gDelegate.helloworld(name);
    }

}

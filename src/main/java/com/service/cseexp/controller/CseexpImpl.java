package com.service.cseexp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-01T15:06:20.014Z")

@RpcSchema(schemaId = "cseexp")
public class CseexpImpl implements Cseexp{

    @Autowired
    private CseexpDelegate cseexpDelegate;


    public String helloworld(String name) {

        return cseexpDelegate.helloworld(name);
    }

}

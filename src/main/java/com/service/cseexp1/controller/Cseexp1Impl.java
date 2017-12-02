package com.service.cseexp1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-02T03:05:51.858Z")

@RpcSchema(schemaId = "cseexp1")
public class Cseexp1Impl implements Cseexp1{

    @Autowired
    private Cseexp1Delegate cseexp1Delegate;


    public String helloworld(String name) {

        return cseexp1Delegate.helloworld(name);
    }

}

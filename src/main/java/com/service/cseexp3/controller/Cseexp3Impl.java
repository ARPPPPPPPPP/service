package com.service.cseexp3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-02T03:28:55.841Z")

@RpcSchema(schemaId = "cseexp3")
public class Cseexp3Impl implements Cseexp3{

    @Autowired
    private Cseexp3Delegate cseexp3Delegate;


    public String helloworld(String name) {

        return cseexp3Delegate.helloworld(name);
    }

}

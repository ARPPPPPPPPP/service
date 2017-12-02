package com.service.cseexp2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-02T03:27:36.823Z")

@RpcSchema(schemaId = "cseexp2")
public class Cseexp2Impl implements Cseexp2{

    @Autowired
    private Cseexp2Delegate cseexp2Delegate;


    public String helloworld(String name) {

        return cseexp2Delegate.helloworld(name);
    }

}

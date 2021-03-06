package com.firmboy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-25T18:27:51.924+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://firmboy.com/", name = "CalculatorService")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://firmboy.com/", className = "com.firmboy.Add")
    @WebMethod
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://firmboy.com/", className = "com.firmboy.AddResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "concat", targetNamespace = "http://firmboy.com/", className = "com.firmboy.Concat")
    @WebMethod
    @ResponseWrapper(localName = "concatResponse", targetNamespace = "http://firmboy.com/", className = "com.firmboy.ConcatResponse")
    public java.lang.String concat(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}

package com.restsoap.soapcall.service;

import com.restsoap.soapcall.com.dataaccess.generated.calculator.*;
import com.restsoap.soapcall.utils.CalculatorActionConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class CalculatorClient extends WebServiceGatewaySupport {

    @Autowired
    private CalculatorActionConst calculatorActionConst;

    public CalculatorClient(String packageToScan) {
        getWebServiceTemplate().afterPropertiesSet();
        var marshal = new Jaxb2Marshaller();
        marshal.setPackagesToScan(packageToScan);
        getWebServiceTemplate().setMarshaller(marshal);
        getWebServiceTemplate().setUnmarshaller(marshal);
    }

    public AddResponse add(Add request) {
       
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback(calculatorActionConst.getAddAction()));
    }

    public SubtractResponse subtract(Subtract request) {
        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback(calculatorActionConst.getSubtractAction()));
    }

    public MultiplyResponse multiply(Multiply request) {
        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback(calculatorActionConst.getMultiplyAction()));
    }

    public DivideResponse divide(Divide request) {
        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback(calculatorActionConst.getDivideAction()));
    }
}

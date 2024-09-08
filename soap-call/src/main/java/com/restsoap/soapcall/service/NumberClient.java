package com.restsoap.soapcall.service;

import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToDollars;
import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToDollarsResponse;
import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToWords;
import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToWordsResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class NumberClient extends WebServiceGatewaySupport {

    public NumberClient(String packageToScan) {
        getWebServiceTemplate().afterPropertiesSet();
        var marshal = new Jaxb2Marshaller();
        marshal.setPackagesToScan(packageToScan);
        getWebServiceTemplate().setMarshaller(marshal);
        getWebServiceTemplate().setUnmarshaller(marshal);
    }

    public NumberToWordsResponse numberToWords(NumberToWords request) {
        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(
                request);
    }

    public NumberToDollarsResponse numberToDollars(NumberToDollars request) {
        return (NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}

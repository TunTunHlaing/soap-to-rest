package com.restsoap.soapcall.service;

import com.restsoap.soapcall.com.dataaccess.generated.NumberToWords;
import com.restsoap.soapcall.com.dataaccess.generated.NumberToWordsResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class SoapRestClient extends WebServiceGatewaySupport {

    public SoapRestClient(String defaultUrl, String scanPackage) {
        super();
        setDefaultUri(defaultUrl);
        getWebServiceTemplate().afterPropertiesSet();
        var marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(scanPackage);

        setMarshaller(marshaller);
        setUnmarshaller(marshaller);
    }


    public NumberToWordsResponse numberToWords(NumberToWords request) {
        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(
                request);
    }
}

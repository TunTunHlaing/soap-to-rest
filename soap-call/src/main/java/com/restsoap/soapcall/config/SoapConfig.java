package com.restsoap.soapcall.config;

import com.restsoap.soapcall.service.SoapRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {

    @Value("${soap.default.uri}")
    private String DEFAULT_URI;
    @Value("${soap.scan.package}")
    private String PACKAGE_SCAN;

    @Bean
    public SoapRestClient soapRestClient() {
        var soapRestClient = new SoapRestClient(DEFAULT_URI, PACKAGE_SCAN);
        soapRestClient.setDefaultUri(DEFAULT_URI);
        return soapRestClient;
    }
}

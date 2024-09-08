package com.restsoap.soapcall.config;

import com.restsoap.soapcall.service.CalculatorClient;
import com.restsoap.soapcall.service.NumberClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {

    @Value("${soap.number.default.uri}")
    private String NUMBER_DEFAULT_URI;

    @Value("${soap.number.scan.package}")
    private String NUMBER_PACKAGE_SCAN;

    @Value("${soap.calculator.default.uri}")
    private String CALCULATOR_DEFAULT_URI;

    @Value("${soap.calculator.scan.package}")
    private String CALCULATOR_PACKAGE_SCAN;

    @Bean
    public CalculatorClient calculatorClient() {
        CalculatorClient calculatorClient = new CalculatorClient(CALCULATOR_PACKAGE_SCAN);
        calculatorClient.setDefaultUri(CALCULATOR_DEFAULT_URI);
        return calculatorClient;
    }

    @Bean
    public NumberClient numberClient() {
        NumberClient numberClient = new NumberClient(NUMBER_PACKAGE_SCAN);
        numberClient.setDefaultUri(NUMBER_DEFAULT_URI);
        return numberClient;
    }
}

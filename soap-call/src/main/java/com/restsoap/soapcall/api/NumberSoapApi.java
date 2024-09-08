package com.restsoap.soapcall.api;

import com.restsoap.soapcall.service.SoapRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;

@RestController()
@RequestMapping("soap-call")
public class NumberSoapApi {

    @Autowired
    private SoapRestService service;

    @GetMapping("convert/{number}")
    public String convertNumberToWords(@PathVariable("number") BigInteger number) {
        return service.convertNumberToString(number);
    }

    @GetMapping("convert/dollars/{number}")
    public String convertNumberToDollars(@PathVariable("number") BigDecimal number) {
        return service.numberToDollars(number);
    }
}

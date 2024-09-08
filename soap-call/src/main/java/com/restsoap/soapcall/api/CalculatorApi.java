package com.restsoap.soapcall.api;

import com.restsoap.soapcall.service.CalculatorClient;
import com.restsoap.soapcall.service.SoapRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("soap-call")
public class CalculatorApi {

    @Autowired
    private SoapRestService service;

    @GetMapping("add/{num1}/{num2}")
    public Integer add(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return service.add(num1, num2);
    }

    @GetMapping("subtract/{num1}/{num12}")
    public Integer subtract(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return service.subtract(num1, num2);
    }

    @GetMapping("multiply/{num1}/{num12}")
    public Integer multiply(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping("divide/{num1}/{num12}")
    public Integer divide(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return service.divide(num1, num2);
    }
}

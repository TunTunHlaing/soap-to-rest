package com.restsoap.soapcall.service;

import com.restsoap.soapcall.com.dataaccess.generated.calculator.Add;
import com.restsoap.soapcall.com.dataaccess.generated.calculator.Divide;
import com.restsoap.soapcall.com.dataaccess.generated.calculator.Multiply;
import com.restsoap.soapcall.com.dataaccess.generated.calculator.Subtract;
import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToDollars;
import com.restsoap.soapcall.com.dataaccess.generated.number.NumberToWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class SoapRestService {

    @Autowired
    private NumberClient numberClient;
    @Autowired
    private CalculatorClient calculatorClient;

    // Number
    public String convertNumberToString(BigInteger number) {
        var numberToWords = new NumberToWords();
        numberToWords.setUbiNum(number);
        return numberClient.numberToWords(numberToWords).getNumberToWordsResult();
    }

    public String numberToDollars (BigDecimal number) {
        var numberToDollars = new NumberToDollars();
        numberToDollars.setDNum(number);
        return numberClient.numberToDollars(numberToDollars).getNumberToDollarsResult();
    }

    // Calculator
    public Integer add(Integer dig1, Integer dig2) {
        var request = new Add();
        request.setIntA(dig1);
        request.setIntB(dig2);
        return calculatorClient.add(request).getAddResult();
    }

    public Integer subtract(Integer dig1, Integer dig2) {
        var request = new Subtract();
        request.setIntA(dig1);
        request.setIntB(dig2);
        return calculatorClient.subtract(request).getSubtractResult();
    }

    public Integer multiply(Integer dig1, Integer dig2) {
        var request = new Multiply();
        request.setIntA(dig1);
        request.setIntB(dig2);
        return calculatorClient.multiply(request).getMultiplyResult();
    }

    public Integer divide(Integer dig1, Integer dig2) {
        var request = new Divide();
        request.setIntA(dig1);
        request.setIntB(dig2);
        return calculatorClient.divide(request).getDivideResult();
    }
}

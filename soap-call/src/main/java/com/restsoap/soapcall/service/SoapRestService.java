package com.restsoap.soapcall.service;

import com.restsoap.soapcall.com.dataaccess.generated.NumberToWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class SoapRestService {

    @Autowired
    private SoapRestClient client;

    public String convertNumberToString(BigInteger number) {
        var numberToWords = new NumberToWords();
        numberToWords.setUbiNum(number);
        return client.numberToWords(numberToWords).getNumberToWordsResult();
    }
}

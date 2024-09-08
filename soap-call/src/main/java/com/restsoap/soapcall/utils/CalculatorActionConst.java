package com.restsoap.soapcall.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalculatorActionConst {

    @Value("${soap.calculator.action.add}")
    private  String addAction;
    @Value("${soap.calculator.action.subtract}")
    private  String subtractAction;
    @Value("${soap.calculator.action.multiply}")
    private  String multiplyAction;
    @Value("${soap.calculator.action.divide}")
    private  String divideAction;

    public  String getAddAction() {
        return addAction;
    }

    public  String getSubtractAction() {
        return subtractAction;
    }

    public  String getMultiplyAction() {
        return multiplyAction;
    }

    public  String getDivideAction() {
        return divideAction;
    }
}

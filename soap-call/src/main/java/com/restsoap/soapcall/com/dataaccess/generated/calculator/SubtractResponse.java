
package com.restsoap.soapcall.com.dataaccess.generated.calculator;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubtractResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subtractResult"
})
@XmlRootElement(name = "SubtractResponse")
public class SubtractResponse {

    @XmlElement(name = "SubtractResult")
    protected int subtractResult;

    /**
     * Gets the value of the subtractResult property.
     * 
     */
    public int getSubtractResult() {
        return subtractResult;
    }

    /**
     * Sets the value of the subtractResult property.
     * 
     */
    public void setSubtractResult(int value) {
        this.subtractResult = value;
    }

}

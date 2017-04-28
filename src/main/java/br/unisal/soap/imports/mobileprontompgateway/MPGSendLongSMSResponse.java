
package br.unisal.soap.imports.mobileprontompgateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MPG_Send_Long_SMSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mpgSendLongSMSResult"
})
@XmlRootElement(name = "MPG_Send_Long_SMSResponse")
public class MPGSendLongSMSResponse {

    @XmlElement(name = "MPG_Send_Long_SMSResult")
    protected String mpgSendLongSMSResult;

    /**
     * Obtém o valor da propriedade mpgSendLongSMSResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPGSendLongSMSResult() {
        return mpgSendLongSMSResult;
    }

    /**
     * Define o valor da propriedade mpgSendLongSMSResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPGSendLongSMSResult(String value) {
        this.mpgSendLongSMSResult = value;
    }

}

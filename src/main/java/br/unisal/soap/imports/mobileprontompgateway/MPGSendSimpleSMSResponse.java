
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
 *         &lt;element name="MPG_SendSimple_SMSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mpgSendSimpleSMSResult"
})
@XmlRootElement(name = "MPG_SendSimple_SMSResponse")
public class MPGSendSimpleSMSResponse {

    @XmlElement(name = "MPG_SendSimple_SMSResult")
    protected String mpgSendSimpleSMSResult;

    /**
     * Obtém o valor da propriedade mpgSendSimpleSMSResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPGSendSimpleSMSResult() {
        return mpgSendSimpleSMSResult;
    }

    /**
     * Define o valor da propriedade mpgSendSimpleSMSResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPGSendSimpleSMSResult(String value) {
        this.mpgSendSimpleSMSResult = value;
    }

}

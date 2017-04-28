
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
 *         &lt;element name="MPG_Calculate_Message_Length_UTF8_or_UTF16Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mpgCalculateMessageLengthUTF8OrUTF16Result"
})
@XmlRootElement(name = "MPG_Calculate_Message_Length_UTF8_or_UTF16Response")
public class MPGCalculateMessageLengthUTF8OrUTF16Response {

    @XmlElement(name = "MPG_Calculate_Message_Length_UTF8_or_UTF16Result")
    protected int mpgCalculateMessageLengthUTF8OrUTF16Result;

    /**
     * Obtém o valor da propriedade mpgCalculateMessageLengthUTF8OrUTF16Result.
     * 
     */
    public int getMPGCalculateMessageLengthUTF8OrUTF16Result() {
        return mpgCalculateMessageLengthUTF8OrUTF16Result;
    }

    /**
     * Define o valor da propriedade mpgCalculateMessageLengthUTF8OrUTF16Result.
     * 
     */
    public void setMPGCalculateMessageLengthUTF8OrUTF16Result(int value) {
        this.mpgCalculateMessageLengthUTF8OrUTF16Result = value;
    }

}


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
 *         &lt;element name="MPG_Query01Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mpgQuery01Result",
    "status"
})
@XmlRootElement(name = "MPG_Query01Response")
public class MPGQuery01Response {

    @XmlElement(name = "MPG_Query01Result")
    protected String mpgQuery01Result;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Obtém o valor da propriedade mpgQuery01Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPGQuery01Result() {
        return mpgQuery01Result;
    }

    /**
     * Define o valor da propriedade mpgQuery01Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPGQuery01Result(String value) {
        this.mpgQuery01Result = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}

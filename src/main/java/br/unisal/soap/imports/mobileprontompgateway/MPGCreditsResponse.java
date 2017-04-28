
package br.unisal.soap.imports.mobileprontompgateway;

import java.math.BigDecimal;
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
 *         &lt;element name="MPG_CreditsResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="v_st_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mpgCreditsResult",
    "vStStatus"
})
@XmlRootElement(name = "MPG_CreditsResponse")
public class MPGCreditsResponse {

    @XmlElement(name = "MPG_CreditsResult", required = true)
    protected BigDecimal mpgCreditsResult;
    @XmlElement(name = "v_st_Status")
    protected String vStStatus;

    /**
     * Obtém o valor da propriedade mpgCreditsResult.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPGCreditsResult() {
        return mpgCreditsResult;
    }

    /**
     * Define o valor da propriedade mpgCreditsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPGCreditsResult(BigDecimal value) {
        this.mpgCreditsResult = value;
    }

    /**
     * Obtém o valor da propriedade vStStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVStStatus() {
        return vStStatus;
    }

    /**
     * Define o valor da propriedade vStStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVStStatus(String value) {
        this.vStStatus = value;
    }

}

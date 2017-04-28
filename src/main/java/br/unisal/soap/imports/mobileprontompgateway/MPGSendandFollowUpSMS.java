
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
 *         &lt;element name="Credencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Principal_User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aux_User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "credencial",
    "token",
    "principalUser",
    "auxUser",
    "mobile",
    "sendProject",
    "message"
})
@XmlRootElement(name = "MPG_SendandFollowUp_SMS")
public class MPGSendandFollowUpSMS {

    @XmlElement(name = "Credencial")
    protected String credencial;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "Principal_User")
    protected String principalUser;
    @XmlElement(name = "Aux_User")
    protected String auxUser;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Send_Project")
    protected String sendProject;
    @XmlElement(name = "Message")
    protected String message;

    /**
     * Obtém o valor da propriedade credencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredencial() {
        return credencial;
    }

    /**
     * Define o valor da propriedade credencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredencial(String value) {
        this.credencial = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade principalUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalUser() {
        return principalUser;
    }

    /**
     * Define o valor da propriedade principalUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalUser(String value) {
        this.principalUser = value;
    }

    /**
     * Obtém o valor da propriedade auxUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxUser() {
        return auxUser;
    }

    /**
     * Define o valor da propriedade auxUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxUser(String value) {
        this.auxUser = value;
    }

    /**
     * Obtém o valor da propriedade mobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Define o valor da propriedade mobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Obtém o valor da propriedade sendProject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendProject() {
        return sendProject;
    }

    /**
     * Define o valor da propriedade sendProject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendProject(String value) {
        this.sendProject = value;
    }

    /**
     * Obtém o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}

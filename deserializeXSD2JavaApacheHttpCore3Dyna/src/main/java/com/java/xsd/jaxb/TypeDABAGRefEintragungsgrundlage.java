//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Ref.Eintragungsgrundlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Ref.Eintragungsgrundlage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ref.eintragungsgrundlage" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Ref.Eintragungsgrundlage")
public class TypeDABAGRefEintragungsgrundlage {

    @XmlAttribute(name = "ref.eintragungsgrundlage", required = true)
    protected String refEintragungsgrundlage;

    /**
     * Gets the value of the refEintragungsgrundlage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefEintragungsgrundlage() {
        return refEintragungsgrundlage;
    }

    /**
     * Sets the value of the refEintragungsgrundlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefEintragungsgrundlage(String value) {
        this.refEintragungsgrundlage = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Basisnachricht">
 *       &lt;sequence>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fehlertext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fachdaten"
})
@XmlRootElement(name = "nachricht.vstr.fehlermeldung.0900008")
public class NachrichtVstrFehlermeldung0900008
    extends TypeGDSBasisnachricht
{

    @XmlElement(required = true)
    protected NachrichtVstrFehlermeldung0900008 .Fachdaten fachdaten;

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtVstrFehlermeldung0900008 .Fachdaten }
     *     
     */
    public NachrichtVstrFehlermeldung0900008 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtVstrFehlermeldung0900008 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtVstrFehlermeldung0900008 .Fachdaten value) {
        this.fachdaten = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fehlertext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
        "fehlertext"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected String fehlertext;

        /**
         * Gets the value of the fehlertext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFehlertext() {
            return fehlertext;
        }

        /**
         * Sets the value of the fehlertext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFehlertext(String value) {
            this.fehlertext = value;
        }

    }

}
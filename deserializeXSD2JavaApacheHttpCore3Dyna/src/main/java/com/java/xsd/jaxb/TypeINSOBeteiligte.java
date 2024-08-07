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
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ dient dazu, f�r einen im Grunddatensatz �bergebenen Beteiligten weitergehende Informationen zu �bergeben.
 * 
 * <p>Java class for Type.INSO.Beteiligte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.INSO.Beteiligte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
 *         &lt;element name="identifier" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="namenszusatzFuerOrganisationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
 *         &lt;element name="ansprechpartner" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
 *         &lt;element name="handelndUnter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
 *         &lt;element name="zustellungsart" type="{http://www.xjustiz.de}Code.INSO.Zustellungsart"/>
 *         &lt;element name="uebertragungsweg" type="{http://www.xjustiz.de}Code.INSO.Uebertragungsweg"/>
 *         &lt;element name="postempfaenger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="glaeubigermerkmale" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="masseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="neumasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="altmasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="absonderungsglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="nachrangglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.INSO.Beteiligte", propOrder = {
    "beteiligter",
    "identifier",
    "namenszusatzFuerOrganisationen",
    "ansprechpartner",
    "handelndUnter",
    "zustellungsart",
    "uebertragungsweg",
    "postempfaenger",
    "glaeubigermerkmale"
})
public class TypeINSOBeteiligte {

    @XmlElement(required = true)
    protected TypeGDSRefBeteiligtennummer beteiligter;
    @XmlElement(required = true)
    protected String identifier;
    protected String namenszusatzFuerOrganisationen;
    protected String ansprechpartner;
    protected String handelndUnter;
    @XmlElement(required = true)
    protected CodeINSOZustellungsart zustellungsart;
    @XmlElement(required = true)
    protected CodeINSOUebertragungsweg uebertragungsweg;
    protected boolean postempfaenger;
    protected TypeINSOBeteiligte.Glaeubigermerkmale glaeubigermerkmale;

    /**
     * Gets the value of the beteiligter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public TypeGDSRefBeteiligtennummer getBeteiligter() {
        return beteiligter;
    }

    /**
     * Sets the value of the beteiligter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public void setBeteiligter(TypeGDSRefBeteiligtennummer value) {
        this.beteiligter = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the namenszusatzFuerOrganisationen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamenszusatzFuerOrganisationen() {
        return namenszusatzFuerOrganisationen;
    }

    /**
     * Sets the value of the namenszusatzFuerOrganisationen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamenszusatzFuerOrganisationen(String value) {
        this.namenszusatzFuerOrganisationen = value;
    }

    /**
     * Gets the value of the ansprechpartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    /**
     * Sets the value of the ansprechpartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsprechpartner(String value) {
        this.ansprechpartner = value;
    }

    /**
     * Gets the value of the handelndUnter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandelndUnter() {
        return handelndUnter;
    }

    /**
     * Sets the value of the handelndUnter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandelndUnter(String value) {
        this.handelndUnter = value;
    }

    /**
     * Gets the value of the zustellungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeINSOZustellungsart }
     *     
     */
    public CodeINSOZustellungsart getZustellungsart() {
        return zustellungsart;
    }

    /**
     * Sets the value of the zustellungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeINSOZustellungsart }
     *     
     */
    public void setZustellungsart(CodeINSOZustellungsart value) {
        this.zustellungsart = value;
    }

    /**
     * Gets the value of the uebertragungsweg property.
     * 
     * @return
     *     possible object is
     *     {@link CodeINSOUebertragungsweg }
     *     
     */
    public CodeINSOUebertragungsweg getUebertragungsweg() {
        return uebertragungsweg;
    }

    /**
     * Sets the value of the uebertragungsweg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeINSOUebertragungsweg }
     *     
     */
    public void setUebertragungsweg(CodeINSOUebertragungsweg value) {
        this.uebertragungsweg = value;
    }

    /**
     * Gets the value of the postempfaenger property.
     * 
     */
    public boolean isPostempfaenger() {
        return postempfaenger;
    }

    /**
     * Sets the value of the postempfaenger property.
     * 
     */
    public void setPostempfaenger(boolean value) {
        this.postempfaenger = value;
    }

    /**
     * Gets the value of the glaeubigermerkmale property.
     * 
     * @return
     *     possible object is
     *     {@link TypeINSOBeteiligte.Glaeubigermerkmale }
     *     
     */
    public TypeINSOBeteiligte.Glaeubigermerkmale getGlaeubigermerkmale() {
        return glaeubigermerkmale;
    }

    /**
     * Sets the value of the glaeubigermerkmale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeINSOBeteiligte.Glaeubigermerkmale }
     *     
     */
    public void setGlaeubigermerkmale(TypeINSOBeteiligte.Glaeubigermerkmale value) {
        this.glaeubigermerkmale = value;
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
     *         &lt;element name="masseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="neumasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="altmasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="absonderungsglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="nachrangglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "masseglaeubiger",
        "neumasseglaeubiger",
        "altmasseglaeubiger",
        "absonderungsglaeubiger",
        "nachrangglaeubiger"
    })
    public static class Glaeubigermerkmale {

        protected boolean masseglaeubiger;
        protected boolean neumasseglaeubiger;
        protected boolean altmasseglaeubiger;
        protected boolean absonderungsglaeubiger;
        protected boolean nachrangglaeubiger;

        /**
         * Gets the value of the masseglaeubiger property.
         * 
         */
        public boolean isMasseglaeubiger() {
            return masseglaeubiger;
        }

        /**
         * Sets the value of the masseglaeubiger property.
         * 
         */
        public void setMasseglaeubiger(boolean value) {
            this.masseglaeubiger = value;
        }

        /**
         * Gets the value of the neumasseglaeubiger property.
         * 
         */
        public boolean isNeumasseglaeubiger() {
            return neumasseglaeubiger;
        }

        /**
         * Sets the value of the neumasseglaeubiger property.
         * 
         */
        public void setNeumasseglaeubiger(boolean value) {
            this.neumasseglaeubiger = value;
        }

        /**
         * Gets the value of the altmasseglaeubiger property.
         * 
         */
        public boolean isAltmasseglaeubiger() {
            return altmasseglaeubiger;
        }

        /**
         * Sets the value of the altmasseglaeubiger property.
         * 
         */
        public void setAltmasseglaeubiger(boolean value) {
            this.altmasseglaeubiger = value;
        }

        /**
         * Gets the value of the absonderungsglaeubiger property.
         * 
         */
        public boolean isAbsonderungsglaeubiger() {
            return absonderungsglaeubiger;
        }

        /**
         * Sets the value of the absonderungsglaeubiger property.
         * 
         */
        public void setAbsonderungsglaeubiger(boolean value) {
            this.absonderungsglaeubiger = value;
        }

        /**
         * Gets the value of the nachrangglaeubiger property.
         * 
         */
        public boolean isNachrangglaeubiger() {
            return nachrangglaeubiger;
        }

        /**
         * Sets the value of the nachrangglaeubiger property.
         * 
         */
        public void setNachrangglaeubiger(boolean value) {
            this.nachrangglaeubiger = value;
        }

    }

}

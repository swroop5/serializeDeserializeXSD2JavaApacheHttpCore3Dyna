//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Identifikation.Belastung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Identifikation.Belastung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auswahl_identifikationBelastung">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="grundbuch">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="bezirksnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="blattnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="auswahl_abteilung">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="abteilung2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="abteilung3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="antrag">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="antragsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="nachrichtenID" type="{http://www.xjustiz.de}Type.GDS.Ref.FremdeNachrichtenID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Identifikation.Belastung", propOrder = {
    "auswahlIdentifikationBelastung"
})
public class TypeDABAGIdentifikationBelastung {

    @XmlElement(name = "auswahl_identifikationBelastung", required = true)
    protected TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung auswahlIdentifikationBelastung;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the auswahlIdentifikationBelastung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung }
     *     
     */
    public TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung getAuswahlIdentifikationBelastung() {
        return auswahlIdentifikationBelastung;
    }

    /**
     * Sets the value of the auswahlIdentifikationBelastung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung }
     *     
     */
    public void setAuswahlIdentifikationBelastung(TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung value) {
        this.auswahlIdentifikationBelastung = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *       &lt;choice>
     *         &lt;element name="grundbuch">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="bezirksnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="blattnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="auswahl_abteilung">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="abteilung2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="abteilung3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="antrag">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="antragsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="nachrichtenID" type="{http://www.xjustiz.de}Type.GDS.Ref.FremdeNachrichtenID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "grundbuch",
        "antrag"
    })
    public static class AuswahlIdentifikationBelastung {

        protected TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch grundbuch;
        protected TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Antrag antrag;

        /**
         * Gets the value of the grundbuch property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch }
         *     
         */
        public TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch getGrundbuch() {
            return grundbuch;
        }

        /**
         * Sets the value of the grundbuch property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch }
         *     
         */
        public void setGrundbuch(TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch value) {
            this.grundbuch = value;
        }

        /**
         * Gets the value of the antrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Antrag }
         *     
         */
        public TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Antrag getAntrag() {
            return antrag;
        }

        /**
         * Sets the value of the antrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Antrag }
         *     
         */
        public void setAntrag(TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Antrag value) {
            this.antrag = value;
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
         *         &lt;element name="antragsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="nachrichtenID" type="{http://www.xjustiz.de}Type.GDS.Ref.FremdeNachrichtenID" minOccurs="0"/>
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
            "antragsnummer",
            "nachrichtenID"
        })
        public static class Antrag {

            @XmlElement(required = true)
            protected String antragsnummer;
            protected TypeGDSRefFremdeNachrichtenID nachrichtenID;

            /**
             * Gets the value of the antragsnummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAntragsnummer() {
                return antragsnummer;
            }

            /**
             * Sets the value of the antragsnummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAntragsnummer(String value) {
                this.antragsnummer = value;
            }

            /**
             * Gets the value of the nachrichtenID property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSRefFremdeNachrichtenID }
             *     
             */
            public TypeGDSRefFremdeNachrichtenID getNachrichtenID() {
                return nachrichtenID;
            }

            /**
             * Sets the value of the nachrichtenID property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSRefFremdeNachrichtenID }
             *     
             */
            public void setNachrichtenID(TypeGDSRefFremdeNachrichtenID value) {
                this.nachrichtenID = value;
            }

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
         *         &lt;element name="bezirksnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="blattnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="auswahl_abteilung">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="abteilung2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="abteilung3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
            "bezirksnummer",
            "blattnummer",
            "auswahlAbteilung",
            "lfdNummer"
        })
        public static class Grundbuch {

            @XmlElement(required = true)
            protected String bezirksnummer;
            @XmlElement(required = true)
            protected String blattnummer;
            @XmlElement(name = "auswahl_abteilung", required = true)
            protected TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch.AuswahlAbteilung auswahlAbteilung;
            @XmlElement(required = true)
            protected String lfdNummer;

            /**
             * Gets the value of the bezirksnummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBezirksnummer() {
                return bezirksnummer;
            }

            /**
             * Sets the value of the bezirksnummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBezirksnummer(String value) {
                this.bezirksnummer = value;
            }

            /**
             * Gets the value of the blattnummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBlattnummer() {
                return blattnummer;
            }

            /**
             * Sets the value of the blattnummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBlattnummer(String value) {
                this.blattnummer = value;
            }

            /**
             * Gets the value of the auswahlAbteilung property.
             * 
             * @return
             *     possible object is
             *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch.AuswahlAbteilung }
             *     
             */
            public TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch.AuswahlAbteilung getAuswahlAbteilung() {
                return auswahlAbteilung;
            }

            /**
             * Sets the value of the auswahlAbteilung property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch.AuswahlAbteilung }
             *     
             */
            public void setAuswahlAbteilung(TypeDABAGIdentifikationBelastung.AuswahlIdentifikationBelastung.Grundbuch.AuswahlAbteilung value) {
                this.auswahlAbteilung = value;
            }

            /**
             * Gets the value of the lfdNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLfdNummer() {
                return lfdNummer;
            }

            /**
             * Sets the value of the lfdNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLfdNummer(String value) {
                this.lfdNummer = value;
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
             *       &lt;choice>
             *         &lt;element name="abteilung2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="abteilung3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "abteilung2",
                "abteilung3"
            })
            public static class AuswahlAbteilung {

                protected BigInteger abteilung2;
                protected BigInteger abteilung3;

                /**
                 * Gets the value of the abteilung2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAbteilung2() {
                    return abteilung2;
                }

                /**
                 * Sets the value of the abteilung2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAbteilung2(BigInteger value) {
                    this.abteilung2 = value;
                }

                /**
                 * Gets the value of the abteilung3 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAbteilung3() {
                    return abteilung3;
                }

                /**
                 * Sets the value of the abteilung3 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAbteilung3(BigInteger value) {
                    this.abteilung3 = value;
                }

            }

        }

    }

}
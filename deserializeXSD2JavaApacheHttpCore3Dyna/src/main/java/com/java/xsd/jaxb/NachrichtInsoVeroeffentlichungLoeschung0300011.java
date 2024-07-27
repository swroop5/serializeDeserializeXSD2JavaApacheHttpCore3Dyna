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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nachricht.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="mitarbeiterkennziffer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="verfahren">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="verfahren.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="altverfahren.dateipfad" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="auswahl_loeschart">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="loeschungNachFristablauf">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="gegenstandVeroeffentlichung" type="{http://www.xjustiz.de}Code.INSO.Veroeffentlichungsgegenstand"/>
 *                                       &lt;element name="verfahrensabschnitt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                                       &lt;element name="loeschfrist">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="loeschdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="stornoLoeschdatum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="direktloeschung">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="veroeffentlichung.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.inso.veroeffentlichung_loeschung.0300011")
public class NachrichtInsoVeroeffentlichungLoeschung0300011 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten }
     *     
     */
    public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten value) {
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
     *         &lt;element name="nachricht.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="mitarbeiterkennziffer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="verfahren">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="verfahren.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="altverfahren.dateipfad" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="auswahl_loeschart">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="loeschungNachFristablauf">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="gegenstandVeroeffentlichung" type="{http://www.xjustiz.de}Code.INSO.Veroeffentlichungsgegenstand"/>
     *                             &lt;element name="verfahrensabschnitt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *                             &lt;element name="loeschfrist">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="loeschdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="stornoLoeschdatum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="direktloeschung">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="veroeffentlichung.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nachrichtId",
        "mitarbeiterkennziffer",
        "verfahren",
        "auswahlLoeschart"
    })
    public static class Fachdaten {

        @XmlElement(name = "nachricht.id", required = true)
        protected String nachrichtId;
        protected String mitarbeiterkennziffer;
        @XmlElement(required = true)
        protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.Verfahren verfahren;
        @XmlElement(name = "auswahl_loeschart", required = true)
        protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart auswahlLoeschart;

        /**
         * Gets the value of the nachrichtId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachrichtId() {
            return nachrichtId;
        }

        /**
         * Sets the value of the nachrichtId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachrichtId(String value) {
            this.nachrichtId = value;
        }

        /**
         * Gets the value of the mitarbeiterkennziffer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMitarbeiterkennziffer() {
            return mitarbeiterkennziffer;
        }

        /**
         * Sets the value of the mitarbeiterkennziffer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMitarbeiterkennziffer(String value) {
            this.mitarbeiterkennziffer = value;
        }

        /**
         * Gets the value of the verfahren property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.Verfahren }
         *     
         */
        public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.Verfahren getVerfahren() {
            return verfahren;
        }

        /**
         * Sets the value of the verfahren property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.Verfahren }
         *     
         */
        public void setVerfahren(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.Verfahren value) {
            this.verfahren = value;
        }

        /**
         * Gets the value of the auswahlLoeschart property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart }
         *     
         */
        public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart getAuswahlLoeschart() {
            return auswahlLoeschart;
        }

        /**
         * Sets the value of the auswahlLoeschart property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart }
         *     
         */
        public void setAuswahlLoeschart(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart value) {
            this.auswahlLoeschart = value;
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
         *         &lt;element name="loeschungNachFristablauf">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="gegenstandVeroeffentlichung" type="{http://www.xjustiz.de}Code.INSO.Veroeffentlichungsgegenstand"/>
         *                   &lt;element name="verfahrensabschnitt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
         *                   &lt;element name="loeschfrist">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="loeschdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="stornoLoeschdatum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="direktloeschung">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="veroeffentlichung.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
            "loeschungNachFristablauf",
            "direktloeschung"
        })
        public static class AuswahlLoeschart {

            protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf loeschungNachFristablauf;
            protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.Direktloeschung direktloeschung;

            /**
             * Gets the value of the loeschungNachFristablauf property.
             * 
             * @return
             *     possible object is
             *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf }
             *     
             */
            public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf getLoeschungNachFristablauf() {
                return loeschungNachFristablauf;
            }

            /**
             * Sets the value of the loeschungNachFristablauf property.
             * 
             * @param value
             *     allowed object is
             *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf }
             *     
             */
            public void setLoeschungNachFristablauf(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf value) {
                this.loeschungNachFristablauf = value;
            }

            /**
             * Gets the value of the direktloeschung property.
             * 
             * @return
             *     possible object is
             *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.Direktloeschung }
             *     
             */
            public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.Direktloeschung getDirektloeschung() {
                return direktloeschung;
            }

            /**
             * Sets the value of the direktloeschung property.
             * 
             * @param value
             *     allowed object is
             *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.Direktloeschung }
             *     
             */
            public void setDirektloeschung(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.Direktloeschung value) {
                this.direktloeschung = value;
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
             *         &lt;element name="veroeffentlichung.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
                "veroeffentlichungId"
            })
            public static class Direktloeschung {

                @XmlElement(name = "veroeffentlichung.id", required = true)
                protected String veroeffentlichungId;

                /**
                 * Gets the value of the veroeffentlichungId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVeroeffentlichungId() {
                    return veroeffentlichungId;
                }

                /**
                 * Sets the value of the veroeffentlichungId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVeroeffentlichungId(String value) {
                    this.veroeffentlichungId = value;
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
             *         &lt;element name="gegenstandVeroeffentlichung" type="{http://www.xjustiz.de}Code.INSO.Veroeffentlichungsgegenstand"/>
             *         &lt;element name="verfahrensabschnitt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
             *         &lt;element name="loeschfrist">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="loeschdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="stornoLoeschdatum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/choice>
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
            @XmlType(name = "", propOrder = {
                "gegenstandVeroeffentlichung",
                "verfahrensabschnitt",
                "loeschfrist"
            })
            public static class LoeschungNachFristablauf {

                @XmlElement(required = true)
                protected CodeINSOVeroeffentlichungsgegenstand gegenstandVeroeffentlichung;
                protected String verfahrensabschnitt;
                @XmlElement(required = true)
                protected NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf.Loeschfrist loeschfrist;

                /**
                 * Gets the value of the gegenstandVeroeffentlichung property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodeINSOVeroeffentlichungsgegenstand }
                 *     
                 */
                public CodeINSOVeroeffentlichungsgegenstand getGegenstandVeroeffentlichung() {
                    return gegenstandVeroeffentlichung;
                }

                /**
                 * Sets the value of the gegenstandVeroeffentlichung property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodeINSOVeroeffentlichungsgegenstand }
                 *     
                 */
                public void setGegenstandVeroeffentlichung(CodeINSOVeroeffentlichungsgegenstand value) {
                    this.gegenstandVeroeffentlichung = value;
                }

                /**
                 * Gets the value of the verfahrensabschnitt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVerfahrensabschnitt() {
                    return verfahrensabschnitt;
                }

                /**
                 * Sets the value of the verfahrensabschnitt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVerfahrensabschnitt(String value) {
                    this.verfahrensabschnitt = value;
                }

                /**
                 * Gets the value of the loeschfrist property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf.Loeschfrist }
                 *     
                 */
                public NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf.Loeschfrist getLoeschfrist() {
                    return loeschfrist;
                }

                /**
                 * Sets the value of the loeschfrist property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf.Loeschfrist }
                 *     
                 */
                public void setLoeschfrist(NachrichtInsoVeroeffentlichungLoeschung0300011 .Fachdaten.AuswahlLoeschart.LoeschungNachFristablauf.Loeschfrist value) {
                    this.loeschfrist = value;
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
                 *         &lt;element name="loeschdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="stornoLoeschdatum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "loeschdatum",
                    "stornoLoeschdatum"
                })
                public static class Loeschfrist {

                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar loeschdatum;
                    protected Boolean stornoLoeschdatum;

                    /**
                     * Gets the value of the loeschdatum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getLoeschdatum() {
                        return loeschdatum;
                    }

                    /**
                     * Sets the value of the loeschdatum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setLoeschdatum(XMLGregorianCalendar value) {
                        this.loeschdatum = value;
                    }

                    /**
                     * Gets the value of the stornoLoeschdatum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isStornoLoeschdatum() {
                        return stornoLoeschdatum;
                    }

                    /**
                     * Sets the value of the stornoLoeschdatum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setStornoLoeschdatum(Boolean value) {
                        this.stornoLoeschdatum = value;
                    }

                }

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
         *         &lt;element name="verfahren.id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="altverfahren.dateipfad" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
            "verfahrenId",
            "altverfahrenDateipfad"
        })
        public static class Verfahren {

            @XmlElement(name = "verfahren.id", required = true)
            protected String verfahrenId;
            @XmlElement(name = "altverfahren.dateipfad")
            protected String altverfahrenDateipfad;

            /**
             * Gets the value of the verfahrenId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerfahrenId() {
                return verfahrenId;
            }

            /**
             * Sets the value of the verfahrenId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerfahrenId(String value) {
                this.verfahrenId = value;
            }

            /**
             * Gets the value of the altverfahrenDateipfad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltverfahrenDateipfad() {
                return altverfahrenDateipfad;
            }

            /**
             * Sets the value of the altverfahrenDateipfad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltverfahrenDateipfad(String value) {
                this.altverfahrenDateipfad = value;
            }

        }

    }

}

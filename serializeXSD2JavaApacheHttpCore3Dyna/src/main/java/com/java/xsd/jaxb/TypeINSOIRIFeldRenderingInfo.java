//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dieser Typ dient dazu, die Darstellung von Datenelementen zu steuern.
 * 
 * <p>Java class for Type.INSO.IRI.FeldRenderingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.INSO.IRI.FeldRenderingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="typ" type="{http://www.xjustiz.de}Code.INSO.IRI.Feldtyp"/>
 *         &lt;element name="beschreibung" type="{http://www.xjustiz.de}Type.INSO.IRI.QualifizierterText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="layoutOptionen" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fett" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="kursiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="richtung" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="sortierung" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
@XmlType(name = "Type.INSO.IRI.FeldRenderingInfo", propOrder = {
    "schluessel",
    "typ",
    "beschreibung",
    "layoutOptionen"
})
public class TypeINSOIRIFeldRenderingInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schluessel;
    @XmlElement(required = true)
    protected CodeINSOIRIFeldtyp typ;
    protected List<TypeINSOIRIQualifizierterText> beschreibung;
    protected TypeINSOIRIFeldRenderingInfo.LayoutOptionen layoutOptionen;

    /**
     * Gets the value of the schluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchluessel() {
        return schluessel;
    }

    /**
     * Sets the value of the schluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchluessel(String value) {
        this.schluessel = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link CodeINSOIRIFeldtyp }
     *     
     */
    public CodeINSOIRIFeldtyp getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeINSOIRIFeldtyp }
     *     
     */
    public void setTyp(CodeINSOIRIFeldtyp value) {
        this.typ = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beschreibung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeschreibung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeINSOIRIQualifizierterText }
     * 
     * 
     */
    public List<TypeINSOIRIQualifizierterText> getBeschreibung() {
        if (beschreibung == null) {
            beschreibung = new ArrayList<TypeINSOIRIQualifizierterText>();
        }
        return this.beschreibung;
    }

    /**
     * Gets the value of the layoutOptionen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeINSOIRIFeldRenderingInfo.LayoutOptionen }
     *     
     */
    public TypeINSOIRIFeldRenderingInfo.LayoutOptionen getLayoutOptionen() {
        return layoutOptionen;
    }

    /**
     * Sets the value of the layoutOptionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeINSOIRIFeldRenderingInfo.LayoutOptionen }
     *     
     */
    public void setLayoutOptionen(TypeINSOIRIFeldRenderingInfo.LayoutOptionen value) {
        this.layoutOptionen = value;
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
     *         &lt;element name="fett" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="kursiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="richtung" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="sortierung" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "fett",
        "kursiv",
        "richtung",
        "sortierung"
    })
    public static class LayoutOptionen {

        @XmlElement(defaultValue = "false")
        protected Boolean fett;
        @XmlElement(defaultValue = "false")
        protected Boolean kursiv;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String richtung;
        @XmlElement(defaultValue = "ALPHABETICAL")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String sortierung;

        /**
         * Gets the value of the fett property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFett() {
            return fett;
        }

        /**
         * Sets the value of the fett property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFett(Boolean value) {
            this.fett = value;
        }

        /**
         * Gets the value of the kursiv property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isKursiv() {
            return kursiv;
        }

        /**
         * Sets the value of the kursiv property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setKursiv(Boolean value) {
            this.kursiv = value;
        }

        /**
         * Gets the value of the richtung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRichtung() {
            return richtung;
        }

        /**
         * Sets the value of the richtung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRichtung(String value) {
            this.richtung = value;
        }

        /**
         * Gets the value of the sortierung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortierung() {
            return sortierung;
        }

        /**
         * Sets the value of the sortierung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSortierung(String value) {
            this.sortierung = value;
        }

    }

}

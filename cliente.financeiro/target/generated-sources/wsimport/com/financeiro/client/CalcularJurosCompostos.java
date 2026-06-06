
package com.financeiro.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calcularJurosCompostos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="calcularJurosCompostos">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="capital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tempo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularJurosCompostos", propOrder = {
    "capital",
    "taxa",
    "tempo"
})
public class CalcularJurosCompostos {

    @XmlElementRef(name = "capital", namespace = "financeiro.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> capital;
    @XmlElementRef(name = "taxa", namespace = "financeiro.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> taxa;
    @XmlElementRef(name = "tempo", namespace = "financeiro.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> tempo;

    /**
     * Obtém o valor da propriedade capital.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCapital() {
        return capital;
    }

    /**
     * Define o valor da propriedade capital.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCapital(JAXBElement<Double> value) {
        this.capital = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTaxa(JAXBElement<Double> value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade tempo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTempo() {
        return tempo;
    }

    /**
     * Define o valor da propriedade tempo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTempo(JAXBElement<Double> value) {
        this.tempo = value;
    }

}

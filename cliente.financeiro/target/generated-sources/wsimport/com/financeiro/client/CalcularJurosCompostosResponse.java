
package com.financeiro.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calcularJurosCompostosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="calcularJurosCompostosResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="calcularJurosCompostosResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularJurosCompostosResponse", propOrder = {
    "calcularJurosCompostosResult"
})
public class CalcularJurosCompostosResponse {

    @XmlElementRef(name = "calcularJurosCompostosResult", namespace = "financeiro.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> calcularJurosCompostosResult;

    /**
     * Obtém o valor da propriedade calcularJurosCompostosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCalcularJurosCompostosResult() {
        return calcularJurosCompostosResult;
    }

    /**
     * Define o valor da propriedade calcularJurosCompostosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCalcularJurosCompostosResult(JAXBElement<Double> value) {
        this.calcularJurosCompostosResult = value;
    }

}

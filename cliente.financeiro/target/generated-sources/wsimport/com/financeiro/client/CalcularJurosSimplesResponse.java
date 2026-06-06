
package com.financeiro.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calcularJurosSimplesResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="calcularJurosSimplesResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="calcularJurosSimplesResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularJurosSimplesResponse", propOrder = {
    "calcularJurosSimplesResult"
})
public class CalcularJurosSimplesResponse {

    @XmlElementRef(name = "calcularJurosSimplesResult", namespace = "financeiro.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> calcularJurosSimplesResult;

    /**
     * Obtém o valor da propriedade calcularJurosSimplesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCalcularJurosSimplesResult() {
        return calcularJurosSimplesResult;
    }

    /**
     * Define o valor da propriedade calcularJurosSimplesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCalcularJurosSimplesResult(JAXBElement<Double> value) {
        this.calcularJurosSimplesResult = value;
    }

}


package com.financeiro.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.financeiro.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CalcularJurosCompostos_QNAME = new QName("financeiro.soap", "calcularJurosCompostos");
    private static final QName _CalcularJurosCompostosResponse_QNAME = new QName("financeiro.soap", "calcularJurosCompostosResponse");
    private static final QName _CalcularJurosSimples_QNAME = new QName("financeiro.soap", "calcularJurosSimples");
    private static final QName _CalcularJurosSimplesResponse_QNAME = new QName("financeiro.soap", "calcularJurosSimplesResponse");
    private static final QName _CalcularJurosSimplesResponseCalcularJurosSimplesResult_QNAME = new QName("financeiro.soap", "calcularJurosSimplesResult");
    private static final QName _CalcularJurosSimplesCapital_QNAME = new QName("financeiro.soap", "capital");
    private static final QName _CalcularJurosSimplesTaxa_QNAME = new QName("financeiro.soap", "taxa");
    private static final QName _CalcularJurosSimplesTempo_QNAME = new QName("financeiro.soap", "tempo");
    private static final QName _CalcularJurosCompostosResponseCalcularJurosCompostosResult_QNAME = new QName("financeiro.soap", "calcularJurosCompostosResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.financeiro.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularJurosCompostos }
     * 
     * @return
     *     the new instance of {@link CalcularJurosCompostos }
     */
    public CalcularJurosCompostos createCalcularJurosCompostos() {
        return new CalcularJurosCompostos();
    }

    /**
     * Create an instance of {@link CalcularJurosCompostosResponse }
     * 
     * @return
     *     the new instance of {@link CalcularJurosCompostosResponse }
     */
    public CalcularJurosCompostosResponse createCalcularJurosCompostosResponse() {
        return new CalcularJurosCompostosResponse();
    }

    /**
     * Create an instance of {@link CalcularJurosSimples }
     * 
     * @return
     *     the new instance of {@link CalcularJurosSimples }
     */
    public CalcularJurosSimples createCalcularJurosSimples() {
        return new CalcularJurosSimples();
    }

    /**
     * Create an instance of {@link CalcularJurosSimplesResponse }
     * 
     * @return
     *     the new instance of {@link CalcularJurosSimplesResponse }
     */
    public CalcularJurosSimplesResponse createCalcularJurosSimplesResponse() {
        return new CalcularJurosSimplesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularJurosCompostos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularJurosCompostos }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosCompostos")
    public JAXBElement<CalcularJurosCompostos> createCalcularJurosCompostos(CalcularJurosCompostos value) {
        return new JAXBElement<>(_CalcularJurosCompostos_QNAME, CalcularJurosCompostos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularJurosCompostosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularJurosCompostosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosCompostosResponse")
    public JAXBElement<CalcularJurosCompostosResponse> createCalcularJurosCompostosResponse(CalcularJurosCompostosResponse value) {
        return new JAXBElement<>(_CalcularJurosCompostosResponse_QNAME, CalcularJurosCompostosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularJurosSimples }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularJurosSimples }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosSimples")
    public JAXBElement<CalcularJurosSimples> createCalcularJurosSimples(CalcularJurosSimples value) {
        return new JAXBElement<>(_CalcularJurosSimples_QNAME, CalcularJurosSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularJurosSimplesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularJurosSimplesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosSimplesResponse")
    public JAXBElement<CalcularJurosSimplesResponse> createCalcularJurosSimplesResponse(CalcularJurosSimplesResponse value) {
        return new JAXBElement<>(_CalcularJurosSimplesResponse_QNAME, CalcularJurosSimplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosSimplesResult", scope = CalcularJurosSimplesResponse.class)
    public JAXBElement<Double> createCalcularJurosSimplesResponseCalcularJurosSimplesResult(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesResponseCalcularJurosSimplesResult_QNAME, Double.class, CalcularJurosSimplesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "capital", scope = CalcularJurosSimples.class)
    public JAXBElement<Double> createCalcularJurosSimplesCapital(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesCapital_QNAME, Double.class, CalcularJurosSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "taxa", scope = CalcularJurosSimples.class)
    public JAXBElement<Double> createCalcularJurosSimplesTaxa(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesTaxa_QNAME, Double.class, CalcularJurosSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "tempo", scope = CalcularJurosSimples.class)
    public JAXBElement<Double> createCalcularJurosSimplesTempo(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesTempo_QNAME, Double.class, CalcularJurosSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "calcularJurosCompostosResult", scope = CalcularJurosCompostosResponse.class)
    public JAXBElement<Double> createCalcularJurosCompostosResponseCalcularJurosCompostosResult(Double value) {
        return new JAXBElement<>(_CalcularJurosCompostosResponseCalcularJurosCompostosResult_QNAME, Double.class, CalcularJurosCompostosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "capital", scope = CalcularJurosCompostos.class)
    public JAXBElement<Double> createCalcularJurosCompostosCapital(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesCapital_QNAME, Double.class, CalcularJurosCompostos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "taxa", scope = CalcularJurosCompostos.class)
    public JAXBElement<Double> createCalcularJurosCompostosTaxa(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesTaxa_QNAME, Double.class, CalcularJurosCompostos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "financeiro.soap", name = "tempo", scope = CalcularJurosCompostos.class)
    public JAXBElement<Double> createCalcularJurosCompostosTempo(Double value) {
        return new JAXBElement<>(_CalcularJurosSimplesTempo_QNAME, Double.class, CalcularJurosCompostos.class, value);
    }

}

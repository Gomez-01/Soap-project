package com.soap.projeto.cliente.financeiro;

import com.financeiro.client.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class FinanceiroSoapClient extends WebServiceGatewaySupport {

    public Double chamarJurosSimples(Double capital, Double taxa, Double tempo) {
        ObjectFactory factory = new ObjectFactory();

        CalcularJurosSimples request = factory.createCalcularJurosSimples();
        request.setCapital(factory.createCalcularJurosSimplesCapital(capital));
        request.setTaxa(factory.createCalcularJurosSimplesTaxa(taxa));
        request.setTempo(factory.createCalcularJurosSimplesTempo(tempo));

        // Envelopa o payload
        JAXBElement<CalcularJurosSimples> requestElement = factory.createCalcularJurosSimples(request);

        @SuppressWarnings("unchecked")
        JAXBElement<CalcularJurosSimplesResponse> responseElement =
                (JAXBElement<CalcularJurosSimplesResponse>) getWebServiceTemplate().marshalSendAndReceive(
                        requestElement,
                        new SoapActionCallback("calcularJurosSimples") // Action do cabeçalho SOAP
                );

        CalcularJurosSimplesResponse response = responseElement.getValue();
        if (response == null || response.getCalcularJurosSimplesResult() == null) {
            return null;
        }
        return response.getCalcularJurosSimplesResult().getValue();
    }

    public Double chamarJurosCompostos(Double capital, Double taxa, Double tempo) {
        ObjectFactory factory = new ObjectFactory();

        CalcularJurosCompostos request = factory.createCalcularJurosCompostos();
        request.setCapital(factory.createCalcularJurosCompostosCapital(capital));
        request.setTaxa(factory.createCalcularJurosCompostosTaxa(taxa));
        request.setTempo(factory.createCalcularJurosCompostosTempo(tempo));

        System.out.println("Enviando requisição de Juros Compostos via Spring...");

        // 1. Envelopa a requisição usando o factory (Exatamente como no metodo acima)
        JAXBElement<CalcularJurosCompostos> requestElement = factory.createCalcularJurosCompostos(request);

        // 2. Envia usando o formato correto com SoapActionCallback
        @SuppressWarnings("unchecked")
        JAXBElement<CalcularJurosCompostosResponse> responseElement =
                (JAXBElement<CalcularJurosCompostosResponse>) getWebServiceTemplate().marshalSendAndReceive(
                        requestElement,
                        new SoapActionCallback("calcularJurosCompostos") // Action do Juros Compostos
                );

        // 3. Extrai e retorna o valor com segurança
        CalcularJurosCompostosResponse response = responseElement.getValue();
        if (response == null || response.getCalcularJurosCompostosResult() == null) {
            return null;
        }
        return response.getCalcularJurosCompostosResult().getValue();
    }
}
package com.soap.projeto.cliente.financeiro.config;

import com.financeiro.client.ServicoFinanceiro;
import com.soap.projeto.cliente.financeiro.FinanceiroSoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.financeiro.client");
        return marshaller;
    }

    @Bean
    public FinanceiroSoapClient financeiroClient(Jaxb2Marshaller marshaller) {
        FinanceiroSoapClient client = new FinanceiroSoapClient();
        client.setDefaultUri("http://localhost:8000/"); // URL base do Python
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}

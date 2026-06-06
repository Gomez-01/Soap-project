package com.soap.projeto.cliente.financeiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceiroController {

    @Autowired
    private FinanceiroSoapClient financeiroClient;

    @GetMapping("/Calcular-juros-simples")
    public String JurosSimples() {
        try {
            Double capital = 1500.0;
            Double taxa = 0.03;
            Double tempo = 6.0;

            Double resultado = financeiroClient.chamarJurosSimples(capital, taxa, tempo);

            return "O Juros Simples é: R$ " + resultado;

        } catch (Exception e) {
            return "Erro ao comunicar com o SOAP: " + e.getMessage();
        }
    }

    @GetMapping("/Calcular-juros-compostos")
    public String JurosCompostos() {
        try {
            Double capital = 1500.0;
            Double taxa = 0.03;
            Double tempo = 6.0;

            Double resultado = financeiroClient.chamarJurosCompostos(capital, taxa, tempo);

            return "O Juros compostos é: R$ " + resultado;

        } catch (Exception e) {
            return "Erro ao comunicar com o SOAP: " + e.getMessage();
        }
    }
}

package com.fiap.finance.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class CarteiraTest {

    @Test
    public void adicionarAcao_DeveAdicionarAcaoNaCarteira() {
        // Arrange
        List<Acao> acoes = Arrays.asList(
                new Acao("AAPL", 150.0),
                new Acao("GOOGL", 2500.0));

        Carteira carteira = new Carteira("Minha Carteira", acoes);

        // Act
        Acao novaAcao = new Acao("TSLA", 700.0);
        carteira.adicionarAcao(novaAcao);

        // Assert
        assertEquals(3, carteira.getAcoes().size());
    }
}
package com.fiap.finance.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcaoTest {

    @Test
    public void criarAcao_DeveDefinirSimboloEPrecoCorretamente() {
        // Arrange
        String simbolo = "AAPL";
        double preco = 150.0;

        // Act
        Acao acao = new Acao(simbolo, preco);

        // Assert
        assertEquals(simbolo, acao.getSimbolo());
        assertEquals(preco, acao.getPreco(), 0.01); // Usando uma margem de erro para comparação de números decimais
    }
}
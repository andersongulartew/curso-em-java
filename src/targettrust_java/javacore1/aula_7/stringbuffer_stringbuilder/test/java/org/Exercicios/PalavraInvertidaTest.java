package org.Exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalavraInvertidaTest {
    @Test
    void whenInverterthenPalavra() {

        PalavraInvertida inverter = new PalavraInvertida();
        String resultado = inverter.inverterPalavra("abacate");
        assertEquals("etacaba", resultado);
    }
}



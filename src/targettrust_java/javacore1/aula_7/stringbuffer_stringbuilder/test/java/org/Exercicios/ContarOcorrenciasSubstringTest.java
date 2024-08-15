package org.Exercicios;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContarOcorrenciasSubstringTest {

    @Test
    public void testCountOccurrences() {
         ContarOcorrenciasSubstring ocorrencias = new ContarOcorrenciasSubstring();

        //int resultado = ocorrencias.contarOcorrencias("o dia esta bonito","to");

        assertEquals(2, ocorrencias.contarOcorrencias("o dia esta bonito e alem de um dia de sol","dia"));

    }

}
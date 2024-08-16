package javacore.aula02.exercicios.calculadora.teste.src.test.java;

import javacore.aula02.exercicios.calculadora.Operacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacaoTest {
    @Test
    public void testSomar() {
        Operacao operacao = new Operacao();
        int resultado = operacao.somar(5,3);

        // Verifica se dois valores são iguais. Se não forem, o teste falha.
        assertEquals(8, resultado); // aprovado



    }




}
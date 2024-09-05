package aula06.test.java.org.targettrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {


    @Test
    public void testMagreza() {
        IMC imc = new IMC();
        String resultado = imc.calcularIMC(50, 1.75);
        assertEquals("Magreza", resultado);
    }

    @Test
    public void testNormal() {
        IMC imc = new IMC();
        String resultado = imc.calcularIMC(70, 1.75);
        assertEquals("Normal", resultado);
    }

    @Test
    public void testSobrepeso() {
        IMC imc = new IMC();
        String resultado = imc.calcularIMC(80, 1.75);
        assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testObesidade() {
        IMC imc = new IMC();
        String resultado = imc.calcularIMC(95, 1.75);
        assertEquals("Obesidade", resultado);
    }

    @Test
    public void testObesidadeGrave() {
        IMC imc = new IMC();
        String resultado = imc.calcularIMC(120, 1.75);
        assertEquals("Obesidade grave", resultado);
    }

}


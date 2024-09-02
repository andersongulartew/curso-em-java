package aula06.test.java;

import aula06.main.java.br.com.testeunitarios.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
     @Test
    void givenTwoDoubleNumbers_whenSomar_thenReturnCorrectResult() {

        Calculadora calc = new Calculadora();

        double resultado = calc.somar(2.34, 3.66);

        assertEquals(6.00, resultado);
    }

//    @Test
//    void givenTwoDoubleNumbersWith6digits_whensomar_then30DigitResult(){
//        Calculadora calc = new Calculadora();
//        double resultado = calc.somar(2.345556, 3.660004);
//        assertEquals(6.005, resultado, 0.001);
//    }

    @Test
    void givenTwoDoubleNumbers_whenSubtrair_thenReturnCorrectResult() {
        Calculadora calc = new Calculadora();

        double resultado = calc.subtrair(3.00, 2.00);

        assertEquals(1.00, resultado);
    }

    @Test
    void givenTwoDoubleNumbers_whenMultiplicar_thenReturnCorrectResult() {
        Calculadora calc = new Calculadora();

        double resultado = calc.multiplicar(2.00, 3.00);

        assertEquals(6.00, resultado);
    }

}
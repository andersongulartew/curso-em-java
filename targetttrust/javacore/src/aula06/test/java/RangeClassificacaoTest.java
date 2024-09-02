package aula06.test.java;

import aula04.ClassificacaoIMC;
import aula06.main.java.br.com.testeunitarios.RangeClassificacao;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;

public class RangeClassificacaoTest {

//     @Test
//     public void testEqualsWithRange() {
//        RangeClassificacao range1 = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//        RangeClassificacao range2 = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//        assertThat(range1).isEqualTo(range2);
//
//        RangeClassificacao range3 = new RangeClassificacao(9.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//
//        assertThat(range1).isNotEqualTo(range3);
//        assertThat(range2).isNotEqualTo(range3);
//
//    }
//
//    @Test
//    public void testEqualsWithDouble() {
//        RangeClassificacao range1 = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//        List<Double> valuesInRange = List.of(12.34d, 20d, 25d, 25.45d);
//
//        valuesInRange.forEach(((value) -> assertThat(range1).isEqualTo(value)));
//    }
//
//    @Test
//    public void testNotEqualsWithDouble() {
//        RangeClassificacao range1 = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//        List<Double> valuesInRange = List.of(9d, 9.5, 26d, 27d);
//        valuesInRange.forEach(((value) -> assertThat(range1).isNotEqualTo(value)));
//    }
//
//    @Test
//    @DisplayName("Given a hashmap should return the same object in same range")
//    public void givenAHashMapShouldReturnObjectInSameRangeWithDouble() {
//
//        Map<RangeClassificacao, String> mapTest = new HashMap<>();
//
//        RangeClassificacao range1Key = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//
//        mapTest.put(range1Key, "A");
//
//        assertThat(mapTest.get(range1Key)).isEqualTo("A");
//
//        Double range2Key = 22.0d; // should return A
//        Double range3Key = 30.00d; // should return null
//
//        String value = mapTest.get(range2Key);
//        assertThat(value).isEqualTo("A");
//
//        String value2 = mapTest.get(range3Key);
//
//        assertThat(value2).isNull();
//
//        RangeClassificacao rangeKey30 = new RangeClassificacao(30.00d, 40.00d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//
//        mapTest.put(rangeKey30, "B");
//
//        //
//        assertThat(mapTest.get(range3Key)).isEqualTo("B");
//
//    }
//
//    @Test
//    public void givenAHashMapShouldReturnObjectInSameRange() {
//        Map<RangeClassificacao, String> mapTest = new HashMap<>();
//
//        RangeClassificacao range1Key = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//
//        mapTest.put(range1Key, "A");
//
//        assertThat(mapTest.get(range1Key)).isEqualTo("A");
//
//        RangeClassificacao range2Key = new RangeClassificacao(10.0d, 25.45d, ClassificacaoIMC.SEM_CLASSIFICACAO);
//
//        assertThat(mapTest.get(range2Key)).isEqualTo("A");
//    }
//    //  think more on the example
//    @Test
//    public void givenAHashMapShouldReturnObjectInSameRangeWhenDoubleIsEqual() {
//        Map<RangeClassificacao, String> mapTest = new HashMap<>();

//    }

}
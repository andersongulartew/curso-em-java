package exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio2CampeoesDaCopa {
    public static void main(String[] args) {
        List<String> campeoes = new ArrayList<String>();
        campeoes.add("1930- Uruguai");
        campeoes.add("1934- Itália");
        campeoes.add("1938- Itália");
        campeoes.add("1950- Uruguai");
        campeoes.add("1954- Alemanha");
        campeoes.add("1958- Brasil");
        campeoes.add("1962- Brasil");
        campeoes.add("1966- Inglaterra");
        campeoes.add("1970- Brasil");
        campeoes.add("1974- Alemanha");
        campeoes.add("1978- Argentina");
        campeoes.add("1982- Itália");
        campeoes.add("1986- Argentina");
        campeoes.add("1990- Alemanha");
        campeoes.add("1994- Brasil");
        campeoes.add("1998- França");
        campeoes.add("2002- Brasil");
        campeoes.add("2006- Itália");
        campeoes.add("2010- Espanha");
        campeoes.add("2014- Alemanha");
        campeoes.add("2018- França");

        Map<String, Integer> quantidadeTitulos = new HashMap<>();
        System.out.println("Países:");
        for (String campeao : campeoes) {
            String pais = campeao.split("-")[1];
            quantidadeTitulos.put(pais, quantidadeTitulos.getOrDefault(pais,0) + 1);

        }


        for (Map.Entry<String, Integer> registro : quantidadeTitulos.entrySet()) {
            System.out.println(registro.getKey() + " - " + registro.getValue() + " Copas");
        }


    }
}






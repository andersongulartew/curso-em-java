package colecoes;

public class Map {
    public static void main(String[] args) {

        // Map - guarda coleções de tuplas(chaves e valor)

        java.util.Map<String, String> capitais = new java.util.HashMap<>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("SP", "Sao Paulo");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "florianopolis");
        capitais.put("DE", "Belo Horizonte");
        capitais.put("ES", "Belo Horizonte");
        capitais.put(null, "Santos");
        capitais.put(null, "Paraiba");

        // listarKeys(capitais)

        // listarValue(capitais)


        //listarKeyValue(capitais)


//        System.out.println("Capital de MG" + capitais.get("MG"));
//
//        // testando antes de inserir
//        String rj = capitais.get("RJ");
//        System.out.println("RJ" + rj);
//        if (rj == null) {
//            capitais.put("RJ ", "Rio de Janeiro");
//        }
//        rj = capitais.get("RJ");
//        System.out.println("RJ" + rj);

    }

    public static void listarKeysValue(java.util.Map<String, String> capitais) {
        System.out.println("Chave/Valor(Entry): ");
        for (java.util.Map.Entry<String, String> registro : capitais.entrySet()) {
            System.out.println("Capitais:\n" + registro.getKey() + " " + registro.getValue());
        }
    }

    public static void listarValues(java.util.Map<String, String> capitais) {
        System.out.println("Cidade: ");
        for (String value : capitais.values()) {
            System.out.println(value);
        }
    }

    public static void listarKeys(java.util.Map<String, String> capitais) {
        System.out.println("Estado: ");
        for (String chave : capitais.keySet()) {
            System.out.println(chave);
        }
    }


}

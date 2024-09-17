package generic;

public class Par<k,v> {
     private String key;
    private String value;

    public Par(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public  String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}

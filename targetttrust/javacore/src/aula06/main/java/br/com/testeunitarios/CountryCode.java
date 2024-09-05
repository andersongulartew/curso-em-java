package aula06.main.java.br.com.testeunitarios;

import java.nio.charset.Charset;

public enum CountryCode {
    US("ASCII", "US"),
    PT_BR("ISO-88591", "BRL"),
    PT("ISO-88591", "PTL"),
    AR("UTF-8", "PE");

    private final String charSet;
    private final String moneyCode;

    private CountryCode(String charSet, String moneyCode) {
        this.charSet = charSet;
        this.moneyCode = moneyCode;
    }

    public Charset getCountryCharset() {
        return Charset.forName(charSet);
    }

    public String getMoneyCode() {
        return moneyCode;
    }

}

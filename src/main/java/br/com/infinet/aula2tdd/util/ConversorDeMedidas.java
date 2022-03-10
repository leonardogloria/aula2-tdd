package br.com.infinet.aula2tdd.util;

public class ConversorDeMedidas {
    public Double celciusToFahrenhrit(double celcius) {
        Double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    }
}

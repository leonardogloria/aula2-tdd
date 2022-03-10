package br.com.infinet.aula2tdd;

import br.com.infinet.aula2tdd.util.ConversorDeMedidas;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class CalculadoraTests {
    @Test
    void ToFahrenheit(){
        ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();
        Double fahrenheit = conversorDeMedidas.celciusToFahrenhrit(0.0);
        assertEquals(32.0,fahrenheit);
    }
    @Test
    void valueToFah(){
        ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();
        Double fahrenheit = conversorDeMedidas.celciusToFahrenhrit(30.0);
        assertEquals(86.0,fahrenheit);
    }


}

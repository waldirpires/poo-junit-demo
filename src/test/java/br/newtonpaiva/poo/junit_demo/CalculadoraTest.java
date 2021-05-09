package br.newtonpaiva.poo.junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void test_Somar() {
        var calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

}

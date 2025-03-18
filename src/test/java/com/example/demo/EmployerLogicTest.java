package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployerLogicTest {

    @Test
    public void testEmployerPrintln() {
        // Vytvorenie inštancie EmployerLogic s konkrétnymi hodnotami
        EmployerLogic employerLogic = new EmployerLogic(34, "jano", "Malacka");

        // Zavoláme metódu a získame výstup
        String result = employerLogic.EmployerPrintln();
        String expected = "ID: 34 Meno: jano Adresa: Malacka";

        // Overenie, že výstup je správny
        assertEquals(expected, result);
    }
}
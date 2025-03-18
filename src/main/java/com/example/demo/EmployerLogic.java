package com.example.demo;

public class EmployerLogic {

    private int id;
    private String meno;
    private String adresa;

    // Default (bezparametrový) konštruktor
    public EmployerLogic() {
        // Môžeš nastaviť predvolené hodnoty
        this.id = 0;            // Predvolený ID
        this.meno = "Neznámy";  // Predvolené meno
        this.adresa = "Neznáma"; // Predvolená adresa
    }

    // Konstruktor pre inicializáciu hodnôt
    public EmployerLogic(int id, String meno, String adresa) {
        this.id = id;
        this.meno = meno;
        this.adresa = adresa;
    }

    // Metóda, ktorá vráti informácie o zamestnancovi vo formáte reťazca
    public String EmployerPrintln() {
        return "ID: " + id + " Meno: " + meno + " Adresa: " + adresa;
    }
}
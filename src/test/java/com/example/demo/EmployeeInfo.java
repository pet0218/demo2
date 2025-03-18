package com.example.demo;

public class EmployeeInfo {

    private int id;
    private String name;
    private String address;

    // Konstruktor pre nastavenie hodnôt
    public EmployeeInfo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getter pre id
    public int getId() {
        return id;
    }

    // Getter pre meno
    public String getName() {
        return name;
    }

    // Getter pre adresu
    public String getAddress() {
        return address;
    }

    // Možno pridať aj metódu na vypisovanie informácií v reťazci
    @Override
    public String toString() {
        return "EmployeeInfo{id=" + id + ", name='" + name + "', address='" + address + "'}";
    }
}
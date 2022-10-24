package com.course;

public class TesteTernarioJava {

    public static void usandoTernarion(int valorA ){
        String resultado = valorA<=12 ? "verdade" : "falso";
        System.out.println("Valor e de "+ resultado);
    }

    public static void main(String[] args) {
        usandoTernarion(16);
    }


}

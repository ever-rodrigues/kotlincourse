package com.course;

import java.io.Serializable;

public class TesteTernarioJava implements Serializable {

    public static void usandoTernarion(int valorA ){
        String resultado = valorA<=12 ? "verdade" : "falso";
        System.out.println("Valor e de "+ resultado);
    }

    public static void main(String[] args) {
        usandoTernarion(16);
    }

    StringBuffer as = new StringBuffer();


}

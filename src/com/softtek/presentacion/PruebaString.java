package com.softtek.presentacion;

public class PruebaString {

    public static void main(String[] args) {
        String cadena="Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.substring(0,5));
        System.out.println(cadena.substring(16,21));
        System.out.println(cadena.substring(31,37));
        System.out.println(cadena.indexOf("m"));
        System.out.println(cadena.length());
    }
}

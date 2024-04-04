package com.softtek.modelo;

public class Tablas {
    private int tabla;

    public Tablas(int tabla) {
        this.tabla = tabla;
    }

    public String mostrarTabla(){
        String res="";
        for (int i = 1; i <= 10; i++) {
            res+=tabla+"X"+i+"="+tabla*i+"\n";
        }
        return res;
    }
}

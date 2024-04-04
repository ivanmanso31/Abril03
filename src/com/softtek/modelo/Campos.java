package com.softtek.modelo;

public class Campos {

    private int x;

    public Campos(int x) {
        this.x = x;
    }

    public void incrementa(int incremento) {
        this.x += incremento;
    }

    public int muestra() {
        return x;
    }
}

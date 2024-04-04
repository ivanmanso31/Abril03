package com.softtek.presentacion;

import com.softtek.modelo.Areas;
import com.softtek.modelo.Campos;
import com.softtek.modelo.Tablas;

public class Main {

    public static void main(String[] args) {
        System.out.println(Areas.rectangulo(5,6));
        System.out.println(Areas.circulo(3));
        Campos c= new Campos(4);
        System.out.println(c.muestra());
        c.incrementa(2);
        System.out.println(c.muestra());
        Tablas t= new Tablas(5);
        System.out.println(t.mostrarTabla());
    }
}

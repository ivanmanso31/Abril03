package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Locale;
import java.util.Scanner;

public class MainDado {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Dado d = new Dado();
        String decision="S";
        while(decision.toUpperCase().equals("S")){
            d.tirar();
            System.out.println(d.mostrar());
            System.out.println("Quiere continuar S/N");
            decision= sc.next();
        }
    }
}

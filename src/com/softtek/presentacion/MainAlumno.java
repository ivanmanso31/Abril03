package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

import java.util.Scanner;

public class MainAlumno {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre del alumno");
        String nombre = sc.next();
        System.out.println("Numero de notas");
        int notas=sc.nextInt();
        Alumno a= new Alumno(nombre,notas);
        pedir(a,notas);
        System.out.println(a.mostrar());
        System.out.println(a.media());
        sc.close();
    }

    public static void pedir(Alumno a,int notas){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas; i++) {
            System.out.println("Añadir nota");
            double nota = sc.nextDouble();
            a.rellenar(nota);
        }
        sc.close();
    }
}

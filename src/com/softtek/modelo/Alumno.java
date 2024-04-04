package com.softtek.modelo;

public class Alumno {

    private String nombreCompleto;
    private Double[] notas;

    public Alumno(String nombreCompleto,int notas) {
        this.nombreCompleto = nombreCompleto;
        this.notas= new Double[notas];
    }

    public void rellenar(double nota){
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]==null){
                notas[i]=nota;
                return;
            }
        }
    }
    public String media(){
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        return "la media es: "+suma/notas.length;
    }


    public String mostrar(){
        String res="";
        res+="Alumno: "+nombreCompleto+"\n";
        for (int i = 0; i < notas.length; i++) {
            res+=notas[i]+"\n";
        }
        return res;
    }

}

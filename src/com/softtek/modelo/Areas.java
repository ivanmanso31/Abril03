package com.softtek.modelo;

public class Areas {

    public static double rectangulo(int base, int altura){
        int area=base*altura;
        return area;
    }
    public static double circulo(int radio){
        double area=Math.PI*Math.pow(radio,2);
        return area;
    }
}

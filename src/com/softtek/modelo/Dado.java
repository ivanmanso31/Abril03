package com.softtek.modelo;

public class Dado {

    private int num;

    public Dado() {
        this.num = (int)(Math.random()*(6-1)+1);
    }

    public void tirar(){
        num=(int)(Math.random()*(6-1)+1);
    }

    public String mostrar(){
        String res="";
        switch (num){
            case 1: res=". . . \n. * . \n. . . ";
                break;
            case 2: res="* . . \n. . . \n. . * ";
                break;
            case 3: res="* . . \n. * . \n. . * ";
                break;
            case 4: res="* . * \n. . . \n* . * ";
                break;
            case 5: res="* . * \n. * . \n* . * ";
                break;
            case 6: res="* . * \n* . * \n* . * ";
                break;
            default:
                res="Algo ha salido mal";
                break;
        }
        return res;
    }
}

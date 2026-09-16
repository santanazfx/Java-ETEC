package com.mycompany.conversor;

public class ConverModel {
    private double graus;


    public double getGrausC() {
        return graus;
    }

    public void setGrausC(double grausC) {
        this.graus = grausC;
    }
   
    public double getGraus() {
        return graus;
    }

    public void setGraus(double graus) {
        this.graus = graus;
    }

 
    
    public double calcularConversaoF(){
    return (graus * 1.8) + 32;
    }
    public double calcularConversaoC(){
    return (graus - 32) * 5/9;
    }
    
    
}

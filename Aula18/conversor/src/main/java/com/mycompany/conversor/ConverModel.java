package com.mycompany.conversor;

import java.util.*;


public class ConverModel {
    private double graus;
    private ArrayList<String> historicoC = new ArrayList<>();

    public List<String> getHistoricoC() {
        return historicoC;
    }

    public void setHistoricoC(ArrayList<String> historicoC) {
        this.historicoC = historicoC;
       
    }
    
    public void addHistoricoC(String hist) {
        historicoC.add(hist);
    }


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

    public void apagarHist(){ historicoC.clear();}
 
    
    public double calcularConversaoF(){
    return (graus * 1.8) + 32;
    }
    public double calcularConversaoC(){
    return (graus - 32) * 5/9;
    }
    
    
    
    
}

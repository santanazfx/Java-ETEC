/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imccalc;


public class ImcModel {
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    public double calcularImc(){
       if(altura <= 0 || peso <= 0) {
           throw new IllegalArgumentException("A altura ou peso tem q ser maior do que 0");
        } 
        return peso / (altura*altura);
    }
    
    public String obterClas(double imc){
        if(imc < 18.5)return "abaixo do peso";
        if(imc < 24.9)return "Peso normal";
        if(imc < 29.9)return "Sobrepeso";
        if(imc < 34.9)return "Obesidade Grau I";
        if(imc < 39.9)return "Obesidade Grau II";
        return "Obesidade Grau III";
    }
}
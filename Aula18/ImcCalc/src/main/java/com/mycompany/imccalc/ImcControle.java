
package com.mycompany.imccalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImcControle {
    
    private ImcModel model;
    private ImcView view;

    public ImcControle(ImcModel model, ImcView view) {
        this.model = model;
        this.view = view;
        this.view.addCalcularListiner(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
    }
    
    public void calcularIMC(){
        try{
        double peso = Double.parseDouble(view.getPesoTexto().replace("," , "."));
        double altura = Double.parseDouble(view.getAltTexto().replace("," ,"."));
        
        model.setPeso(peso);
        model.setAltura(altura);
        
        double imc = model.calcularImc();
        String classificacao = model.obterClas(imc);
        
        String resultado = String.format("IMC = %.2f (%s)", imc, classificacao);
        view.setResultado(resultado);
        
        
        
        }catch (NumberFormatException ex){
            view.exibirMensagem("por favor, insira valores númericos");
        }
    }
}
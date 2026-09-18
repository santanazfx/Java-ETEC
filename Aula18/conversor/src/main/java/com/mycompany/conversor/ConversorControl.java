package com.mycompany.conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConversorControl {
    
    private ConverModel model;
    private ConverView view;
    

    public ConversorControl(ConverModel model, ConverView view) {
        this.model = model;
        this.view = view;
        this.view.addConverListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == view.getBtnConverF() ) {
                converterGrausF();
                }
                else if (e.getSource() == view.getBtnConverC()){
                converterGrausC();
                }
                else if (e.getSource() == view.getBtnLimpar()){
                view.limparDisplay();
                model.apagarHist();
                }
            }
        });
    }
    public void converterGrausF(){
        try {
           
            if(view.getGrausText().length() > 7){
                view.exibirMensagem("Digite um numero menor.");
                return;
            }
           double graus = Double.parseDouble(view.getGrausText());
            
           model.setGraus(graus);
                  
                  
           double fahrenheit = model.calcularConversaoF();
            view.setResposta(String.format("%.1f F", fahrenheit));
            
            model.addHistoricoC(String.format("%.1f G -> %.1f F ", graus, fahrenheit));
            view.setHistorico(String.join("\n",model.getHistoricoC()));
            view.setTxtCelcius("");

            
            
        } catch (NumberFormatException e) {
            view.exibirMensagem("Nao digite Letras");
        }
    }
    public void converterGrausC(){
        try {
            if (view.getGrausText().length() > 7) {
                view.exibirMensagem("Digite um numero menor.");
                return;
            }
            double graus = Double.parseDouble(view.getGrausText());
            
            model.setGraus(graus);
            
            double celsius = model.calcularConversaoC();
            view.setResposta(String.format("%.1f C", celsius));
            model.addHistoricoC(String.format("%.1f F -> %.1f G ", graus, celsius));
            view.setHistorico(String.join("\n", model.getHistoricoC()));
            view.setTxtCelcius("");
            
        } catch (NumberFormatException e) {
            view.exibirMensagem("N digite letras/caracteres especiais.");
        }
        
    
    }
}

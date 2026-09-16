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
            }
        });
    }
    public void converterGrausF(){
        try {
           double graus = Double.parseDouble(view.getGrausText());
           
           model.setGraus(graus);
                  
                  
           double fahrenheit = model.calcularConversaoF();
            view.setResposta(String.format("%.1f F", fahrenheit));
            
            
        } catch (NumberFormatException e) {
            view.exibirMensagem("Nao digite Letras");
        }
    }
    public void converterGrausC(){
        try {
            double graus = Double.parseDouble(view.getGrausText());
            
            model.setGraus(graus);
            
            double celsius = model.calcularConversaoC();
            view.setResposta(String.format("%.1f C", celsius));
            
        } catch (NumberFormatException e) {
            view.exibirMensagem("Nao digite letras");
        }
        
    }

 
    
    
    
    
}

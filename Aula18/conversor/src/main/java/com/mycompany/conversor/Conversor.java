

package com.mycompany.conversor;


public class Conversor {

    public static void main(String[] args) {
        ConverModel model = new ConverModel();
        ConverView view = new ConverView();
        
        ConversorControl control = new ConversorControl(model, view);
        
        view.setVisible(true);
    }
}

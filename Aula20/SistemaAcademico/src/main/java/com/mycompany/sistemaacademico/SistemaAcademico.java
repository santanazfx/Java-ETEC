

package com.mycompany.sistemaacademico;


public class SistemaAcademico {

    public static void main(String[] args) {
       AcademicoModel model = new AcademicoModel();
       LoginAcademico view = new LoginAcademico();
       
       AcademicoControl control = new AcademicoControl(model, view);
       
       view.setVisible(true);
    }
}

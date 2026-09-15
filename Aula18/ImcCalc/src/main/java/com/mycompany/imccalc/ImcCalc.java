/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imccalc;

public class ImcCalc {
    public static void main(String[] args) {
        ImcModel model = new ImcModel();
        ImcView view = new ImcView();

        ImcControle controle = new ImcControle(model, view);

        view.setVisible(true);
    }
}

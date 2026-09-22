/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaescolar;

/**
 *
 * @author 026583
 */
public class MediaEscolar {

    public static void main(String[] args) {
        MediaModel model = new MediaModel();
        MediaView view = new MediaView();
        
        MediaControl control = new MediaControl(view, model);
        
        view.setVisible(true);
    }
}

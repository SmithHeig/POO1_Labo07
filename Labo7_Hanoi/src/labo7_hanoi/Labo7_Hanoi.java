/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7_hanoi;

import hanoi.*;
import hanoi.gui.*;
//import hanoi.gui.JHanoi;
import util.Pile;

/**
 *
 * @author James
 */
public class Labo7_Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        // Notre hanoi bien aimé !
        Hanoi h = new Hanoi(4);
        
        // Résoud-toi Ô hanoi-sama !
        h.solve();
        
        JHanoi hanoiGui = new JHanoi();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7_hanoi;

import hanoi.*;
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
        Pile test = new Pile();
        test.stack(1);
        test.stack(2);
        test.stack(3);
        test.stack(4);
        test.stack(5);
        test.stack(6);
        test.stack(7);
        test.stack(8);
        test.stack(9);
        System.out.println(test);
        // Notre hanoi bien aimé !
        Hanoi h = new Hanoi(4);
        
        // Résoud-toi Ô hanoi-sama !
        h.solve();
        
        
    }
    
}

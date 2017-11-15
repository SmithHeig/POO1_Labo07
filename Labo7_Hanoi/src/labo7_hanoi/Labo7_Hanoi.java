package labo7_hanoi;

import hanoi.*;
import hanoi.gui.*;

/**
 * Classe principale du jeu d'hanoi
 * @author Adrien Alleman et James Smith
 */
public class Labo7_Hanoi {

    /**
     * Fonction principal du programme
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        // Notre hanoi bien aimé !
        Hanoi h = new Hanoi(4);
        
        // Résoud-toi Ô hanoi-sama !
        h.solve();
        
        // et dieu créa la GUI !
        JHanoi hanoiGui = new JHanoi();
        
    }
    
}

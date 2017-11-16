package labo7_hanoi;

import hanoi.*;
import hanoi.gui.*;
import java.lang.IllegalArgumentException;
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
        
        // test de la saisie de l'utilisateur bienveillant.
        if(args.length == 1){
            
            // Extraction du saint nombre de disks.
            // Peut lancer une exception si l'utilisateur n'est pas bienveillant !
            int nbDisks = Integer.parseInt(args[0]);
            
            // Bienvenue sur terre, hanoi bien aimé !
            Hanoi h = new Hanoi(nbDisks);

            // Résoud-toi Ô hanoi-sama !
            h.solve();
        }
        else if(args.length == 0) {
            // Par les pouvoirs du JAVA viens à nous sainte GUI !
            JHanoi hanoiGui = new JHanoi();
        }
        else {
            throw new IllegalArgumentException();
        }
        
    }
}

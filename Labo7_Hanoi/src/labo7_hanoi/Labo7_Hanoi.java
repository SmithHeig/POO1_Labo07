package labo7_hanoi;

import hanoi.*;
import hanoi.gui.*;
import test.TestPile;
/**
 * Classe principale du jeu d'hanoi
 * @author Adrien Alleman et James Smith
 */
public class Labo7_Hanoi {

    /**
     * Fonction principal du programme
     * @param args the command line arguments. Expected values : <b>"testpile"</b> will launch the 
     * test programm of our Pile class. <b>int greater than 1</b> the number of disks to be used. 
     * Be aware that the turn counter supports 31 disks at maximum as it is stored in an int.
     * <b>none</b> no arguments will launch the programm in GUI mode.
     * 
     */
    public static void main(String[] args) {    
        
        // test de la saisie de l'utilisateur bienveillant.
        if(args.length == 1){
            if(new String("test").equals(args[0])){
                TestPile.test();
            } else {
                // Extraction du saint nombre de disks.
                // Peut lancer une exception si l'utilisateur n'est pas bienveillant !
                int nbDisks = Integer.parseInt(args[0]);
                
                // Si l'utilisateur est fourbe on lance l'exception nous-même !
                if(nbDisks < 1){
                    throw new IllegalArgumentException();
                }
                
                // Bienvenue sur terre, hanoi bien aimé !
                Hanoi h = new Hanoi(nbDisks);

                // Résoud-toi Ô hanoi-sama !
                h.solve();
            }
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

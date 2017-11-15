package hanoi;

/**
 * Classe représentant l'affichage du jeu d'hanoi
 * @author Adrien Alleman et James Smith
 */
public class HanoiDisplayer {
    
    /**
     * Fonction affichange l'état du jeu à un certain tour
     * @param h jeu d'hanoi qui est entrain d'etre jouer.
     */
    public void display(Hanoi h){
        System.out.println("-- Turn: " + h.turn());
        System.out.println(h);
    }
}

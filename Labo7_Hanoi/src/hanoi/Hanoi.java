package hanoi;

import util.*;

/**
 * Classe représentant le jeu d'Hanoi
 * @author Adrien Alleman et James Smith
 */
public class Hanoi {
    private int disks;
    private int cmpt;
    private Pile towers[];
    private final int NB_TOWERS = 3;
    private HanoiDisplayer displayer;
    
    /**
     * Constructeur du jeu d'Hanoi
     * @param disks nombres de disques
     */
    public Hanoi(int disks){
        this(disks, new HanoiDisplayer());
        
    }
   
    /**
     * Constructeur du jeu d'Hanoi avec un displayer (affichage) spécifique
     * @param disks Nombre de disqeus
     * @param displayer Class comprenant des fonctions d'affichage
     */
    public Hanoi(int disks, HanoiDisplayer displayer){
        this.disks = disks;
        cmpt = 0;
        
        // Création des piles
        towers = new Pile[NB_TOWERS];
        
        for(int i = 0; i < NB_TOWERS; ++i){
            towers[i] = new Pile();
        }
        
        for(int i = disks; i > 0; --i){
            towers[0].stack(i);
        }
        this.displayer = displayer;
    }
    
    /**
     * Fonction résolvant le jeu d'Hanoi
     */
    public void solve(){
        cmpt = 0; //reset compteur
        displayer.display(this);
        transfert(towers[0], towers[1], towers[2], disks);
    }
    
    /**
     * Fonction retournant l'état du jeu
     * @return un tableau de int comportant les trois tours et les numéros des disques
     *         dans chaqu'une d'elle
     */
    public int[][] status(){
        int[][] posTowers = new int[NB_TOWERS][];
        
        for(int i = 0; i < NB_TOWERS; ++i){
            int[] t = new int[towers[i].size()];
            for(int j = 0; j < towers[i].size(); ++j){
                // cast en int car nous avons un tableau d'objet représentant des disks (int)
                t[j] = (int)(towers[i].status())[j];
            }
            posTowers[i] = t;
        }
        
        return posTowers;
    }
    
    /**
     * Fonction détérminant si le jeu est terminer ou non
     * @return true si le jeu est fini
     */
    public boolean finished(){
        return towers[NB_TOWERS-1].size() == disks;
    }
    
    /**
     * Fonction retournant le nombre de tours jouer (état courant)
     * @return nombre de tour joué
     */
    public int turn(){
        return cmpt; // To change
    }
    
    /**
     * Fonction réalisant les transferts des disques d'une tours à l'autre
     * @param from tour ou part le disque
     * @param via tour par lequel le disque va passer
     * @param to tour ou le dique va arrivé
     * @param n nombre de disques
     */
    private void transfert(Pile from, Pile via, Pile to, int n){
        if(n > 0){
            transfert(from,to,via,n-1);
            to.stack(from.unstack());
            cmpt++;                  // Incrémentation du nombre de tour
            displayer.display(this); // Affichage de status
            transfert(via,from,to,n-1);
        }
    }
    
    /**
     * Fonction retournant un représentation du jeu en caractère ASCII
     * @return String - retourne l'état du jeu
     */
    public String toString(){
        String print = "";
        print += String.format("%7s [%s]\n", "One:",towers[0]); // ajouter affichage de la pile
        print += String.format("%7s [%s]\n", "Two:",towers[1]);
        print += String.format("%7s [%s]\n", "Three:", towers[2]);
        
        return print;
    }
}

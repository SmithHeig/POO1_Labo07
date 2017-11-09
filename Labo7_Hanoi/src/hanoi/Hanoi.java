/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import util.*;

/**
 * @author James
 */
public class Hanoi {
    private int disks;
    private int cmpt;
    private Pile towers[];
    private final int NB_TOWERS = 3;
    private HanoiDisplayer displayer;
    
   
    public Hanoi(int disks){
        this(disks, new HanoiDisplayer());
        
    }
    
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
    
    public void solve(){
        cmpt = 0; //reset compteur
        transfert(towers[0], towers[1], towers[2], disks);
    }
    
    public int[][] status(){
        /** A demander au prof **/
        Object[] objectsTower1 = towers[0].status();
        Object[] objectsTower2 = towers[1].status();
        Object[] objectsTower3 = towers[2].status();
        Object[][] objectsTowers = {objectsTower1,objectsTower2,objectsTower3};
        System.out.println(towers[0].size() + " " + towers[1].size() + " " + towers[2].size());
        int[] posTower1 = new int[towers[0].size()];           
        int[] posTower2 = new int[towers[1].size()];           
        int[] posTower3 = new int[towers[2].size()];
        int[][] posTowers = {posTower1,posTower2,posTower3};
        
        for(int i = 0; i < 3; ++i){    
            for(int j = 0; j < towers[i].size(); ++j){
                posTowers[i][j] = (int)objectsTowers[i][j];
            }
        }
        
        return posTowers;
    }
    
    public boolean finished(){
        return false;
    }
    
    public int turn(){
        return cmpt; // To change
    }
    
    private int transfert(Pile from, Pile via, Pile to, int n){
        if(n > 0){
            transfert(from,to,via,n-1);
            to.stack(from.unstack());
            cmpt++;
            displayer.display(this); // Affichage de status
            transfert(via,from,to,n-1);
        }
        return 0; // to change
    }
    
    public String toString(){
        String print = "";
        print += String.format("%7s [%s]\n", "One:",towers[0]); // ajouter affichage de la pile
        print += String.format("%7s [%s]\n", "Two:",towers[1]);
        print += String.format("%7s [%s]\n", "Three:", towers[2]);
        
        return print;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import util.Pile;
import util.PileIterator;

/**
 *
 * @author James
 */
public class Hanoi {
    private int disks;
    private int cmpt;
    private Pile towers[];
    private HanoiDisplayer displayer;
    
   
    public Hanoi(int disks){
        cmpt = 0;
        Pile tower1 = new Pile();
        for(int i = 0; i < disks; ++i){
            tower1.stack(i);
        }
    }
    
    public Hanoi(int disks, HanoiDisplayer displayer){
        this(disks);
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
            displayer.display(); // Affichage de status
            transfert(via,from,to,n-1);
        }
        return 0; // to change
    }
    
    public String toString(){
        String print = "";
        print += String.format("%7s [%s]", "One:",towers[0]); // ajouter affichage de la pile
        print += String.format("%7s [%s]", "Two:",towers[1]);
        print += String.format("%7s [%s]", "Three:", towers[2]);
        
        return print;
    }
}

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
    private HanoiDisplayer display;
    
   
    public Hanoi(int disks){
        cmpt = 0;
        Pile tower1 = new Pile();
        for(int i = 0; i < disks; ++i){
            tower1.stack(i);
        }
    }
    
    public Hanoi(int disks, HanoiDisplayer displayer){
        this(disks);
        display = displayer;
    }
    
    public void solve(){
        cmpt = 0; //reset compteur
        transfert(towers[0], towers[1], towers[2], disks);
    }
    
    public int[][] status(){
        /** A demander au prof **/
        /**Object[] objectsTower1 = towers[0].status();
        Object[] objectsTower2 = towers[1].status();
        Object[] objectsTower3 = towers[2].status();
        int maxSize;
        if(objectsTower1.length > objectsTower2.length && objectsTower1.length > objectsTower3.length){
            maxSize = objectsTower1.length;
        } else if(objectsTower2.length > objectsTower3.length){
            maxSize = objectsTower2.length;
        } else {
            maxSize = objectsTower3.length;
        }
        
        for(int i = 0; i < maxSize; ){
            
        }*/
        
        return null;
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
            transfert(via,from,to,n-1);
        }
        return 0; // to change
    }
}

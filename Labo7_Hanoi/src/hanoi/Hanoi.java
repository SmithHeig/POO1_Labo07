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
    int disks;
    Pile towers[];
    HanoiDisplayer display;
    
   
    public Hanoi(int disks){
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
        
    }
    
    public int[][] status(){
        return null;
    }
    
    public boolean finished(){
        return false;
    }
    
    public int turn(){
        return 1; // To change
    }
    
    private int transfert(PileIterator from, PileIterator via, PileIterator to, int n){
        if(n > 0){
            transfert(from,to,via,n-1);
            
        }
        return 0; // to change
    }
}

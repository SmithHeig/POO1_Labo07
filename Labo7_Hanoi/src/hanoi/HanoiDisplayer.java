/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 *
 * @author James
 */
public class HanoiDisplayer {
    Hanoi hanoi;
    
    public HanoiDisplayer(Hanoi h){
        hanoi = h;
    }
    
    public void display(){
        System.out.println("-- Turn: " + hanoi.turn());
        System.out.println(hanoi);
    }
}

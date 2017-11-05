/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author James
 */
public class PileIterator{
    private PileElement currentEl;
    
    public PileIterator(PileElement head){
        currentEl = head;
    }
    
    public PileElement next() {
        PileElement temp = currentEl;
        currentEl = currentEl.next;
        return temp;
    }
    
    public boolean hasNext(){
        return currentEl.next != null; // temp
    }
}

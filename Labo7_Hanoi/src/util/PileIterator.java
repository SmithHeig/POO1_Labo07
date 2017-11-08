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
    
    PileIterator(PileElement element){
        currentEl = element;
    }
    
    public Object next() {
        PileElement temp = currentEl;
        currentEl = currentEl.next;
        return temp.data;
    }
    
    public boolean hasNext(){
        return currentEl.next != null; // temp
    }
}

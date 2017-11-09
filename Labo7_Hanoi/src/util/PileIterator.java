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
        currentEl = new PileElement(null,element);
    }
    
    public Object next() {
        if(!hasNext()){
            return null; //Exception ?
        }
        currentEl = currentEl.next;
        return currentEl.data;
    }
    
    public boolean hasNext(){
        return (currentEl.next != null); // temp
    }
}

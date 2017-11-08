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
        if(currentEl == null){
            return null;
            //Exception ?
        }
        Object temp = currentEl.data;
        currentEl = currentEl.next;
        return temp;
    }
    
    public boolean hasNext(){
        // Si pile 
        if(currentEl == null){
            return false;
        }
        return (currentEl.next != null); // temp
    }
}

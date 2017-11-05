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
public class Pile {
    private PileElement head;
    
    public Pile(){
        // Do nothing
    }
    
    public Pile(Object ... objects){
        for(Object o : objects){
            stack(o); // A demander pourquoi il y a l'avertissement
        }
    }
    
    public void stack(Object o){
        PileElement newEl = new PileElement(o,head);
        head = newEl;
    }
    
    public Object unstack(){
        PileElement temp = head;
        head = head.next;
        return temp.data;
    }
    
    public String toString(){
        String print = "";
        for(Object o : status()){
            print += "<" + o + "> ";
        }
        return print;
    }
    
    public Object[] status(){
        PileIterator it = iterator();
        PileElement element;
        Object[] objects = new Object[size()];
        int i = 0;
        while(it.hasNext()){
            element = it.next();
            objects[i++] = element.data;
        }
        return null;
    }
    
    public PileIterator iterator(){
        return new PileIterator(head);
    }
    
    public int size(){
        PileIterator it = iterator();
        int cmpt = 0;
        while(it.hasNext()){
            cmpt++;
            it.next();
        }
        return cmpt;
    }
    
}

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
public class PileElement {
    protected Object data;
    protected PileElement next;
    
    public PileElement(Object data, PileElement oldHead){
        this.data = data;
        this.next = oldHead;
    }
    
    public String toString(){
        return data.toString();
    }
}

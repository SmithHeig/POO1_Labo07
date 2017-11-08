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
class PileElement {
    Object data;          //prof ?
    PileElement next;     //prof ?
    
    PileElement(Object data, PileElement oldHead){
        this.data = data;
        this.next = oldHead;
    }
    
    public String toString(){
        return data.toString();
    }
}

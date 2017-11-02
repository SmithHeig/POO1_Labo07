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
    private Object data;
    private PileElement next;
    
    public PileElement(Object data){
        this.data = data;
    }
}

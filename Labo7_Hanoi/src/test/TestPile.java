/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.EmptyStackException;
import util.*;

/**
 *
 * @author James
 */
public class TestPile {
    public static void test(){
        // INIT1
        Pile pile1 = new Pile();
        System.out.println("Test constructeur - Pile(): " + pile1);
        //Iterator sur pile vide / hasnext()
        PileIterator it1 = pile1.iterator();
        System.out.print("Pile1 iterator - it1.hasnext():");
        try{
            System.out.println(it1.hasNext());
        } catch(EmptyStackException e){
            System.out.println("Exeption: " + e);
        }
        //STACK 
        pile1.stack(6);
        System.out.println("Pile1 - stack(6): " + pile1);
        //Iterator sur pile à un élément
        System.out.println("Pile1 - iterator - hasnext()" + it1.hasNext());
        //Iterator test next()
        try{
            Object o1 = it1.next();
            System.out.println("Object retour - it1.next() " + o1);
            try{
            System.out.println("Pile iterator - it1.hasNext() " + it1.hasNext());
            } catch(EmptyStackException e){
                System.out.println("Pile1 - Exeption it1.hasNext(): " + e);
            }
        } catch(EmptyStackException e){
            System.out.println("Pile1 -Exeption it1.next(): " + e);
        }
        //Size()
        System.out.println("Pile1 - size(): " + pile1.size());
        //unstack()
        Object o2 = pile1.unstack();
        System.out.println("Pile1 - unstack() - Object: " + o2);
        System.out.println("Pile1 - unstack() - Pile: " + pile1);
        
        //INIT2
        System.out.println("\nTEST2");
        Pile pile2 = new Pile(1,2,3,4,5,6,7,8);
        System.out.println("Pile2 - Test constructeur - Pile(1,2,3,4,5,6,7,8): " + pile1);
        // test for unstack 3 élément
        for(int i = 0; i < 3; ++i){
            pile2.unstack();
        }
        System.out.println("Pile2 - For unstack 3 elements: " + pile2);
        //test stack après unstack
        pile2.stack(10);
        System.out.println("Pile2 - Test stack apres unstack - pile2.stack(10): " + pile2);
    }
}

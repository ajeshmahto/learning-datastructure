/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.datastructure;

import learning.datastructure.adt.stack.Queue;
import learning.datastructure.adt.stack.Stack;

/**
 *
 * @author ajesh
 */
public class LearningDatastructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       SingleListList list = new SingleListList();
       list.insertFirst(100);
       list.insertFirst(200);
       list.insertFirst(300);
       list.insertFirst(400);
       list.displayFirst();
       list.deleteFirst();
        System.out.println("");
       list.displayFirst();
       list.insertLast(800);
       list.insertLast(900);
       System.out.println("");
       list.displayFirst();
        
        
        
    }
    
   
    
}

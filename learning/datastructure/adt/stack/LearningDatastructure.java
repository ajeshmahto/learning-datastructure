/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.datastructure.adt.stack;

import learning.datastructure.adt.stack.DoublyLinkedList;
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
        
       DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(900);
       list.insertFirst(100);
       list.insertFirst(200);
       list.insertFirst(300);
        list.insertLast(5000);
       list.insertFirst(400);
        list.insertFirst(1900);

        list.insertAfter(300,1000);


        System.out.println();
        list.displayFirst();
        list.delete(300);
        System.out.println();
        list.displayFirst();
        
        
        
    }
    
   
    
}

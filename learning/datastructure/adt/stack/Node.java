/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.datastructure.adt.stack;

/**
 *
 * @author ajesh
 */
public class Node {
    public int data;
    public  Node next;
    
    public Node(int data){
        this.data=data;
    }
    
    public void displayNode(){
        System.out.print("{ "+ data +" }");
    }
    
}

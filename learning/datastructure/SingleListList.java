/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.datastructure;

import learning.datastructure.adt.stack.Node;



/**
 *
 * @author ajesh
 */
public class SingleListList {
    Node first;
    Node last;
    
    public void insertFirst(int data){
        
        
        Node newNode = new Node(data);
        
        
        newNode.next= first;
        first = newNode;
        
        
       
    }
    
    public void insertLast(int data){
        Node current = first;
        Node newNode = new Node(data);
        while(current.next!=null){
            current = current.next;
        }
        
        current.next = newNode;
        
        
        
        
    }
    
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
         
    }
    
    public void displayFirst(){
        
        Node currentNode = first;
        
        while(currentNode!=null){
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        
        
        
    }
    
}

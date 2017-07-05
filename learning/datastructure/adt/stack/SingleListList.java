/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.datastructure.adt.stack;

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
        if(isEmpty()){
            last=newNode;
        }
        
        newNode.next= first;
        first = newNode;
        
        
       
    }
    
    public void insertLast(int data){

        Node newNode = new Node(data);

        if(first==null){
            first = newNode;
        }
        if(last==null) {
            last =newNode;
        }
        if(last!=null) {
            last.next = newNode;
            last = newNode;
        }
        
        
        
        
    }

    public boolean isEmpty(){
        if(first==null){
            return true;
        }
        else return false;
    }

    
    public int deleteFirst(){
        int data = first.data;
        first = first.next;
        return data;
         
    }

    public void delete(int data){
        Node current = first;

        while(current.next!=null){
            if(current.data==data){

            }
        }
    }


    public void deleteLast(){
        int data = last.data;

    }
    
    public void displayFirst(){
        
        Node currentNode = first;
        
        while(currentNode!=null){
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        
        
        
    }


    
}

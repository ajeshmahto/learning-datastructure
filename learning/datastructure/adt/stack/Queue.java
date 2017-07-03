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
public class Queue {
    
    int maxSize;
    long [] queueArray;
    int front;
    int rear;
    int nItems;
    
    public Queue(int size){
        this.maxSize=size;
        queueArray = new long[maxSize];
        this.front=0;
        this.rear=-1;
        this.nItems=0;
    }
    
    public void add(long value){
        if(isFull()){
            System.out.println("is full");
            return;
        }
         if(!isFull() && rear==maxSize-1){
            rear=-1;
        }
       
        this.rear++;
        queueArray[rear]=value;
        nItems++;
        
        
    }
    
    public long remove(){
        if(isEmpty()){
            System.out.println("is empty");
            return -1;
        }
       
       
        long temp = queueArray[front];
        this.front++;
        this.nItems--;
       
         if(!isEmpty() && this.front>maxSize-1){
            front=0;
        }
        return temp;
        
    }
    
    public long peek(){
        return queueArray[front];
    }
    
    public void view(){
      if(!isEmpty()){
           System.out.print("[");
        for(int i=front;i <maxSize;i++){
            System.out.print(queueArray[i]+ " ");
        }
        
        if(rear<front){
            for(int i=0;i<=rear;i++){
                 System.out.print(queueArray[i]+ " ");
            }
        }
        System.out.print("]");
          
      }  
       
    }
    
    public boolean isEmpty(){
        return (this.nItems==0);

    }
    public boolean isFull(){
        return this.nItems==maxSize;
    }
}

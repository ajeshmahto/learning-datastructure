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
public class Stack {
    int maxSize;
    char [] stackArray ;
    int top;
    
    public Stack(int size){
        this.maxSize=size;
        this.top =-1;
        this.stackArray = new char[maxSize];
    }
    
    public void push(char value){
        if(isFull()){
            throw new RuntimeException("Stack overflow...");
        }
        this.top++;
        stackArray[top]=value;
    }
    
    public char pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty...");
        }
        int old_top = top;
        this.top--;
        return stackArray[old_top];
    }
    
    public char peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top==-1);
    }
    
    public boolean isFull(){
        return(maxSize-1==top);
    }
   
}

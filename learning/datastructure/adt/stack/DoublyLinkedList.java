package learning.datastructure.adt.stack;

/**
 * Created by ajesh on 7/3/17.
 */
public class DoublyLinkedList {

    Node first;
    Node last;


    public void insertFirst(int data){


        Node newNode = new Node(data);

        if(isEmpty()){
            last =newNode;
        }

        else {
            first.previous = newNode;
        }

        if(last.previous==null){
            last.previous=first;
        }

            newNode.next= first;
            first = newNode;


    }

    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            newNode.previous=last;
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
        first.next.previous = null;
        first = first.next;

        return data;

    }




    public int deleteLast(){
        int data = last.data;
        last = last.previous;
        last.next = null;
        return data;

    }

    public void displayFirst(){

        Node currentNode = first;

        while(currentNode!=null){
            currentNode.displayNode();
            currentNode = currentNode.next;
        }

    }

    public void insertAfter(int key, int data){
        Node current =first;
        Node newNode = new Node(data);

        while(current.next!=null){
            if(current.data==key){
                newNode.previous = current;
                newNode.next = current.next;
                current.next = newNode;
                current.next.previous = newNode;


                return;
            }
            current = current.next;
        }
    }

    public void delete(int data){

        Node current =first;


        while(current.next!=null){
            if(current.next.data==data){
                Node temp = current.next.next;
                current.next = null;
                current.previous = null;

                current.next = temp;
                current.next.previous = current;
                 return ;
            }
            current = current.next;

        }

    }


}

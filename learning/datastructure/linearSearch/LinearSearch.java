package learning.datastructure.linearSearch;

/**
 * Created by ajesh on 7/3/17.
 */
public class LinearSearch {

    public int search(int [] a ,int i,int data){
        if(i>=a.length){
            return -1;
        }
        else if(a[i]==data){
            return i;
        }


        else return  search( a, i+1, data);
    }




}

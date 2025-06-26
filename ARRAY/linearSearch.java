import java.util.*;

// LINEAR SEARCH 
public class linearSearch {
    public static int linearSearch(int numbers[], int key) { 
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key) {     
                return i;
            }
        }
        return -1;    // Key does not exist

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 10;   //search for 10 ....in which index it is situated or not 
        int key = 20;// if we will pass 20 th output will bE "NOT FOUND"

        int index = linearSearch(numbers, key);    //Calling the linearsearch
        if (index == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Key is at index :" + index);
        }
        System.out.println("Key is at index");

    }
}

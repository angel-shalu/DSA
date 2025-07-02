<<<<<<< HEAD
// Binary Search  [2,4,6,8,10,12,14]
// keys = 10


import java.util.*;
public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end ){
            int mid = (start + end) /2;

            // Comparisions
            if(numbers[mid] == key){   //found
                return mid;
            }
            if(numbers[mid] < key){  //right
                start = mid+1;
            }
            if(numbers[mid] > key){    //left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("Index for key :" +binarySearch(numbers,key));


    }
    
}
=======
// Binary Search  [2,4,6,8,10,12,14]
// keys = 10


import java.util.*;
public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end ){
            int mid = (start + end) /2;

            // Comparisions
            if(numbers[mid] == key){   //found
                return mid;
            }
            if(numbers[mid] < key){  //right
                start = mid+1;
            }
            if(numbers[mid] > key){    //left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("Index for key :" +binarySearch(numbers,key));


    }
    
}
>>>>>>> c870b4e5851b98bb5f9b19fbfc457c4b9177cebc

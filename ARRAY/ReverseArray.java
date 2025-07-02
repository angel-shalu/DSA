// Reverse Array [2,4,6,8,10]


import java.util.*;
public class ReverseArray {
    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length-1;

        while(start < end){
            // swap
            int tem = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = tem;

            start ++;
            end --;
        }


    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        reverseArray(numbers);

        // Print
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]+"");  
        }
        System.out.println();
    }
    
}

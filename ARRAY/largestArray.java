// // Find the largest numbe in the given array [1,2,6,3,5]


// import java.util.*;
// public class largestArray {
//     public static int getlargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;     //-INFINITY
//         for(int i=0; i<numbers.length; i++) {
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest ;

//     }
//     public static void main (String args[]) {
//         int numbers [] = {1,2,6,3,5};
//         System.out.println("Largest Array is :"+ getlargest(numbers));
//     } 
    
// }





// // Smallest Array

// import java.util.*;
// public class largestArray {
//     public static int getsmallest(int numbers[]){
//         int smallest = Integer.MAX_VALUE;     //+INFINITY
//         for(int i=0; i<numbers.length; i++) {
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         return smallest ;

//     }
//     public static void main (String args[]) {
//         int numbers [] = {1,2,6,3,5};
//         System.out.println("Largest Array is :"+ getsmallest(numbers));
//     } 
    
// }





// largest and smallest array in one code

import java.util.*;
public class largestArray {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;     //-INFINITY
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];            }
        }
        System.out.println("Smallest Array is :" + smallest);
        return largest ;

    }
    public static void main (String args[]) {
        int numbers [] = {1,2,6,3,5};
        System.out.println("Largest Array is :"+ getlargest(numbers));
    } 
    
}
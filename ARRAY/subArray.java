// SUBARRAY 
// SubArray means a continuous part of the array



// import java.util.*;
// public class subArray {

//     public static void printSubArray(int numbers[]) {
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for (int k=start; k<=end; k++){             //Print 
//                     System.out.println(numbers[k]+"");      //SubArray
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubArray(numbers);
//     }
    
// }





// Total subarray

import java.util.*;
public class subArray {

    public static void printSubArray(int numbers[]) {
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for (int k=start; k<=end; k++){             //Print 
                    System.out.println(numbers[k]+"");      //SubArray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray =" + ts);

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
    
}
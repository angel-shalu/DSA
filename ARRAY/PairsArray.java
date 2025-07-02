// Printing the Pairs of the array [2,4,6,8,10]


import java.util.*;
public class PairsArray{
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.println("(" + curr + " , " + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}




// //  Counting the Pairs 

// import java.util.*;
// public class PairsArray{
//     public static void printPairs(int numbers[]){
//         int tp = 0;
//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.println("(" + curr + " , " + numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total Numbers of the Pairs = " + tp);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printPairs(numbers);
//     }
// }
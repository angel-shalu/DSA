// Taking using from the user and printing the array.


import java.util.*;
public class inputArray {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Dispaly ;");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}

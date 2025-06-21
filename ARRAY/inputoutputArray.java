import java.util.*;
public class inputoutputArray {
    public static void main(String[] args) {
        int marks [] = new int[50];

        // For taking Input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();   //phy
        marks[1] = sc.nextInt();  //chem
        marks[2] = sc.nextInt();  //maths

        // For output
        System.out.println("phy :"+ marks[0]);
        System.out.println("chem :"+ marks[1]);
        System.out.println("maths :"+ marks[2]);

        // // For updating the value
        // // marks[2] = sc.nextInt();  //math
        // marks[2] = marks[2]+5;   //updating the original value | both is correct
        // System.out.println("maths :"+ marks[2]);
    

        // For calculating percentage we have to make a new variable
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage :"+percentage + "%");


    }
}



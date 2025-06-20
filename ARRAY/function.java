// ARRAY AS FUNCTION ARGUMENTS

// Passing array as argument (2 types)
// 1--- Pass by value - any time of the change occure in the function then it will not reflect in the main function or calling function
// 2---By refrence - Any change u make to the variable within function the it will be reflected in both the calling function and the main function 


import java.util.*;
public class function {
    public static void update(int marks[]){      // make new function update 
        for(int i=0; i<marks.length; i++ ){      // loop for adding 1 in marks 
            marks[i] = marks[i]+1;              
        }
    }

    public static void main(String[] args) {
        int marks[] = { 87, 89, 98};
        update(marks);

        // print our marks
        for(int i=0; i<marks.length; i++ ){
            System.out.println(marks[i]+" ");  
        }
        System.out.println();
    }
}

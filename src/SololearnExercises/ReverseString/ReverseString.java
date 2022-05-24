package SololearnExercises.ReverseString;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String text = sc.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here:
        for(int i = arr.length-1; i >=0; i--){
            char rev = arr[i];
            System.out.print(rev);
        }
    }
}

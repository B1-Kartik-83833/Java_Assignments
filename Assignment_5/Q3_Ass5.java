//Q3) write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3_Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();
        StringTokenizer st1=new StringTokenizer(s1);
        System.out.println("No of words in string : "+st1.countTokens());


    }
}

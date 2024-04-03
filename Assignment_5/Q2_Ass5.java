// Q2) Write a java code to check string is palindrome.
import java.util.Scanner;

public class Q2_Ass5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.next();
        StringBuffer sb1 = new StringBuffer((s1));
        sb1.reverse();
        System.out.println(sb1);
        if(s1.contentEquals(sb1))
        {
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
    }

}

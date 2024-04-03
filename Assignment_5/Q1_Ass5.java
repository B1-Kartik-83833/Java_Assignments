import java.util.Scanner;

public class Q1_Ass5 {
        public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String s1 = sc.nextLine();
            StringBuffer sb1 = new StringBuffer(s1);
            sb1.reverse();
            System.out.println(sb1);
        }
    }


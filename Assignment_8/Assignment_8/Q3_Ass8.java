//Q3) Write a Java program to replace the second element of a ArrayList with the specified element.
import java.util.ArrayList;
import java.util.Collections;

public class Q3_Ass8 {
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("The ArrayList contain: ");
//        for(Integer nums : num)
//        {
//            System.out.println(nums);
//        }
        System.out.println(num);
        num.remove(1);
        num.add(1,34);
        System.out.println("The ArrayList after edit: ");
        System.out.println(num);
    }
}

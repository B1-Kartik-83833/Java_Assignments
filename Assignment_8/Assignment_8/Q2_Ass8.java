//Q2) Write a Java program to create a new array list, add some colors (string) and print out the collection as sorted list.
import java.util.ArrayList;
import java.util.Collections;
public class Q2_Ass8 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Black");
        colours.add("Yellow");
        colours.add("Pink");
        colours.add("Green");
        colours.add("Red");


        System.out.println("The colour list is ");
        for(String colour : colours)
        {
            System.out.println(colour);
        }
        Collections.sort(colours);
        System.out.println("The colours list after sorting :");
        for (String colour : colours)
        {
            System.out.println(colour);
        }


        


    }
}

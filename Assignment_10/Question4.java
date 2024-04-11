//Q4)Write a java program to find whether the file is Hidden file or not inside
//the directory.
//Hint : The IO package of java contains a special method named isHidden()

import java.io.File;

public class Question4 {
    public static void main(String[] args) {
        File f1 = new File("ArrayList_Vs_LinkedList.txt");
        System.out.println(" Check the file is hidden or not : "+ f1.isHidden());
    }
}

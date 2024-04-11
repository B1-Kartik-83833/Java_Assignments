import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to check if a file or directory specified by pathname
//exists or no.


//Question 1
public class Question1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String pathname = "\"demo.txt\"";
        File fobj = new File(pathname);
        fobj.createNewFile();
        System.out.println("File is exist or not : " + fobj.exists());

    }
}
//Question 2
import java.io.*;
import java.util.ArrayList;
public class Question2 {
    public static void main(String[] args) throws IOException {
        String pathname = "\"demo.txt\"";

try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathname)))

    {
        for (char i = 'A'; i <= 'Z'; i++) {
            bw.write(i);
        }
        bw.write("Arya");
        bw.write("studdd");
        bw.write("Great");
        bw.write("boyy");
        bw.write("Gentelman");
        System.out.println(" the data is written !!");
    }

    ArrayList filearr2 = new ArrayList();

        try(
    BufferedReader br = new BufferedReader(new FileReader(pathname)))

    {
        int data;
        while ((data = br.read()) != -1) {
            filearr2.add((char) data);
        }
    }
        System.out.println(filearr2);
    }
}

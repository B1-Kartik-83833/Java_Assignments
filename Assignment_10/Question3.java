import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program to store text file content line by line into an array
public class Question3 {
    public static void main(String[] args) throws IOException {
        int max = 0;
        String maxxWord = "";
        try(BufferedReader br2 = new BufferedReader(new FileReader("ArrayList_Vs_LinkedList.txt"))){
            String data2 ;
            while((data2=br2.readLine())!=null)
            {
                if(data2.length() > max){
                    max = data2.length();
                    maxxWord = data2;
                }
            }
            System.out.println("The max longest word is :"+ maxxWord);


        }



    }
}

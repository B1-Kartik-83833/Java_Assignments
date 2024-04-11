import java.util.Scanner;


 class ExceptionLineTooLong extends Exception
 {
     ExceptionLineTooLong()
     {

     }
     ExceptionLineTooLong(String msg)
     {
         super(msg);
     }
 }

public class Question_01 {
    public static void main (String[] args){
        Scanner wd = new Scanner(System.in);
        System.out.println("PLease enter the String");
        String words;
        words = wd.next();
        try{
            if (words.length()<80)

                System.out.println("String is within Range ");
            else
                throw new ExceptionLineTooLong("String is too Long");



        }
        catch( ExceptionLineTooLong e){
            System.out.println("msg = "+e.getMessage());

        }
    }
}

import java.util.Scanner;

class Circle extends Exception {
     double myX;
     double myY;
     double myDiameter;

    public Circle() {
        myX =0;
        myY =0;
        myDiameter =100;
    }

  void  Accessor(){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Diameter");
        myDiameter = sc.nextDouble();
    }

}
public class Question_02{
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.Accessor();
        try{
            if(cr.myDiameter<0)
                throw new Circle();
            else
                System.out.printf(String.valueOf(cr.myX+"\n"));
                System.out.println(cr.myY);
                System.out.println(cr.myDiameter);
        }
        catch(Circle e){
        System.out.println("Diameter is negative");

        }
    }
}

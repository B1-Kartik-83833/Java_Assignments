import java.util.Scanner;

public class Practice_queestion4 {
    public static void main (String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter your choice");
            System.out.println(" 1 . Addition");
            System.out.println("2. Substraction");
            System.out.println("3 . multiplication");
            System.out.println("4 . Division");
            System.out.println("5 . Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("the addition of " + num1 + " and " +num2 +" is "+ (num1+num2));
                    break;
                case 2 :
                    System.out.println("the substration of " + num1 + " and " +num2 +" is "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("the multiplication of " + num1 + " and " +num2 +" is "+ (num1*num2));
                    break;
                case 4:
                    System.out.println("the Division of " + num1 + " and " +num2 +" is "+ (num1/num2));
                    break;
                default:
                    System.exit(0);

                    break;
            }
        }
    }
}

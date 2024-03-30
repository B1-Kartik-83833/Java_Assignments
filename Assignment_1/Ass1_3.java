/*3.
Display food menu to user. User will select items from menu along with the
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
prices to food items(hard code the prices) When user enters 'Generate Bill'
option , display total bill & exit.

 */

import java.util.Scanner;

public class Assignment_Q3 {

    int show_menu(){
        System.out.println("----------------Welcome to Application-------------------");
        System.out.println("Select following menu : ");
        System.out.println("    menu                                                 Price  ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1. Vadapav                                               20 RS  ");
        System.out.println("2. Misal                                                 60 RS  ");
        System.out.println("3. Pav Bhaji                                             60 RS  ");
        System.out.println("4. Plan Dosa                                             55 RS  ");
        System.out.println("5. Samosa                                                15 RS  ");
        System.out.println("6. Idli                                                  30 RS  ");
        System.out.println("7. Burger                                                80 RS  ");
        System.out.println("8. Piza                                                  300 Rs ");
        System.out.println("9. Noodle                                                120 RS ");
        System.out.println("10. Paneer Paratha                                       100 RS ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("11. for Generate Bill : ");

        System.out.println("Enter your Choice : ");
        Scanner sc1 = new Scanner(System.in);
        int ch=sc1.nextInt();
        return ch;
    }

    public static void main(String[] args) {
        Assignment_Q3 a1=new Assignment_Q3();
        int sum=0;
        int ch=0;
        Scanner sc =new Scanner(System.in);
        do {
            ch = a1.show_menu();
            if(1<=ch && ch<=11) {
                switch (ch) {
                    case 1:
                        System.out.println("Enter quantity of Vadapav : ");
                        int Q1 = sc.nextInt();
                        sum += Q1 * 20;
                        break;
                    case 2:
                        System.out.println("Enter quantity of Misal : ");
                        int Q2 = sc.nextInt();
                        sum += Q2 * 60;
                        break;
                    case 3:
                        System.out.println("Enter quantity of Pav Bhaji : ");
                        int Q3 = sc.nextInt();
                        sum += Q3 * 60;
                        break;
                    case 4:
                        System.out.println("Enter quantity of Plan Dosa : ");
                        int Q4 = sc.nextInt();
                        sum += Q4 * 55;
                        break;
                    case 5:
                        System.out.println("Enter quantity of Samosa : ");
                        int Q5 = sc.nextInt();
                        sum += Q5 * 15;
                        break;
                    case 6:
                        System.out.println("Enter quantity of Idli : ");
                        int Q6 = sc.nextInt();
                        sum += Q6 * 30;
                        break;
                    case 7:
                        System.out.println("Enter quantity of Burger : ");
                        int Q7 = sc.nextInt();
                        sum += Q7 * 80;
                        break;
                    case 8:
                        System.out.println("Enter quantity of Piza : ");
                        int Q8 = sc.nextInt();
                        sum += Q8 * 300;
                        break;
                    case 9:
                        System.out.println("Enter quantity of Noodle : ");
                        int Q9 = sc.nextInt();
                        sum += Q9 * 120;
                        break;
                    case 10:
                        System.out.println("Enter quantity of Paneer Paratha : ");
                        int Q10 = sc.nextInt();
                        sum += Q10 * 100;
                        break;
                    case 11:
                        System.out.println("Bill RS ===>  " + sum + " RS ");
                        break;
                }
            }
            else{
                System.out.println("************* Enter valid option ***************");

            }



        }while (ch!=11);


    }
}

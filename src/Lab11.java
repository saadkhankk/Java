import java.util.Scanner;

/**
 * Created by Saad 1 on 1/27/2019.
 */
public class Lab11 {

    public static void print (String x ) {
        System.out.println(x);

    }
    public static int add(int num1, int num2) {
        int res1 = num1 + num2;
        return res1;
    }

    public static void main(String args[]) {

        int type;
        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        Lab11.print("Enter any Type from '1 to 4'");
        Lab11.print("'1' for Addition \n" + "'2' for Substraction \n" + "'3' for multiply \n" + "'4' for division ");
        do {
            type = scan.nextInt();
            if (type <= 4) {
                Lab11.print("Please Enter 1st Value ");
                num1 = scan.nextInt();
                System.out.println("Please Enter 2nd Value ");
                num2 = scan.nextInt();

               switch(type) {
                case 1:
                    int res1=Lab11.add(num1, num2);
                    System.out.println("Your Result is "+ num1 + "+" + num2 +"= " + res1);

               case 2:
                    int res2 = num1 - num2;
                    System.out.println("Your Result is "+ num1 + "-" + num2 +"= " + res2);

                case 3:
                    int res3 = num1 * num2;
                    System.out.println("Your Result is "+ num1 + "*" + num2 +"= " + res3);

                   case 4:
                       int res4 = num1 / num2;
                       System.out.println("Your Result is " + num1 + "/" + num2 + "= " + res4);
                   }

            } else {
                System.out.println("Please enter any 'Type' less than and equal to 4");
            }
        }
        while (type > 4) ;
    }
}


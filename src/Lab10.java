import java.util.Scanner;

public class Lab10 {


        public static void main(String args[]) {
            int temp;
            int num;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number:");

            do {
                 num = scan.nextInt();

                if (num == 0) {
                    System.out.println("Please enter value greater than 0");
                }
            } while (num == 0);

            temp=num % 2;
            if (temp==0) {

                System.out.println("This number is even ");
            }
            else {
                System.out.println("This number is odd ");
            }
            }
        }





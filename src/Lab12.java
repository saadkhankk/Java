import java.util.Scanner;

/**
 * Created by Saad 1 on 1/27/2019.
 */
public class Lab12 {

    public static void main(String args[]) {

        Lab12.print();
        Lab12.print2("Jawad ","Khan");

    }

    public static void print() {
        System.out.println("saad");
    }

    public static void print2(String FirstName, String LastName) {
        System.out.println(FirstName+ " " + LastName);
    }

    public static int add(int num1, int num2) {
        int res1= num1+num2;
        return res1;
    }
}


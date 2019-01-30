import java.util.Scanner;

/**
 * Created by Saad 1 on 1/10/2019.
 */
public class Lab2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println ("please enter your Salary") ;

        int Salary= Integer.parseInt(input.next());
        float allowance=0.4f;
        float rent=0.2f;

        double allown=Salary*allowance;
        double house= Salary*rent;

        System.out.println("gross Salary" + "=" + (Salary+allown+house));

     /*  int KM=2;
      int meter=1000;
      double feet=3280.8399;
      double inches=39370.078;
      int cent=100000;

        System.out.println ("Distance in Meter" + "=" + (KM*meter));
        System.out.println ("Distance in Feet" + "=" + (KM*feet));
        System.out.println ("Distance in Inches" + "=" + (KM*inches));
        System.out.println ("Distance in Centimeter" + "=" + (KM*cent));  */

    /*    int Marks=500;
        int Sub1=70;
        int Sub2=76;
        int Sub3=55;
        int Sub4=65;
        int Sub5=90;

      int sub= Sub1+Sub2+Sub3+Sub4+Sub5;

        double Total=(double)sub*100/Marks;

        System.out.println ("Total Marks " + "=" + Total); */

    }



}



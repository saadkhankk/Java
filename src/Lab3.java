import java.util.Scanner;

/**
 * Created by Saad 1 on 1/10/2019.
 */
public class Lab3 {

public static void main (String [] args) {

    int Meter=1000;
    double Feet= 3.28084;
    int Inche=12;

    Scanner input= new Scanner (System.in);

    System.out.println ("Please Enter Distance in KM");
    double Distance= Double.parseDouble(input.next());

    System.out.println ("Please Enter Distance in Meter");
    double Distance2= Double.parseDouble(input.next());

    System.out.println ("Please Enter Distance in Foot");
    double Distance3= Double.parseDouble(input.next());


        System.out.println ("Distance of " + Distance + " KM"+ " = " + (Distance*Meter)+" Meters" );
        System.out.println ("Distance of "+Distance2+" Meter" + " = " + (Distance2*Feet)+" Foot");
        System.out.println ("Distance of "+Distance3 +"Foot"+ " = " + (Distance3*Inche)+" Inches");

    }


}





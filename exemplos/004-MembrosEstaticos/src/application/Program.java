package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        double c = Calculator.circumference(r);
        double v = Calculator.volume(r);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI: %.2f%n",Calculator.PI);

        sc.close();
    }
}

package application;

import entities.Triangle;
/* Programa sem orientação a objetos
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
 *
 * Enter the measure of triangle x
 * 4.0
 * 5.0
 * 3.0
 * Enter the measure of triangle y
 * 7.5
 * 4.5
 * 4.02
 * Triangle X area : 6.0000
 * Triangle Y area : 7.5638
 * Larger is Y
 * */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measure of triangle x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        System.out.printf("Triangle X area : %.4f%n", areaX);

        double areaY = y.area();
        System.out.printf("Triangle Y area : %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger is X");
        }else{
            System.out.println("Larger is Y");
        }
        sc.close();

    }
}

/* Programa sem orientação a objetos
* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
* Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
* */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        double xA, xB, xC, yA, yB, yC;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measure of triangle x");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measure of triangle y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        System.out.printf("Triangle X area : %.4f%n", areaX);

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("Triangle Y area : %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger is X");
        }else{
            System.out.println("Larger is Y");
        }
        sc.close();
    }
}

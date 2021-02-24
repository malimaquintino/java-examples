package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products to store: ");
        int n = sc.nextInt();
        Product[] vet = new Product[n];

        for (int i = 0; i < vet.length; i++){
            System.out.println("============== "+(i+1)+" ==============");
            System.out.print("Product name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            vet[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vet.length; i++){
            sum += vet[i].getPrice();
        }
        double avg = sum / vet.length;
        System.out.printf("AVG: %.2f%n", avg);
        sc.close();
    }
}
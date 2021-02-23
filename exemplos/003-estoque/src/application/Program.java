/*
* Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
  • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
  • Realizar uma entrada no estoque e mostrar novamente os dados do produto
  • Realizar uma saída no estoque e mostrar novamente os dados do produto
*
* */

package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products prod = new Products();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        prod.name = sc.nextLine();
        System.out.print("Price: ");
        prod.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        prod.quantity = sc.nextInt();
        System.out.println(prod);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        prod.addProducts(quantity);
        System.out.println(prod);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        prod.removeProducts(quantity);
        System.out.println(prod);
        sc.close();
    }
}

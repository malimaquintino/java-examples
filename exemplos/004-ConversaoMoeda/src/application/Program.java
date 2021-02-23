/*
* Faça um programa para ler a cotação do dólar, e depois o valor de dóçres a ser comprado por uma pessoa em reais.
* Informar quantos reais a pessoa vai pagar pelo dólar, considerando ainda que a pessoa vai pagar 6% de IOF sobre o valor em dollar
* */
package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars: ");
        double dollar = sc.nextDouble();

        System.out.printf("Amount to be paid: %.2f%n", CurrencyConverter.dollarConverter(dollarPrice, dollar));

        sc.close();
    }
}

package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]);
        }
        catch (InputMismatchException e){
            System.out.println("only accepted numbers");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this position not exists");
        }

        System.out.println("End of program...");

        sc.close();
    }
}

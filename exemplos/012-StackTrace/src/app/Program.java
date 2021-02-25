package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        metodo1();
        System.out.println("End of program...");


    }
    public static void metodo1(){
        System.out.println("**** Metodo1 Start ****");
        metodo2();
        System.out.println("**** Metodo1 end ****");
    }
    public static void metodo2(){
        System.out.println("**** Metodo2 Start ****");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]);
        }
        catch (InputMismatchException e){
            System.out.println("only accepted numbers");
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this position not exists");
            System.out.println(e.getMessage());
            e.printStackTrace();
            sc.next();
        }
        finally {
            System.out.println("finally runs independently if it pass or fail");
        }

        sc.close();

        System.out.println("**** Metodo2 end ****");
    }
}

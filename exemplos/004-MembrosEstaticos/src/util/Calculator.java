/*
* Metodos estaticos Utilizados em Constantes e classes utilitarias
* Um metodo statico só pode chamar metodos staticos da mesma classe
* public static final double PI = 3.14529 // declaração de constantes
* */
package util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume (double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

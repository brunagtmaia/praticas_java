package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*Construir  um  programa  que  leia  três  valores  numéricos  inteiros  (representados  pelas 
variáveis A, B e C) e apresente como resultado final o valor do quadrado da soma dos 
três valores lidos. */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("valor 1: ");
        int valor1 = entrada.nextInt();
        System.out.print("valor 2: ");
        int valor2 = entrada.nextInt();
        System.out.print("valor 3: ");
        int valor3 = entrada.nextInt();

        int resultado = ((valor1 + valor2 + valor3)* (valor1+valor2+valor3));

        System.out.print("resultado: "+ resultado );
        entrada.close();
    }
}

package lógica;

import java.util.Locale;
import java.util.Scanner;
/*Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e apresentar o 
resultado  do  quadrado  da  diferença  do  primeiro  valor  (variável  A)  em  relação  ao 
segundo valor (variável B). */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("valor 1: ");
        int valor1 = entrada.nextInt();
        System.out.print("valor 2: ");
        int valor2 = entrada.nextInt();

        int conta = ((valor1 - valor2) * (valor1 - valor2));

        System.out.print("quadrado da diferença dos dois números: " + conta);
        entrada.close();
    }
}

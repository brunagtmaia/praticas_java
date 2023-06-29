package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*Escreva um algoritmo que receba um número e verifique se ele é múltiplo de 2. Se sim, 
imprima uma mensagem que expresse essa verdade em tela. */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("valor 1: ");
        int valor1 = entrada.nextInt();

        if (valor1 % 2 == 0) {
            System.out.println(valor1 + " é par");
        } else {
            System.out.println(valor1 + " não é par");
        }

        entrada.close();
    }
}

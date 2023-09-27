package lógica;

import java.util.Locale;
import java.util.Scanner;

/*Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o
valor total economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50
centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade
respectiva é zero.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Quantidade de moedas de 1 centavo: ");
        int quantidade1 = entrada.nextInt();
        System.out.print("Quantidade de moedas de 5 centavo: ");
        int quantidade5 = entrada.nextInt();
        System.out.print("Quantidade de moedas de 10 centavo: ");
        int quantidade10 = entrada.nextInt();
        System.out.print("Quantidade de moedas de 25 centavo: ");
        int quantidade25 = entrada.nextInt();
        System.out.print("Quantidade de moedas de 50 centavo: ");
        int quantidade50 = entrada.nextInt();
        System.out.print("Quantidade de moedas de 1 real: ");
        int quantidade1real = entrada.nextInt();

        Double quantidade1Total = (quantidade1 * 0.01);
        Double quantidade5Total = (quantidade5 * 0.05);
        Double quantidade10Total = (quantidade10 * 0.10);
        Double quantidade25Total = (quantidade25 * 0.25);
        Double quantidade50Total = (quantidade50 * 0.50);
        Double quantidade1RealTotal = (quantidade1real * 1.0);

        Double total = (quantidade1Total + quantidade5Total + quantidade10Total + quantidade25Total + quantidade50Total + quantidade1RealTotal);

        System.out.print("Você tem: R$" + total);

        entrada.close();
    }
}

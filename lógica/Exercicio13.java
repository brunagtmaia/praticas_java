package lógica;

import java.util.Locale;
import java.util.Scanner;
/*Elaborar um programa que apresente o valor da conversão em real (R$) de um valor lido 
em dólar (US$). O programa deve solicitar o valor da cotação do dólar */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("contação do dolar: ");
        Double dolarCotacao = entrada.nextDouble();
        System.out.print("Valor em US$: ");
        Double dolarValor = entrada.nextDouble();

        Double real = (dolarValor * dolarCotacao);
        System.out.print(real + " em reais");
        entrada.close();
    }
}

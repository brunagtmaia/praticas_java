package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;

/*Escreva um algoritmo que recebe um horário (horas, minutos, segundos) e determine
quantos segundos já se passaram desde que o dia começou */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("horas (formato 24hrs)");
        int horas = entrada.nextInt();
        System.out.print("Minutos");
        int minutos = entrada.nextInt();
        System.out.print("Segundos");
        int segundos = entrada.nextInt();


        int horasminutos = (horas *60);
        int minutosSegundos = ((horasminutos + minutos) * 60);
        int segundosTotais = (minutosSegundos + segundos);

        System.out.print("Dês do começo do dia se passaram: " + segundosTotais + " segundos");
        entrada.close();
    }
}

package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*Escreva um algoritmo que recebe um horário (horas, minutos, segundos) e determine
quantos segundos ainda faltam até o dia terminar. */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("horas (formato 24hrs)");
        int horas = entrada.nextInt();
        System.out.print("Minutos");
        int minutos = entrada.nextInt();
        System.out.print("Segundos");
        int segundos = entrada.nextInt();
        entrada.close();

        int horasminutos = (horas *60);
        int minutosSegundos = ((horasminutos + minutos) * 60);
        int segundosTotais = (minutosSegundos + segundos);


        int horasDia = (24*60);
        int segundosDia = (horasDia *60);
        int total = (segundosDia - segundosTotais);

        System.out.print(total);

    }
}

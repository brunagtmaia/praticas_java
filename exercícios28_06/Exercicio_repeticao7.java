package exercícios28_06;
/*Leia a idade de 20 pessoas e exiba a soma das idades. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        int idadeSoma = 0;
        for( int i = 1; i<=20; i++){
            System.out.print("pessoa " + i + ": ");
            int idade = entrada.nextInt();
            idadeSoma = idade + idadeSoma;
        }
        int idadeMedia = idadeSoma / 20;
        System.out.print("Média:" + idadeMedia );
        entrada.close();
    }
}
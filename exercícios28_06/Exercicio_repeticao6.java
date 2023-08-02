package exercícios28_06;
/*Leia a idade de 20 pessoas e exiba a soma das idades. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        // System.out.print("pessoa 1:");
        // int n1 = entrada.nextInt();
        // System.out.print("pessoa 2:");
        // int n2 = entrada.nextInt();
        // System.out.print("pessoa 3:");
        // int n3 = entrada.nextInt();
        // System.out.print("pessoa 4:");
        // int n4 = entrada.nextInt();
        // System.out.print("pessoa 5:");
        // int n5 = entrada.nextInt();
        // System.out.print("pessoa 6:");
        // int n6 = entrada.nextInt();
        // System.out.print("pessoa 7:");
        // int n7 = entrada.nextInt();
        // System.out.print("pessoa 8:");
        // int n8 = entrada.nextInt();
        // System.out.print("pessoa 9:");
        // int n9 = entrada.nextInt();
        // System.out.print("pessoa 10:");
        // int n10 = entrada.nextInt();
        // System.out.print("pessoa 11:");
        // int n11 = entrada.nextInt();
        // System.out.print("pessoa 12:");
        // int n12 = entrada.nextInt();
        // System.out.print("pessoa 13:");
        // int n13 = entrada.nextInt();
        // System.out.print("pessoa 14:");
        // int n14 = entrada.nextInt();
        // System.out.print("pessoa 15:");
        // int n15 = entrada.nextInt();
        // System.out.print("pessoa 16:");
        // int n16 = entrada.nextInt();
        // System.out.print("pessoa 17:");
        // int n17 = entrada.nextInt();
        // System.out.print("pessoa 18:");
        // int n18 = entrada.nextInt();
        // System.out.print("pessoa 19:");
        // int n19 = entrada.nextInt();
        // System.out.print("pessoa 20:");
        // int n20 = entrada.nextInt();
        int idadeSoma = 0;
        for( int i = 1; i<=20; i++){
            System.out.print("pessoa " + i + ": ");
            int idade = entrada.nextInt();
            idadeSoma = idade + idadeSoma;
        }
        System.out.print("soma das idades: " + idadeSoma );
        entrada.close();
    }
}
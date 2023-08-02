package exercícios28_06;
/*Escreva  um  algoritmo  que  leia  10  números  do  usuário  e  calcule  a  soma  desses 
números. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));
        
        System.out.print("Escreva 10 números inteiros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        int n6 = entrada.nextInt();
        int n7 = entrada.nextInt();
        int n8 = entrada.nextInt();
        int n9 = entrada.nextInt();
        int n10 = entrada.nextInt();

        System.out.println((n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10));

        entrada.close();
    }
}
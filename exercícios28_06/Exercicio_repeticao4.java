package exercícios28_06;
/*4)  Leia o nome um número do usuário um número N  e  escreva o nome dele na tela N 
vezes*/
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        
        System.out.print("Escreva o seu nome:");
        String nome = entrada.nextLine();
        System.out.print("Escreva um número");
        int n = entrada.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println(i + " . " + nome);
        }
        entrada.close();
    }
}
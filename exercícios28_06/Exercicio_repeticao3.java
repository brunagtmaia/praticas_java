package exercícios28_06;
//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Escreva o seu nome:");
        String nome = entrada.nextLine();

        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " . " + nome);
        }
        entrada.close();
    }
}
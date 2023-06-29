package exercícios28_06;
import java.util.Scanner;
import java.util.Locale;

// Calcule a área de um círculo que possui um raio R, informado pelo usuário. (pi=3.14) area = pi * raio 
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner raio = new Scanner(System.in);
        raio.useLocale(new Locale("en", "US"));


        System.out.print("Escreva o raio do circulo: ");
        Double raioValor = raio.nextDouble();

        Double area = (raioValor * 3.14);

        System.out.print("A área da circunferencia é: " + area);
        raio.close();
    }
}

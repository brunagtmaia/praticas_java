package exercícios28_06;
/* Faça um algoritmo que receba três números inteiros e mostre o maior deles. Considere que 
os números sempre serão diferentes. */
import java.util.Locale;
import java.util.Scanner;

public class descisao3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        
        System.out.print("Número 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Número 2: ");
        int n2 = entrada.nextInt();
        System.out.print("Número 3: ");
        int n3 = entrada.nextInt();

        if (n1 > n2){
            if (n1>n3){
                System.out.print(n1 + " é maior");
            }else{
                System.out.print(n3 + " é maior");
            }
        }else{
            if (n2>n3){
                System.out.print(n2 + " é maior ");
            }else{
                System.out.print(n3 + " é maior");
            }
        }
        entrada.close();
    }
}

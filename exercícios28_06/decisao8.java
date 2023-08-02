package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*6. Construa um algoritmo que leia o código de um determinado produto e mostre a sua 
classificação. Utilize a estrutura se...então...senão */
public class decisao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Digite um número: ");
        int n1 = entrada.nextInt();

        if (n1 % 2 == 0){
            System.out.print("É um número par");
        }else{
            System.out.print("É um número impar");
        }
        
        entrada.close();
    }
    
}

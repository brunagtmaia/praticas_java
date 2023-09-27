package decisão;

import java.util.Locale;
import java.util.Scanner;
/*6. Construa um algoritmo que leia o código de um determinado produto e mostre a sua 
classificação. Utilize a estrutura se...então...senão */
public class decisao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Digite o código do produto: ");
        int n1 = entrada.nextInt();

        if(n1 == 1){
            System.out.print("Alimento não perecível");
        }else if (n1 == 2 || n1 == 3 || n1 == 4){
            System.out.print("Alimento perecível");
        }else if(n1 == 5 || n1 == 6){
            System.out.print("Vestuário");
        }else if(n1 == 7){
            System.out.print("Higiene Pessoal");

        }else{
            System.out.print("Utencílios domenticos");
        }
        entrada.close();
    }
    
}

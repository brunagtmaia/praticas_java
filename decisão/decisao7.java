package decisão;

import java.util.Locale;
import java.util.Scanner;
/*6. Construa um algoritmo que leia o código de um determinado produto e mostre a sua 
classificação. Utilize a estrutura se...então...senão */
public class decisao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Digite o código do produto: ");
        int n1 = entrada.nextInt();

        switch(n1){
            case 1:
                System.out.print("Alimento não perecível");
            break;
            case 2:
                System.out.print("Alimento perecível");
            case 3: 
                System.out.print("Alimento perecível");
            break;
            case 4 : 
                System.out.print("Alimento perecível");
            break;
            case 5: 
                System.out.print("Vestuário");
            break;
            case 6:
                System.out.print("Vestuário");
            break;
            case 7:
                System.out.print("Higiene Pessoal");
            break;
            case 8:
                System.out.print("Utencílios domenticos");
            break;
            case 9:
                System.out.print("Utencílios domenticos");
            break;
            case 10: 
                System.out.print("Utencílios domenticos");
            break;
            
        }
        entrada.close();
    }
    
}

package decisão;

import java.util.Locale;
import java.util.Scanner;

public class decisao17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Nota 1: ");
        int n = entrada.nextInt();
        System.out.print("Nota 2: ");
        int n2 = entrada.nextInt();
        
        int n1 = ((n+n2)/2);
        
        if (n1 == 10){
            System.out.print("Aprovado com distinção");
        }else if(n1 >= 7){
            System.out.print("Aprovado");
        }else if(n1 >= 3 && n1 < 7){
            System.out.print("Exame");
        }else if(n1 < 3){
            System.out.print("Reprovado");
        }
        entrada.close();
    }
    
}

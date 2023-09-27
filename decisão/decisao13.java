package decisão;

import java.util.Locale;
import java.util.Scanner;

public class decisao13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("hora de entrada:");
        int n1 = entrada.nextInt();
        System.out.print("minuto de entrada:");
        int n2 = entrada.nextInt();
        System.out.print("Hora de saída:");
        int n3 = entrada.nextInt();
        System.out.print("minuto de saída:");
        int n4 = entrada.nextInt();
        
        
        int horas = n3 - n1;
        
        if (horas == 1){
            System.out.print("R$4,00");
        }else if(horas == 2){
            System.out.print("R$6,00");
        }else if( horas > 2){
            System.out.print("R$" + (horas+6));
        }

        entrada.close();
    }
    
}

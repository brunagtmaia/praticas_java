package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;

public class decisao9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Total vendido:");
        Double n1 = entrada.nextDouble();
        
        if (n1 >= 2000){
            Double comissao = ((n1*10)/100)+1200;
            System.out.print("salário + comissão: R$"+ comissao);
        }
        entrada.close();
    }
    
}

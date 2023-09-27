package lógica;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner chops = new Scanner(System.in);
        chops.useLocale(new Locale("en", "US"));

        System.out.println("Quantidade de Chopps pequenos:");
        int chopsPequenos = chops.nextInt();

        System.out.println("Quantidade de Chopps médios:");
        int chopsMedios = chops.nextInt();

        System.out.println("Quantidade de Chopps grandes:");
        int chopsGrandes = chops.nextInt();

        //contas
        Double totalChopsPequenos = (chopsPequenos * 12.0);
        Double totalChopsMedios = (chopsMedios * 15.0);
        Double totalChopsGrandes = (chopsGrandes * 18.0);

        Double valorTotal = (totalChopsPequenos + totalChopsMedios + totalChopsGrandes);
        
        //imprimindo valor
        System.out.println("Valor total a ser pago: R$" + valorTotal);

        chops.close();
    }
}

package decisão;

import java.util.Locale;
import java.util.Scanner;

public class decisao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Tipo de carro (G - gasolina ou A - alcool):");
        String n1 = entrada.next();
        System.out.print("Capacidade do tanque em litros: ");
        int n2 = entrada.nextInt();
        
        //para conparar string usar n1.equals("G") ao invéz de ==
        if(n1.equals("G")){
           Double gastoG = 1.80 * n2;
           System.out.print("Você gastará: R$"+ gastoG);
        }else if (n1.equals("A")){
            Double gastoA = 1.00 * n2;
           System.out.print("Você gastará: R$"+ gastoA);
        }
        entrada.close();
    }
    
}

package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;

public class decisao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Altura:");
        Double n1 = entrada.nextDouble();
        System.out.print("sexo (h ou f):");
        String n2 = entrada.next();
        
        if(n2=="h"){
            Double pesoIdeal = (72.7 * n1)-58;
            System.out.print("Peso ideal para homens: "+ pesoIdeal);
        }else{
            Double pesoIdeal = (62.1 * n1)-44.7;
            System.out.print("Peso ideal para melheres: "+ pesoIdeal);
        }
        entrada.close();
    }
    
}

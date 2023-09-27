package decisão;

import java.util.Locale;
import java.util.Scanner;

public class decisao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("idade:");
        int n1 = entrada.nextInt();
        
        if(n1<=10){
            System.out.print("R$30,00");
        }else if(n1>=10 && n1<29){
            System.out.print("R$60,00");
        }else if(n1>=29 && n1<45){
            System.out.print("R$120,00");
        }else if(n1 >=45 && n1<59){
            System.out.print("R$150,00");
        }else if(n1 >= 59){
            System.out.print("R$300,00");
        }
        entrada.close();
    }
    
}

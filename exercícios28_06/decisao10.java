package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;

public class decisao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("valor do 1º:");
        int n1 = entrada.nextInt();
        System.out.print("valor do 2º:");
        int n2 = entrada.nextInt();
        System.out.print("valor do 3º:");
        int n3 = entrada.nextInt();
        
        if(n1==n2){
            if(n2==n3){
                System.out.print("trangulo equilátero");
            }else{
                System.out.print("Triango isóceles");
            }
        }else{
            System.out.print("Triangulo escaleno");
        }
        
        entrada.close();
    }
    
}

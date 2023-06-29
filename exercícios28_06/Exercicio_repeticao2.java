package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));
            int i=1, soma=0;
            while (i<16){
                soma = soma + i;
                System.out.print(soma + " + ");

                i++;
            }
        entrada.close();
    }
}

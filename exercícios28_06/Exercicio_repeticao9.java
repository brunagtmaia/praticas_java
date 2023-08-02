package exercícios28_06;
/*Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_repeticao9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        int contMaior=0, contMenor = 0;
        for( int i = 1; i<=5; i++){
            System.out.print("pessoa " + i + ": ");
            int idade = entrada.nextInt();
            if(idade >= 18){
                contMaior = contMaior +1;
            }else{
                contMenor = contMenor +1;
            }
        }
        
        System.out.print("Maiores de idade:" + contMaior);
        System.out.print("Menores de idade:" + contMenor);

        
        entrada.close();
    }
}
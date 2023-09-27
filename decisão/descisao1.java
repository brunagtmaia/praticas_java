package decisão;

import java.util.Locale;
import java.util.Scanner;

/*Faça um algoritmo para calcular a média final da disciplina de Programação, mostrar essa 
média final e também uma mensagem informando se o aluno foi aprovado (média >= 7) ou 
reprovado. Considere duas avaliações */
public class descisao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        
        System.out.print("Escreva sua primeira nota:");
        int n1 = entrada.nextInt();
        System.out.print("Escreva sua segunda nota:");
        int n2 = entrada.nextInt();

        int notasSoma = n1 + n2;
        int notasMedia = notasSoma/2;

        if (notasMedia <= 7){
            System.out.print("Aluno reprovado");
        }else{
            System.out.print("Aluno aprovado");
        }
        entrada.close();
    }
}

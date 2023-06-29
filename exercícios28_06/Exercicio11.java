package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/* Crie um algoritmo que receba a idade de uma pessoa na entrada de uma festa, caso a 
idade for inferior a 18 anos, peça ao algoritmo para imprimir uma frase que expresse a 
impossibilidade da pessoa em participar da festa. Caso a pessoa tenha maioridade peça 
ao algoritmo para imprimir uma frase que expresse o contrário. */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        if(idade < 18){
            System.out.print("Entrada proibida");
        }else{
            System.out.print("Entrada permitida");
        }
        entrada.close();
    }
}

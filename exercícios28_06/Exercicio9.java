package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*Escreva um algoritmo que receba o número de vitórias, empates de derrotas de um time
em um campeonato de futebol em um total 10 partidas. Cada vitória o time ganha 3
pontos, empate 1 ponto. No final se o time tiver uma pontuação maior ou igual a 18
pontos imprima: “O TIME FEZ UMA BOA CAMPANHA”, caso contrário imprima: “O TIME
DEIXOU A DESEJAR”.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Vitórias: ");
        int vitorias = entrada.nextInt();
        System.out.print("Empates: ");
        int empates = entrada.nextInt();
        System.out.print("Derrotas: ");
        int derrotas = entrada.nextInt();
        int totalJogos = (vitorias + empates + derrotas);
        
        while (totalJogos > 10) {
            System.out.println("O número total de jogos não pode ser maior que 10.");
            System.out.print("Vitórias: ");
            vitorias = entrada.nextInt();
            System.out.print("Empates: ");
            empates = entrada.nextInt();
            System.out.print("Derrotas: ");
            derrotas = entrada.nextInt();
            totalJogos = (vitorias + empates + derrotas);
        }

        int vitoriaPontos = (vitorias *3);
        int empatePontos = (empates *1);
        int derrotasPontos = (derrotas *3);
        int pontuacao = (vitoriaPontos+ empatePontos +derrotasPontos);
        if (pontuacao >= 18 ){
            System.out.print("O TIME FEZ UMA BOA CAMPANHA");
        }else{
            System.out.print("O TIME DEIXOU A DESEJAR");
        }
        entrada.close();
    }
}

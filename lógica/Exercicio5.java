package lógica;

import java.util.Locale;
import java.util.Scanner;
/*Em uma lanchonete o tipo de sanduíche mais pedido, inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de
queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas,
faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a
máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários
para compra. */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Quantos sanduíches você quer fazer? ");
        int quantidadeSanduiche = entrada.nextInt();
        
        Double quantidadeQueijo = ((quantidadeSanduiche * 0.050)*2);
        Double quantidadePresunto = (quantidadeSanduiche * 0.050);
        Double quantidadeHamburguer = (quantidadeSanduiche * 0.100);

        System.out.print("Para fazer " + quantidadeSanduiche + "sanduíches" + "você vai precisar de: " + quantidadeQueijo + "KG de queijo " + quantidadePresunto + "KG de presunto " + quantidadeHamburguer + "KG de Hamburguer");
        
        entrada.close();
    }
}

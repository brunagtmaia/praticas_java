package exercícios28_06;

import java.util.Locale;
import java.util.Scanner;
/*A padaria Minas Gerais vende uma certa quantidade de pães franceses e uma
quantidade de pães de queijo a cada dia. Cada pãozinho custa R$ 0,20 e o pão de queijo
custa R$ 2,80. Ao final do dia, o dono quer saber 

quanto arrecadou com a venda dos pães e pães de queijo (juntos), e quanto deve guardar em um investimento (10% do
total arrecadado). 

Você foi contratado para fazer os cálculos para o dono. Com base
nestes fatos, faça um algoritmo para ler as quantidades de pães e de pães de queijo, e
depois calcular os dados solicitados.*/

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Digite a quantidade de pães vendidos: ");
        int quantidadePaes = entrada.nextInt();

        System.out.print("Digite a quantidade de pães de queijo vendidos: ");
        int quantidadeQueijo = entrada.nextInt();

        //contas 
        Double valorPaes = (quantidadePaes * 0.2);
        Double valorQueijo = (quantidadeQueijo * 2.80);
        Double valorTotal = (valorPaes + valorQueijo);
        Double investir = ((valorTotal / 100) * 10);

        //informando
        System.out.print("Ao todo você vendeu: R$" + valorTotal+ " e para investir 10% você deve guardar: R$" + investir);

        entrada.close();
    }
}

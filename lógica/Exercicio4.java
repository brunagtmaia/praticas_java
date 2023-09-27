package lógica;

import java.util.Locale;
import java.util.Scanner;


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

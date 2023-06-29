package exercícios28_06;
import java.util.Scanner;
import java.util.Locale;
/*Uma cervejaria vende três tamanhos de chopp, 300ml, 500ml e 800ml, cada um sendo
vendido respectivamente por R$ 12, R$ 15 e R$18. Construa um algoritmo em que o
atendente lance na comanda a quantidade de chopps pequenos, médios e grandes
consumidos pelo cliente, imprimindo o valor a ser pago no final.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        // entrada: quantidade de chops pequenos 
        // saida valor a pagar 
        Scanner chops = new Scanner(System.in);
        chops.useLocale(new Locale("en", "US"));

        System.out.println("Quantidade de Chopps pequenos:");
        int chopsPequenos = chops.nextInt();

        System.out.println("Quantidade de Chopps médios:");
        int chopsMedios = chops.nextInt();

        System.out.println("Quantidade de Chopps grandes:");
        int chopsGrandes = chops.nextInt();

        //contas
        Double totalChopsPequenos = (chopsPequenos * 12.0);
        Double totalChopsMedios = (chopsMedios * 15.0);
        Double totalChopsGrandes = (chopsGrandes * 18.0);

        Double valorTotal = (totalChopsPequenos + totalChopsMedios + totalChopsGrandes);
        
        //imprimindo valor
        System.out.println("Valor total a ser pago: R$" + valorTotal);
        chops.close();
    }
}

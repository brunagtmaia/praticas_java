package exercícios28_06;
import java.util.Scanner;
import java.util.Locale;
/*Um restaurante de comida à quilo cobra R$32,50 por cada 
quilo de refeição. Escreva umalgoritmo que leia o peso do 
prato montado pelo cliente (em quilos) e imprima o valor
a pagar. Assuma que a balança já desconte o peso do prato.*/
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner pesoRefeicao = new Scanner(System.in); //fonte: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        pesoRefeicao.useLocale(Locale.US);
        Locale.setDefault(new Locale("en", "US"));

        System.out.println("Escreva o peso do prato em KG: ");
        Double pesoKg = pesoRefeicao.nextDouble();
        
        Double valor = (pesoKg * 32.50);
   
        System.out.println(pesoKg + "*" + 32.50 + "="  + valor);

        pesoRefeicao.close();//fechando leitura de valores 
    }
}

package exercícios28_06;
import java.util.Locale;
import java.util.Scanner;
/*4. A empresa XKW concedeu um bônus de 20% do valor do salário a todos os funcionários com 
tempo de trabalho na empresa igual ou superior a 5 anos e de 10% aos demais. Faça um 
algoritmo que receba o salário e o tempo de serviço de um funcionário, calcule e mostre o valor 
do bônus recebido por ele. */
public class decisao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Escreva o salário: ");
        Double n1 = entrada.nextDouble();
        System.out.print("Tempo de serviço(anos): ");
        int n2 = entrada.nextInt();

        if (n2>= 5){
            Double aumento = ((n1*20)/100) + n1;
            System.out.print("o salário do funcionário subiu para: " + aumento);
        }else{
            Double aumento1 = ((n1*10)/100) + n1;
            System.out.print("o salário do funcionário subiu para: " + aumento1);
        }
        entrada.close();
    }
}

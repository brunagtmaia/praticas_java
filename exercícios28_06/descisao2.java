package exercícios28_06;
/* Faça um algoritmo que receba a idade do usuário e verifique se ele tem 18 anos ou mais. Se a 
resposta for positiva escrever “maior de idade”, senão “menor de idade”. */
import java.util.Locale;
import java.util.Scanner;

public class descisao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        
        System.out.print("Escreva sua idade: ");
        int n1 = entrada.nextInt();

        if (n1 >= 18){
            System.out.print("Maior de idade");
        }else{
            System.out.print("Menos de idade");
        }
        entrada.close();
    }
}

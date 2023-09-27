package decisão;

import java.util.Locale;
import java.util.Scanner;

/*5.  Implemente  um  código  para  aprovar  empréstimo  bancário.  O  código  deve  pedir  3 
informações: valor do empréstimo, número de parcelas e salário do solicitante. Aprovar 
empréstimo caso o valor das parcelas representem no máximo 30% do salário do solicitante.*/
public class descisao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));


        System.out.print("Valor do empréstimo: ");
        Double n1 = entrada.nextDouble();
        System.out.print("Número de parcelas: ");
        int n2 = entrada.nextInt();
        System.out.print("Escreva o salário: ");
        Double n3 = entrada.nextDouble();

        Double salario30 = ((n3*30)/100);

        Double valorParcelas = n1 / n2;

        // System.out.println(salario30);
        // System.out.print(valorParcelas);

        if (valorParcelas <= salario30){
            System.out.print("Empréstimo aporvado ;)");
        }else{
            System.out.print("Empréstimo não aprovado");
        }
        entrada.close();
    }
}

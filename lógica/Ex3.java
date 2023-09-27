package lógica;
import java.util.Scanner; //importanto scanner
import java.util.Locale; //inportando Locale ele serve para configurar o locale para recolhecer número descimais 

public class Ex3 {
    public static void main(String[] args){
        Scanner raio = new Scanner(System.in);
        raio.useLocale(new Locale("en", "US"));


        System.out.print("Escreva o raio do circulo: ");
        Double raioValor = raio.nextDouble();

        Double area = (raioValor * 3.14);

        System.out.print("A área da circunferencia é: " + area);
        raio.close();
    }
}

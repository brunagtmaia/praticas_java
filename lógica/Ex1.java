package lógica;
import java.util.Scanner;
import java.util.Locale; 

public class Ex1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para a entrada de dados do usuário
        Scanner pesoRefeicao = new Scanner(System.in); 

        // Define o uso do formato de localização dos EUA para entrada de números decimais
        pesoRefeicao.useLocale(Locale.US);

        // Define o formato de localização padrão como en_US (Inglês dos EUA)
        Locale.setDefault(new Locale("en", "US"));

        // Solicita ao usuário que insira o peso do prato em quilogramas
        System.out.println("Escreva o peso do prato em KG: ");

        // Lê o valor digitado pelo usuário e armazena em uma variável Double chamada pesoKg
        Double pesoKg = pesoRefeicao.nextDouble();

        // Calcula o valor da refeição multiplicando o peso do prato pelo preço por quilograma (32.50)
        Double valor = (pesoKg * 32.50);

        // Exibe o resultado do cálculo na tela
        System.out.println(pesoKg + "*" + 32.50 + "="  + valor);

        // Fecha o objeto Scanner para liberar os recursos de entrada de dados
        pesoRefeicao.close();//fechando leitura de valores 
    }
}

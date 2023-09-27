package lógica;

import java.util.Locale;
import java.util.Scanner;
/*O  proprietário  da  empresa  ABC  LTDA  precisa  de  um  programa  de  computador  para 
calcular  o  novo  salário  que  seus  funcionários  irão  receber  a  partir  do  mês  que  vem. 
Sabendo  que  o  aumento  de  salário  para  todos  os  funcionários  será  de  25%,  faça  um 
programa  que  lê  o  valor  do  salário  atual  do  funcionário  e  informa  o  seu  novo  salário 
acrescido de 25%. */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("en", "US"));

        System.out.print("Escreva o valor do salário atual: ");
        Double salarioAtual = entrada.nextDouble();

        Double almento = ((salarioAtual/100) * 25);
        Double salarioAlmentado = (salarioAtual+almento);
        System.out.print("O salário almentado vai ser de: R$"+ salarioAlmentado);
        entrada.close();
    }
}

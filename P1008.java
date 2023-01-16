import java.util.Scanner;
import java.util.Locale;

public class P1008 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        Locale.setDefault((new Locale("en", "US")));
        input.useLocale(Locale.US);
        
        int NUMBER = input.nextInt();
        int horat = input.nextInt();
        double valorhora = input.nextDouble();
        double SALARY = horat * valorhora;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
        input.close();
     }
}

/*
 
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. 
No caso do salário, também deve haver um espaço em branco após o $.

 */
import java.util.Scanner;
import java.util.Locale;

public class P1011 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.US);
        Locale.setDefault(new Locale("en", "US"));
        
        double R = input.nextDouble();
        double pi = 3.14159;
        double VOLUME = (4.0/3.0) * pi * Math.pow(R,3); 
        System.out.printf("VOLUME = %.3f%n", VOLUME);
        input.close();
}

}

/*
 
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.

Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

Saída
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.

 */
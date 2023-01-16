import java.util.Scanner;
import java.util.Locale;

public class P1012 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.US);
        Locale.setDefault(new Locale("en", "US"));
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double pi = 3.14159;
        
        double TRIANGULO = A * C / 2;
        double CIRCULO = pi * Math.pow(C,2) ;
        double TRAPEZIO = ((A+B)*C)/2 ;
        double QUADRADO = B * B;
        double RETANGULO = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
        input.close();
        
    }
}

/*
 
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. 
Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

 */

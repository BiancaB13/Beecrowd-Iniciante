import java.util.Scanner;
import java.util.Locale;

public class P1015 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.US);
        Locale.setDefault(new Locale("en","US"));
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double distanciaXY = Math.sqrt (Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.4f%n", distanciaXY);
        input.close();
 
    }
 
}

/*
 
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = Math.sqrt (Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
raiz quadrada

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

 */
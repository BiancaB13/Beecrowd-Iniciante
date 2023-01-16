import java.util.Scanner;
import java.util.Locale;

public class P1004 {

    public static void main(String[] args) { 
         
        
        
        Scanner input = new Scanner(System.in);
        //Locale.setDefault(Locale.US);
        input.useLocale(Locale.US); //como o sistema está em português, aqui usamos a ",", porém nos EUA eles usam "." para valores decimais        
        Locale.setDefault(new Locale("en", "US"));

        
        double raio = input.nextDouble();
        double n = 3.14159;
        double area = n * Math.pow(raio,2);
        System.out.printf("A=%.4f/n", area);
        //a barra é invertida
        input.close();

    }
}

/*

Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

 */
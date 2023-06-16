import java.util.Scanner;
import java.util.Locale;

public class P1021 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in); 
        Locale.setDefault(new Locale ("en","US"));
        input.useLocale(Locale.US);
        
        double valorUsuario = input.nextDouble();
        int valor = 0 ;
        
     //era esse a diferença entre double e float? **Aplicativo onde usar um deles causava uma exceção 
        System.out.println("NOTAS:"); //um presentation error porque deixei (NOTAS: )com espaço
        //100
        //esse (int) é para conseguir manipular números int e double. Nesse caso, para dividir double (valorUsuario) por int (/100)
        valor = (int) valorUsuario / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", valor);
        //esse %d é para apresentar na tela apenas ou valor inteiro de uma variável double
        valorUsuario = valorUsuario % 100.0;
        //50
        valor = (int) valorUsuario / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", valor);
        valorUsuario = valorUsuario % 50.0;
        //20
        valor = (int) valorUsuario / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        valorUsuario = valorUsuario % 20.0;
        //10
        valor = (int) valorUsuario / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        valorUsuario = valorUsuario % 10.0;
        //5
        valor = (int) valorUsuario / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        valorUsuario = valorUsuario % 5.0;
        //2
        valor = (int) valorUsuario / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        valorUsuario = valorUsuario % 2.0;
        
        valorUsuario = valorUsuario * 100.0;
        //multiplicar o valor do usuario por 100 para ficar mais fácil de trabalhar. Ao inves de lidar com numero fracionados, se usa numeros inteiros
        //se trabalha com números inteiros em moedas de forma igual as notas 
        
        System.out.println("MOEDAS:");
        //100
        valor = (int) valorUsuario / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        valorUsuario = valorUsuario % 100.0;
        //50
        valor = (int) valorUsuario / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        valorUsuario = valorUsuario % 50.0;
        //20
        valor = (int) valorUsuario / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        valorUsuario = valorUsuario % 25.0;
        //10
        valor = (int) valorUsuario / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        valorUsuario = valorUsuario % 10.0;
        //5
        valor = (int) valorUsuario / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        valorUsuario = valorUsuario % 5.0;
        //2
        valor = (int) valorUsuario / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
        //valorUsuario = valorUsuario % 1.0;
        
        input.close();
    }
 
}

import java.util.Scanner;
import java.util.Locale;

public class P1037 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        Locale.setDefault(new Locale("en","US"));
        input.useLocale(Locale.US);
        
        double valor = input.nextDouble();
        
        if(valor<0 || valor>100)
        {
            System.out.println("Fora de intervalo");
        }
        if(valor>=0 && valor<=25)
        {
            System.out.println("Intervalo [0,25]");
        }
        if(valor>25 && valor<=50)
        {
            System.out.println("Intervalo (25,50]");
        }
        if(valor>50 && valor<=75)
        {
            System.out.println("Intervalo (50,75]");
        }
        if(valor>75 && valor<=100)
        {
            System.out.println("Intervalo (75,100]");
        }
        input.close();
 
    }
 
}


/* 
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
*/
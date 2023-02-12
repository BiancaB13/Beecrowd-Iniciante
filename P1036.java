//Duas formas diferentes de fazer
//1.tentativa:

import java.util.Scanner;
import java.util.Locale;

public class P1036 {
 
    public static void main(String[] args) {
 
         Scanner input = new Scanner (System.in);
         Locale.setDefault(new Locale ("en","US"));
         input.useLocale(Locale.US);
         
         double A = input.nextDouble();
         double B = input.nextDouble();
         double C = input.nextDouble();
         
         double delta = Math.pow(B,2) - 4 * A * C;
         double R1 = (-B + Math.sqrt(delta)) / (2 * A);
         double R2 = (-B - Math.sqrt(delta)) / (2 * A);
         
         if(A == 0 | delta < 0){
             System.out.println("Impossivel calcular");//tinha faltado apenas trocar o printf por println
             //caso haja uma divisão por 0 ou raiz de numero negativo
         }
         else {

             System.out.printf("R1 = %.5f%n", R1);
             System.out.printf("R2 = %.5f%n", R2);
         }
         input.close();
 
    }
 
}

/* 
2.tentativa: 

import java.util.Scanner;
import java.util.Locale;

public class P1036 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
         Locale.setDefault(new Locale ("en","US"));
         input.useLocale(Locale.US);
         
         double A = input.nextDouble();
         double B = input.nextDouble();
         double C = input.nextDouble();
         
         if((A == 0) | (B * B - 4 * A * C < 0)){
             System.out.println("Impossivel calcular");
             //caso haja uma divisão por 0 ou raiz de numero negativo
         }
         else {
             double delta = Math.sqrt((B * B) - 4 * A * C); //tirou a raiz com o Math.sqrt()
//fiquei em duvida em relação a formula de bhaskara, que estava sem a raiz quadrada. Acredito que o autor do programa tenha tirado a raiz direto no delta
             double R1 = (-B + delta) / (2 * A);
             double R2 = (-B - delta) / (2 * A);
             System.out.printf("R1 = %.5f%n", R1);
             System.out.printf("R2 = %.5f%n", R2);
         }
*/
//esse eu precisei ver um vídeo para entender a questão matemática das coordenadas 


import java.util.Scanner;
import java.util.Locale;

public class P1041 {
 
    public static void main(String[] args) {
 
         Scanner input = new Scanner (System.in);
         Locale.setDefault(new Locale ("en","US"));
         input.useLocale(Locale.US);
         
         float x = input.nextFloat();
         float y = input.nextFloat();
//com medo do double...
         
         
         if(x==0 && y==0)
         {
             System.out.println("Origem");
         }//se x e y estiverem no mesmo ponto, ou seja, no meio, estarão na origem (0)
         else if(x!=0 && y==0)
         {
             System.out.println("Eixo X");
         }
         else if(x==0 && y!=0)
         {
             System.out.println("Eixo Y");
         }
         else if(x>0 && y>0)
         {
             System.out.println("Q1");
         }
         else if(x<0 && y>0)
         {
             System.out.println("Q2");
         }
         else if(x<0 && y<0)
         {
             System.out.println("Q3");
         }
         else
         {
             System.out.println("Q4");
         }
         input.close();
 
    }
}

/* 
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
*/

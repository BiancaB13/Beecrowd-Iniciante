/* acertei de primeira 
porém, primeiro eu pensei em fazer assim:
{
    double c1 = 4.00;
    ...
    if(codigo = c1)
    daria erro porque o usuário entra com um número inteiro, não uma String, além de o programa ficar maior
}
*/

import java.util.Scanner;
import java.util.Locale;

public class P1038 {

 public static void main(String[] args) {

     Scanner input = new Scanner (System.in);
     Locale.setDefault(new Locale("en","US"));
     input.useLocale(Locale.US);
     
     int codigo = input.nextInt();
     int quantidade = input.nextInt();
     
     //deu um nó na minha cabeça por causa do == . No C (tinkercard) ele é usado de uma forma diferente
     if (codigo == 1)
     {
         double t1 = 4.00 * quantidade;
         System.out.printf("Total: R$ %.2f%n", t1);
     }
     if (codigo == 2)
     {
         double t2 = 4.50 * quantidade;
         System.out.printf("Total: R$ %.2f%n", t2);
     }
     if (codigo == 3)
     {
         double t3 = 5.00 * quantidade;
         System.out.printf("Total: R$ %.2f%n", t3);
     }
     if (codigo == 4)
     {
         double t4 = 2.00 * quantidade;
         System.out.printf("Total: R$ %.2f%n", t4);
     }
     if (codigo == 5)
     {
         double t5 = 1.50 * quantidade;
         System.out.printf("Total: R$ %.2f%n", t5);
     }
     input.close();

 }

}

/* 
Tabela do problema:
1 - cachorro quente - 4.00
1 - Xsalada - 4.50
1 - Xbacon - 5.00
1 - torrada - 2.00
1 - refrigerante - 1.50




era possível usar também o switch case, como o exemplo abaixo da internet:
int codigo = leitor.nextInt();
     int quantia = leitor.nextInt();
     double total;
     switch (codigo) {
         case 1:	total = quantia * 4.00; break;
         case 2: total = quantia * 4.50; break;
         case 3: total = quantia * 5.00; break;
         case 4: total = quantia * 2.00; break;
         case 5: total = quantia * 1.50; break;
         default: total = 0;
     }
     System.out.println(String.format("Total: R$ %.2f", total));
*/
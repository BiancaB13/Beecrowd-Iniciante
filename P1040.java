/* 
aqui descobrimos que o double é teimoso, a solução foi usar float 

"Mas quando se trata de doubles, nada é garantido, como ele é armazenado na forma
de potências, mesmo uma operação mais simples pode causar alguma casa além do
formato desejado."//comentário da internet

primeiro fiz usando double, porém ele sempre arredondava o valor 
por exemplo
-entrada: 2.0 6.5 4.0 9.0
-saída esperada:
Media: 4.8
Aluno reprovado.
-saída com double: 
Media: 4.9 (logo, arredondou)
Aluno reprovado.
*/

/* 
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        Locale.setDefault(new Locale("en","US"));
        input.useLocale(Locale.US);
        
        double n1 = input.nextDouble();//peso 2
        double n2 = input.nextDouble();//peso 3
        double n3 = input.nextDouble();//peso 4
        double n4 = input.nextDouble();//peso 1
        double media = (n1*2.0 + n2*3.0 + n3*4.0 + n4*1.0) /10;
        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7)
        {
            System.out.println("Aluno aprovado.");
        }
        if(media>=5 && media<=6.9)
        {
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);
            double notaFinal = (exame + media) /2;
            if(notaFinal >=5)
            {
                System.out.println("Aluno aprovado.");
            }
            if(notaFinal <=4.9)
            {
                System.out.println("Aluno aprovado.");
            }
            System.out.printf("Media final: %.1f%n", notaFinal);
        }
        if(media < 5)
        {
            System.out.println("Aluno reprovado.");
        }
 
    }
 
}
*/

//****Com float, o sonhado accepted:

import java.util.Scanner;
import java.util.Locale;

public class P1040 {
 
    public static void main(String[] args) {

Scanner input = new Scanner (System.in);
        Locale.setDefault(new Locale("en","US"));
        input.useLocale(Locale.US);
        
        float n1 = input.nextFloat();//peso 2
        float n2 = input.nextFloat();//peso 3
        float n3 = input.nextFloat();//peso 4
        float n4 = input.nextFloat();//peso 1
        float media = (float) (((n1*2.0) + (n2*3.0) + (n3*4.0) + (n4*1.0)) /10.0);// esse (float) foi uma correção do netbeans, já que não se calcula n1*2.0, por exemplo, no float. Para tirar, é só deixar os pesos em npumeros inteiros
        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7)
        {
            System.out.println("Aluno aprovado.");
        }
        if(media>=5 && media<=6.9)
        {
            System.out.println("Aluno em exame.");
            float exame = input.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            float notaFinal = (exame + media) /2;
            if(notaFinal >=5)
            {
                System.out.println("Aluno aprovado.");
            }
            if(notaFinal <=4.9)
            {
                System.out.println("Aluno aprovado.");
            }
            System.out.printf("Media final: %.1f%n", notaFinal);
        }
        if(media < 5)
        {
            System.out.println("Aluno reprovado.");
        }
        input.close();
    }
}    

/* 
o programa:
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 
Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". 
Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". 
Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".


No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. 
Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). 
Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.
*/
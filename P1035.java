import java.util.Scanner;
//usando operadores lógicos
//apartir desse exercício, os outros ficam cada vez mais tecnicos
//alguns errinhos básicos, como A%2 ou até mesmo C%2 para saber se o número é positivo

public class P1035 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        
        if(B > C && D > A && C+D > A+B && C>0 && D>0 && A % 2 == 0)
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
        input.close();
 
    }
 
}

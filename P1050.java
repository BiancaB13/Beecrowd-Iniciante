/*
esse deu errado, o else ficou imprimindo junto com os ifs
exemplo: aparecia São Paulo corretamente, mas em baixo a mensagem de ddd não cadastrado

Scanner input = new Scanner (System.in);
        int codigo = input.nextInt();
        if (codigo == 61) {
            System.out.println("Brasilia");
        }
        if (codigo == 71) {
            System.out.println("Salvador");
        }
        if (codigo == 11) {
            System.out.println("Sao Paulo");
        }
        if (codigo == 21) {
            System.out.println("Rio de Janeiro");
        }
        if (codigo == 32) {
            System.out.println("Juiz de Fora");
        }
        if (codigo == 19) {
            System.out.println("Campinas");
        }
        if (codigo == 27) {
            System.out.println("Vitoria");
        }
        if (codigo == 31) {
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
  
 */


//o certo, usando if-else
//deu certo, mas o último if ficou longo demais
import java.util.Scanner;
public class P1050 {
 
    public static void main(String[] args){
 
        Scanner input = new Scanner (System.in);
        int codigo = input.nextInt();
        if (codigo == 61) {
            System.out.println("Brasilia");
        }
        if (codigo == 71) {
            System.out.println("Salvador");
        }
        if (codigo == 11) {
            System.out.println("Sao Paulo");
        }
        if (codigo == 21) {
            System.out.println("Rio de Janeiro");
        }
        if (codigo == 32) {
            System.out.println("Juiz de Fora");
        }
        if (codigo == 19) {
            System.out.println("Campinas");
        }
        if (codigo == 27) {
            System.out.println("Vitoria");
        }
        if (codigo == 31) {
            System.out.println("Belo Horizonte");
        }
        if (codigo != 61 && codigo != 71 && codigo != 11 && codigo != 21 && codigo != 32 && codigo != 19 && codigo != 27 && codigo != 31) {
            System.out.println("DDD nao cadastrado");
        }
        input.close();
    }
 
}

/*
esse foi usando o switch case, acho menos bagunçado

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt();
        switch (codigo){
        case 61: System.out.println("Brasilia"); break; 
        case 71: System.out.println("Salvador"); break;
        case 11: System.out.println("Sao Paulo"); break;
        case 21: System.out.println("Rio de Janeiro"); break;
        case 32: System.out.println("Juiz de Fora"); break;
        case 19: System.out.println("Campinas"); break;
        case 27: System.out.println("Vitoria"); break;
        case 31: System.out.println("Belo Horizonte"); break;
        default: System.out.println("DDD nao cadastrado"); break;
        //nem lembrava do default para exceções
    }
    input.close();
 
    }
 
}

 */

 /*
  * Leia um número inteiro que representa um código de DDD para discagem interurbana. 
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo: (não vou digitar a tabela, as equivalencias estão no programa)
Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar: DDD nao cadastrado
  */
import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        
        int idadeDias = input.nextInt();
        
        int anos = idadeDias / 365;
        idadeDias = idadeDias % 365;

//calcular a quantidade de anos considerando que uma ano tem 365, logo é uma decomposição
//por exemplo, quantos anos cabem em 400 dias = 1 ano
//depois que idadeDias é dividido por 365, é necessário pegar o resto da divisão para saber a quantidade de meses e dias
//por isso idadeDias(que já foi dividido por 365) é igual a idadeDias modulo de 365 (ou seja, o resto). 
//assim o "int meses = idadeDias / 30;" já vai calcular os meses levando em consideração o modulo 
//400 dividido por 365 da 1.09, sem o modulo vai calcular apenas o 1(int)
        
        int meses = idadeDias / 30;
        idadeDias = idadeDias % 30;
        
        int dias = idadeDias;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        input.close();

   }

}

//o usuario entra com a idade em dias e o programa informa a idade em anos, meses e dias

/*
 
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

 */
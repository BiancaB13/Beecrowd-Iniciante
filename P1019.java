import java.util.Scanner;

public class P1019 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        
        int segundos = input.nextInt();
        
//precisa de 3 variaeis, para saber a quantidade e horas, minutos e segundos
//total de segundos dividido por 3600
// % modulo para mostrar o resto da divisão 
//exemplo: a divisão descarta a parte fracionada. Se fosse 3601 dividido por 3600, ele ia descartar o 1
        int horas = segundos / 3600;
        segundos = segundos % 3600;
//1 hora = 3600 segundos
        
        int minutos = segundos / 60;
        segundos = segundos % 60;
//1 hora tem 60 minutos
        
        int qtdSegundos = segundos;
        
        System.out.println(horas + ":" + minutos + ":" + qtdSegundos);
        input.close();
        //System.out.printf("%d:%d:%d%n"horas, minutos, qtdSegundos);
        //ambos imprimem a mesma coisa, a diferença é que "%d" é para variável int e "%.1f" para double
 
    }
 
}

/*

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 */
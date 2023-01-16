import java.util.Scanner;
import java.util.Locale;

public class P1008 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        Locale.setDefault((new Locale("en", "US")));
        input.useLocale(Locale.US);
        
        int NUMBER = input.nextInt();
        int horat = input.nextInt();
        double valorhora = input.nextDouble();
        double SALARY = horat * valorhora;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
        input.close();
     }
}

import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Locale.setDefault(new Locale("en", "US"));

        
        double raio = input.nextDouble();
        double n = 3.14159;
        double area = n * Math.pow(raio,2);
        System.out.printf("A=%.4f\n", area);

        input.close();
    }
}
import java.util.Scanner; 
import java.util.Locale;

public class P1010 {
    public static void main(String[] args) {
 
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in); 
        //int p1 = input.nextInt();
        int np1 = input.nextInt();
        double v1 = input.nextDouble();
        
        //int p2 = input.nextInt();
        int np2 = input.nextInt();
        double v2 = input.nextDouble();
        
        double T = np1*v1 + np2*v2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", T);
        input.close();
 
    }
}

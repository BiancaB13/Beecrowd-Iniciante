/*errou
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        switch (valor){
        case 1: January; break; 
        case 2: February; break;
        case 3: March; break;
        case 4: April; break;
        case 5: May; break;
        case 6: June; break;
        case 7: July; break;
        case 8: August; break;
        case 9: September; break;
        case 10: October; break;
        case 11: November; break;
        case 12: December; break;
        default: total = 0;
    }
 
}
*/


import java.util.Scanner;
public class P1052 {
 
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        switch (valor){
        case 1: System.out.println("January"); break; 
        case 2: System.out.println("February"); break;
        case 3: System.out.println("March"); break;
        case 4: System.out.println("April"); break;
        case 5: System.out.println("May"); break;
        case 6: System.out.println("June"); break;
        case 7: System.out.println("July"); break;
        case 8: System.out.println("August"); break;
        case 9: System.out.println("September"); break;
        case 10: System.out.println("October"); break;
        case 11: System.out.println("November"); break;
        case 12: System.out.println("December"); break;
    }
    input.close();
  }
}

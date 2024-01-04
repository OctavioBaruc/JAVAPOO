import java.util.Scanner;
public class Leerconsola {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        System.out.print("Digital el primer valor");
        int n1 = lector.nextInt();
        System.out.print("digital el segundo valor");
        int n2 = lector.nextInt();
        int mayor = n1>n2?n1:n2;
        System.out.print("el número mayor es: " +mayor);

        lector.close();

    }
}

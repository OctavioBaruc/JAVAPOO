import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        //entra el while loop
        while(true) {
        System.out.println("Ingresa la cantiad que quieres retirar");
        int dineroRet = lector.nextInt();
        if (dineroRet % 20 == 0) {
            if (dineroRet>500) {
                System.out.println("Lo siento no podemos aceptar retiro de mas de $50o vuelva a ingresar la cantidad");
                continue;
            }
        System.out.println("Tu cantidad a retirar es de " + dineroRet);
        System.out.println("Nos vemos pronto :3");
            break;
        }else{
            System.out.println("Lo sentimos el cajero solo cuneta con billetes de 20 pesos vuelva a ingresar la cantidad");
            continue;
        }
    }
}
}

import java.util.Scanner;

 class VerificarPrimo {
    static void main(String[] args) {

        Scanner jarvis = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = jarvis.nextInt();

        boolean esPrimo = true;


        if (numero <= 1) {
            esPrimo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }


        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }


        jarvis.close();
    }
}

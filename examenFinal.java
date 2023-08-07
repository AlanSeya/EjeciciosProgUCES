import java.util.Scanner;

class examenFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = scanner.nextInt();
        primo(numero);
        if (numero != 1) {

            // El numero primo es divisible por si mismo y por 1



            
            if (primo(numero) == true) {
            System.out.println("es primo");
            } else {
            System.out.println("no es primo");
            }
        }

        else {
            System.out.println("no es primo");
        }

        scanner.close();
    }

    public static boolean primo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) != 0) {
                return (true);
            } else {
                return (false);

            }

        }
        return false;
    }
}
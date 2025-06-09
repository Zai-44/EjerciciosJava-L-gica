/* Contraseña segura
Solicita una contraseña al usuario y verifica si cumple con los siguientes criterios:
•	Tiene al menos 8 caracteres
•	Contiene al menos una mayúscula
•	Contiene al menos una minúscula
•	Contiene al menos un número
Requisitos:
•	Usa métodos como Character.isUpperCase, Character.isDigit, etc.
*/

import java.util.Scanner;

public class ContraseñaSegura {

    public static void main(String[] args) {       // Código principal
        // Se crea un objeto para que lea la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Se solcita la contraseña al usuario
        System.out.print("Ingresa una contraseña: ");
        String contraseña = scanner.nextLine();

        // Se verefica si la contraseña es segura
        if (esContraseñaSegura(contraseña)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura. Debe cumplir con los criterios.");
        }

        // Se cierra el Scanner
        scanner.close();
    }

    /**
     * Método para verificar si una contraseña es segura.
     * @param contraseña La cadena de texto a evaluar.
     * @return true si la contraseña es segura, false de lo contrario.
     */
    public static boolean esContraseñaSegura(String contraseña) {       //Aqui se valida el código
        // Verificamos si la longitud es al menos 8 caracteres
        if (contraseña.length() < 8) {
            return false;
        }

        // Variables que nos ayudaran a saber si hay mayúsculas, minúsculas y números
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;

        // Recorremos cada carácter de la contraseña
        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);

            // Verificamos si es una letra mayúscula
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }

            // Verificamos si es una letra minúscula
            if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            }

            // Verificamos si es un dígito
            if (Character.isDigit(caracter)) {
                tieneNumero = true;
            }

            // Si ya encontramos todas las condiciones, podemos salir del bucle
            if (tieneMayuscula && tieneMinuscula && tieneNumero) {
                break;
            }
        }

        // La contraseña es segura solo si cumple con todas las condiciones
        return tieneMayuscula && tieneMinuscula && tieneNumero;
    }
}

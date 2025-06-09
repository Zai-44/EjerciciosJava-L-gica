public class Persona {
    //"Tù puedes hacer lo quieras ser" - Barbie
    //Las personas tienen nombre, edad, etc.
    //Vamos a simular algunas actividades mediante mètodos

    //Una buena practica es declarar las variables en la parte màs alta del còdigo

    int edad = 20;
    void mayorDeEdad( ) {
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
    }

    void descansar(boolean estaCansado){
        if (estaCansado) {
            System.out.println("Vete a dormir");
        }else{
            System.out.println("Programa un rato");
        }

    }


    void correr(boolean esTemprano){
    if (esTemprano) {
        System.out.println("Sal a correr");
    } else {
        System.out.println("Sigue durmiendo");
        }
    }

    int hora = 10;
    void tarea( ) {
        if (hora < 10) {
            System.out.println("Realiza tu tarea");
        }else{
            System.out.println("Ni modos no te toca dormir, haz tu tarea irresponsable");
        }
    }

    void ducha(boolean apestas){
        if (apestas) {
            System.out.println("Bañate");
        }else{
            System.out.println("La gente cambia cuando se baña");
        }
    }


    void comer(boolean hambreado){
        if(hambreado) {
            System.out.println("Hazte de comer");
        }else{
            System.out.println("Sigue trabajando");
        }
    }

    int horaParaHacerEjercicio = 6;
    void ejercicio( ) {
        if (horaParaHacerEjercicio > 6) {
            System.out.println("Es buena hora para hacer ejercicio");
        }else{
            System.out.println("Realiza otras actividades");
        }
    }
}

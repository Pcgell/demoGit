public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //uso appropiado de un singleton evitar llamar getinstantance mas de dos veces por metodo o funcion.

        LectorDeTecldo lt = LectorDeTecldo.getInstance();

        System.out.println("ingrese un numero foltante :");
        double numero = lt.leerFlotante("_:","espera un numero Flotante porfavor intente de nuevo \n_:");

        System.out.println("su numero flotante es: " + numero);
    }
}

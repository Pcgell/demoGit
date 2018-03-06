import java.util.Scanner;

public class LectorDeTecldo {

    //patron singleton..

    private Scanner scanner;
    private static LectorDeTecldo instance;

    private LectorDeTecldo(){
        scanner = new Scanner(System.in);
    }


    // haciendo el metodo Highlander!!!!
    //solo puede existir uno!!
    public static LectorDeTecldo getInstance(){
        if(instance == null){
            instance =  new LectorDeTecldo();
        }
        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }


    public double leerFlotante(String mensaje, String reintento){
        System.out.println(mensaje);
        do {
            if(scanner.hasNextDouble()){
               return scanner.nextDouble();
            }
            scanner.next();
            System.out.println(reintento);
        }while (true);
    }
}

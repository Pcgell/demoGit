import java.util.Scanner;

public class LectorDeTecldo {

    //patron singleton..

    private Scanner scanner;
    private static LectorDeTecldo instance;

    private LectorDeTecldo(){
        scanner = new Scanner(System.in);
    }


    // haciendo el metodo Highlander!!!!
    // solo puede existir uno!!
    public static LectorDeTecldo getInstance(){
        if(instance == null){
            instance =  new LectorDeTecldo();
        }
        return instance;
    }
    
    String leerPalabra(){
        return scanner.next();
    }

    String leerLinea(){
        return scanner.nextLine();
    }

    public int leerEntero(String mensaje, String reintento){
        System.out.println(mensaje);
        do{
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println(reintento);
        }while(true);
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

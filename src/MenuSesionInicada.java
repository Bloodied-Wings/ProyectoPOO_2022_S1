import java.util.Scanner;

public class MenuSesionInicada {

    public MenuSesionInicada() {
    }
    
    public void menuSesionInicada(){
        while (salir == false) {
            System.out.println("----------BATALLA NAVAL----------");

            System.out.println();

            System.out.println("1. Jugar");
            System.out.println("2. Ver Mi Perfil");
            System.out.println("3. Ranking");
            System.out.println("0. Cerrar Sesion");

            System.out.println();

            System.out.println("----------Escoja su opción----------");
            option = sc.next();
            System.out.println();

            switch (option) {

                case "1":
                    
                    System.out.println("----------Jugar----------");
                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;
                
                case "2":

                    System.out.println("----------Ver Mi Perfil----------");
                    System.out.println("Opción no integrada de momento...");

                    System.out.println();
                    
                    break;

                case "3":

                    System.out.println("----------Jugar Como Invitado---------");
                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;

                case "0":

                    System.out.println("----------Sesión cerrada----------");
                    System.out.println("----------Regresando al menú----------");

                    System.out.println();

                    salir = true;

                    break;
            
                default:
                
                    System.out.println("----------POR FAVOR INGRESE UNA OPCIÓN VALIDA----------");

                    System.out.println();

                    break;

            }    
        
        }
    }

    Scanner sc = new Scanner(System.in);

    //Variables de usuario y contraseña para el registro de un usuario
    String user = "";
    String pass = "";

    //Variables de usuario y contraseña para el inicio de sesión de un usuario
    String userLogin = "";
    String passLogin = "";

    //Variable para el switch
    String option = "";

    //Variable para mantener abierta la app o cerrarla en su defecto
    Boolean salir = false;

}

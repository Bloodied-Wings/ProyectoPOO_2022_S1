import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
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

        //Creación del perfil
        Perfil perfil = new Perfil();

        //Menú
        while (salir == false) {
            System.out.println("----------BATALLA NAVAL----------");

            System.out.println();

            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Jugar Como Invitado");
            System.out.println("4. Usuarios Registrados");
            System.out.println("5. Ranking");
            System.out.println("0. Salir");

            System.out.println();

            System.out.println("----------Escoja su opción----------");
            option = sc.next();
            System.out.println();

            switch (option) {

                case "1":
                    
                    System.out.println("----------Registrarse----------");

                    System.out.println("User: ");
                    user = sc.next();

                    System.out.println();
                
                    System.out.println("Contraseña: ");
                    pass = sc.next();
                    
                    System.out.println();

                    perfil.verifyRegistration(user,pass);

                    System.out.println();

                    break;
                
                case "2":

                    System.out.println("----------Iniciar Sesión----------");

                    System.out.println("User: ");
                    userLogin = sc.next();

                    System.out.println();

                    System.out.println("Contraseña: ");
                    passLogin = sc.next();

                    System.out.println();

                    perfil.loginUser(userLogin, passLogin);
                    
                    break;

                case "3":

                    System.out.println("----------Jugar Como Invitado---------");
                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;

                case "4":

                    System.out.println("----------Usuarios Registrados---------");
                    perfil.registeredUsers();

                    System.out.println();

                    break;

                case "5":

                    System.out.println("----------Ranking---------");
                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;

                case "0":

                    System.out.println("----------GRACIAS POR JUGAR BATALLA NAVAL----------");
                    System.out.println("----------HASTA LA PROXIMA----------");

                    salir = true;

                    break;
            
                default:
                
                    System.out.println("----------POR FAVOR INGRESE UNA OPCIÓN VALIDA----------");

                    System.out.println();

                    break;

            }    
        
        }

        sc.close();

    }

}
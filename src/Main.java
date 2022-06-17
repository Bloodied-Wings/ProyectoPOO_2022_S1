import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String user = "";
        String pass = "";
        String userLogin = "";
        String passLogin = "";
        String option = "";
        Boolean salir = false;
        Perfil perfil = new Perfil();

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

            switch (option) {
                case "1":
                    
                    System.out.println("----------Ingrese su nombre de usuario----------");
                    user = sc.next();
                
                    System.out.println("----------Ingrese su contraseña----------");
                    pass = sc.next();
                    
                    perfil.registerUser(user,pass);

                    System.out.println();
                    break;
                
                case "2":

                    System.out.println("----------Inicio de sesión----------");

                    System.out.println("User: ");
                    userLogin = sc.next();

                    System.out.println("Pass: ");
                    passLogin = sc.next();

                    perfil.loginUser(userLogin, passLogin);
                    
                    break;
                
                case "3":

                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;

                case "4":

                    perfil.registeredUsers();

                    System.out.println();

                    break;

                case "5":

                    System.out.println("Opción no integrada de momento...");

                    System.out.println();

                    break;

                case "0":
                    salir = true;
                    break;
            
                default:
                    break;
            }    
        
        }

        sc.close();

    }

}

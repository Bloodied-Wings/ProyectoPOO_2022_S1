import java.util.ArrayList;

public class Perfil {

    public Perfil() {
    }

    public void registerUser(String user, String pass){ //Método para el registro de usuarios y su contraseña

        this.user = user;
        this.pass = pass;

        users.add(user);
        passwords.add(pass);
        
        System.out.println("Registro exitoso!!!");

        System.out.println();

    }
    
    public void verifyRegistration(String verifyUser, String pass){ //Método para verificar si existe el usuario que se quiere registrar (SE DIFERENCIan MAYUSCULAS DE MINUSCULAS)

        this.verifyUser = verifyUser;
        this.pass = pass;

        if(users.size() == 0) { //Caso cuando no hay usuarios registrados...

            registerUser(verifyUser, pass);

            verification = true; //... se registra el usuario

        }else if (users.size() >= 0) { //Caso cuando hay usuarios registrados

            for (int i = 0; i < users.size() ; i++) { //Se recorren los usuarios registrados

                if (verifyUser.equals(users.get(i))) { //Si el nombre de usuario que se busca registrar ya esta registrado...

                    verification = false; //... se niega el registro con ese nombre de usuario

                    i = users.size()+1;

                }else if(i == (users.size()-1)){ //Si el nombre de usuario que se busca registrar no corresponde a ningún perfil registrado...

                    verification = true; //... se registra el usuario

                }

            }

            if (verification == true) { //Caso cuando se registra el usuario
                
                registerUser(verifyUser, pass);

            }else if(verification == false){ //Caso cuando se niega el registro del usuario

                System.out.println("Ya existe un usuario con el nombre que ingresaste");
                System.out.println("Por favor ingresa otro nombre de usuario");

                System.out.println();

            }

        }
    }

    public void loginUser(String userLogin, String passLogin){ //Método para verificar el inicio de sesión

        this.userLogin = userLogin;
        this.passLogin = passLogin;

        if (users.size() == 0) { //Caso cuando no hay usuarios registrados

            System.out.println("Aún no hay usuarios registrados, se el primero en registrarte!!");

        }else if (users.size() >= 0) { //Caso cuando hay usuarios registrados

            for (int i = 0; i < users.size() ; i++) { //Se recorren los usuarios registrados

                if (userLogin.equals(users.get(i)) && passLogin.equals(passwords.get(i))) { //Si el usuario y la contraseña ingresadas corresponden a un perfil registrado...

                    confirmation = true; //... se confirma el inicio de sesión

                    i = users.size()+1;

                }else if(!userLogin.equals(users.get(i)) || !passLogin.equals(passwords.get(i))){ //Si el usuario y la contraseña ingresadas no corresponden a ningún perfil registrado...
                    
                    confirmation = false; //... se niega el inicio de sesión

                }

            }

            if (confirmation == true) { //Caso cuando se confirma el inicio de sesión
                
                System.out.println("Inicio de sesión exitoso");

                System.out.println();

            }else if(confirmation == false){ //Caso cuando se niega el inicio de sesión

                System.out.println("Credenciales incorrectas");

                System.out.println();

            }

        }

    }

    public void registeredUsers(){ //Método para enseñar los usuarios registrados

        if (users.size() == 0) { //Caso cuando no hay usuarios registrados

            System.out.println("Aún no hay usuarios registrados, se el primero en registrarte!!");

        }else if (users.size() >= 0) { //Caso cuando hay usuarios registrados

            for (int i = 0; i < users.size(); i++) {

                System.out.println((i+1) + ". " + users.get(i));

            }

        }
        
    }

    //Creación de los ArrayList para usuarios y contraseñas respectivamente
    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> passwords = new ArrayList<>();

    //Variables de usuario y contraseña para el usuario registrado
    String user = "";
    String pass = "";

    //Variable de usuario para verificar si el usuario existe antes de ser registrado
    String verifyUser = "";

    //Variables de usuario y contraseña para evaluar el inicio de sesión de un usuario
    String userLogin = "";
    String passLogin = "";

    //Variable para confirmar el inicio de sesión
    boolean confirmation = false;

    //Variable para confirmar que se verificaron los usuarios registrados
    boolean verification = true;
    
}
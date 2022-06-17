import java.util.ArrayList;

public class Perfil {

    public Perfil() {
    }

    public void registerUser(String user, String pass){ //Método para el registro de usuarios y su contraseña

        users.add(user);
        passwords.add(pass);

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



    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> passwords = new ArrayList<>();
    String user = "";
    String pass = "";
    String userLogin = "";
    String passLogin = "";
    boolean confirmation = false;

}
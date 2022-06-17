import java.util.ArrayList;

public class Perfil {

    public Perfil() {
    }

    public void registerUser(String user, String pass){

        users.add(user);
        passwords.add(pass);

    }
    
    public void loginUser(String userLogin, String passLogin){

        this.userLogin = userLogin;
        this.passLogin = passLogin;

        if (users.size() == 0) {

            System.out.println("Aún no hay usuarios registrados, se el primero en registrarte!!");

        }else if (users.size() >= 0) {

            for (int i = 0; i < users.size() ; i++) {

                if (userLogin.equals(users.get(i)) && passLogin.equals(passwords.get(i))) {

                    confirmation = true;

                    i = users.size()+1;

                }else if(!userLogin.equals(users.get(i)) || !passLogin.equals(passwords.get(i))){
                    
                    confirmation = false;

                }

            }

            if (confirmation == true) {
                
                System.out.println("Inicio de sesión exitoso");

                System.out.println();

            }else if(confirmation == false){

                System.out.println("Credenciales incorrectas");

                System.out.println();

            }

        }

    }

    public void registeredUsers(){

        if (users.size() == 0) {

            System.out.println("Aún no hay usuarios registrados, se el primero en registrarte!!");

        }else if (users.size() >= 0) {

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

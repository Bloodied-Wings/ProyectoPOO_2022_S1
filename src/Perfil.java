import java.util.ArrayList;

public class Perfil {

    public Perfil() {
    }

    public void registerUser(String user, String pass){

        users.add(user);
        passwords.add(pass);

    }
    
    public void loginUser(String userLogin, String passLogin){
        cont = 0;

        this.userLogin = userLogin;
        this.passLogin = passLogin;

        if (users.size() == 0) {

            System.out.println("Aún no hay usuarios registrados, se el primero en registrarte!!");

        }else if (users.size() >= 0) {

            for (int i = 0; i < users.size() ; i++) {

                if (userLogin.equals(users.get(i))) {

                    System.out.println("Usuario ingresado: " + userLogin);
                    System.out.println("Usuario encontrado: " + users.get(i) + ", en la posicion: " + (i+1));
                    i = users.size()+1;

                }else{

                    cont++;

                }

            }

            if (cont == users.size()) {

                System.out.println("El usuario ingresado no se encuentra registrado!!");

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
    int cont = 0;

}

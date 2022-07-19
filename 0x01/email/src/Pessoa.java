package src;
public class Pessoa {

    private String email;

    boolean emailValid(String email){
        if(email.length() <= 50 && email.contains("@")){
            return true;
        } else {
            return false;
        }
    }
}

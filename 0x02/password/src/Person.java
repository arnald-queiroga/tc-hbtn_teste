public class Person {
    private String user;
    private String password;

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Person() {
    }

    public boolean checkUser(String user){
        if (user.length() >= 8 && (!user.matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[0-9]).{8,}"))){
            return true;
        } return false;
    }

    public boolean checkPassword(String password){
        if ((password.length() >= 8) && (password.matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}"))){
            return true;
        } return false;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
} 

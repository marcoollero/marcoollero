package comlogin.model;

public class Signup {
    private String signupusername;
    private String signuppassword;

    private String first_name;
    private String last_name;
    public Signup(String signupusername, String signuppassword, String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        this.signupusername = signupusername;
        this.signuppassword = signuppassword;


    }




    public void setUsername(String signupusername) {
        this.signupusername = signupusername;
    }

    public void setPassword(String signuppassword) {
        this.signuppassword = signuppassword;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

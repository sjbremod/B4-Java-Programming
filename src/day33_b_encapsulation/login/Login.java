package day33_b_encapsulation.login;

public class Login {

    //instance variables
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //public setter --- this setter is for password
    public void setPassword(String username,String password){
        if (username.equalsIgnoreCase(this.username) ){

            if (password.length() >=8){

            }else{
                System.out.println("password has to be at least 8 characters");
            }
            this.password = password;
        }else {
            System.out.println("Wrong UserName");
        }
    }


// public Getter -- this getter is for password
    public  String getPassword (String username){
        String result = "";
        if(username.equalsIgnoreCase(this.username)){
            result = password;
        }else{
            result= "Wrong username";
        }
        return result;
    }

}

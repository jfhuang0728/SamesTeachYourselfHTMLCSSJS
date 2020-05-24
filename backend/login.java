public class login {
    public String login(String username, String password){
        if(username.equals("huang") && password.equals("123")){
            return "loginSuccess";
        }
        return "failed, please try again";
    }
}

package ex1_10082024.encap;

public class Lab0044 {
    public static void main(String[] args) {
        VWOlogin login = new VWOlogin();
        login.setUsername("SAJ");
        System.out.println(login.getUsername());
        login.setPassword("Raj1234");
        System.out.println(login.getPassword());
    }
}

class VWOlogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(getUsername().equalsIgnoreCase("Saj")){
            this.password = password;
        }else{
            System.out.println("Invalid user");
        }
    }

//    public VWOlogin(String username, String password){
//        this.username = username;
//        this.password = password;
//    }
}

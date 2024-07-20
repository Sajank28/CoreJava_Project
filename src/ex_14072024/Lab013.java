package ex_14072024;

public class Lab013 {
    public static void main(String[] args) {
        String pass= "12Pramod$";
        String pass_u = pass.toLowerCase();

        //String Pre-Defined Functions
        System.out.println(pass == pass_u);
        System.out.println(pass_u.equals(pass));
        System.out.println(pass_u.equalsIgnoreCase(pass));

        System.out.println(pass.substring(0,3));
        System.out.println(pass.indexOf('r'));
        System.out.println(pass.length());
        System.out.println(pass.charAt(7));
    }
}

package ex1_17082024.enumdemo;

public enum color {

    RED("ff00012"),
    GREEN("ff19122");


    private String hexavalue;



    color (String hexavalue){
        this.hexavalue = hexavalue;
    }
}

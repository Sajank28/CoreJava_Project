package Assignments;

public class Triangle_Classifier {
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int s3 = 30;

        if(s1==s2 && s2==s3){
            System.out.println("Equilateral Triangle");
        }else if(s1==s2 || s2==s3 || s1 == s3 ){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
    }
}

package ex1_10082024.poly.overriding;

public class Lab0047 {
    public static void main(String[] args) {
        //2.overriding -

        hound h1 = new hound();
        h1.bark();

        dog d1 = new dog();
        dog.bark();

        dog dog_ref = new hound();
        dog_ref.bark();
    }
}

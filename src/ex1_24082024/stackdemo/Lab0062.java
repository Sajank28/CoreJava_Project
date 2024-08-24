package ex1_24082024.stackdemo;

import java.util.Stack;

public class Lab0062 {
    public static void main(String[] args) {

        //Stack  - First in Last out (FILO)
            //Operations - Peek(), Pop(), Push(), Search()
        Stack st = new Stack();
        st.push("name 1");
        st.push("name 2");
        st.push("name 3");


        System.out.println(st);
        System.out.println(st.capacity());
        System.out.println(st.reversed());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.clear();
        System.out.println(st);
    }
}

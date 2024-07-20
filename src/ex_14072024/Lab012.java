package ex_14072024;

public class Lab012 {
    public static void main(String[] args) {
        //String - Immutable
            //Create String using Assignment operators (Stored in SCP)
            String name ="Sajan Kamath V";

            System.out.println(name.toLowerCase());
            System.out.println(name.toUpperCase());
            System.out.println(name.length());
            System.out.println(name.charAt(2));
            System.out.println(name.concat(" rajesh"));

            //Create String using new Operator (Stored in HEAP)
            String string = new String("Sajan");
            System.out.println(string);

        // SCP and HEAP in JVM architecture
        //SCP - String constant pool
        //Heap - Storage area

    }
}

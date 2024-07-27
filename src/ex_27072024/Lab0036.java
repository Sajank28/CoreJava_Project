package ex_27072024;

public class Lab0036 {
    public static void main(String[] args) {
        //String - Immutable in nature
        //String builder and String buffer


//Thread safety - Synchronized - slow due to synchronization
        StringBuffer stringBuffer = new StringBuffer("Sajan ");
        stringBuffer.append("Kamath");
        System.out.println(stringBuffer);

//Thread safety - not synchronized - Faster
        StringBuilder stringBuilder = new StringBuilder("Ram ");
        stringBuilder.append("Ramesh");
        System.out.println(stringBuilder);
    }
}

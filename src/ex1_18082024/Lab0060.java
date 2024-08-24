package ex1_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab0060 {

    //Throws
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
        String path = "C:\\Users\\sajan\\OneDrive\\Desktop\\a.txt";
        File file = new File(path);
        FileReader filereader = new FileReader(file);
        System.out.println("Hello");
    }
}

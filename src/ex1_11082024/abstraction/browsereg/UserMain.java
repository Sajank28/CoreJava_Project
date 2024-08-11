package ex1_11082024.abstraction.browsereg;

public class UserMain {
    public static void main(String[] args) {

        Chrome c1 = new Chrome();
        c1.openBrowser("Chrome");
        c1.closeBrowser("Chrome");

        FireFox f1 = new FireFox();
        f1.openBrowser("FF");
        f1.closeBrowser("FF");
    }
}

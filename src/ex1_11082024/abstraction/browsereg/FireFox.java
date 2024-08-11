package ex1_11082024.abstraction.browsereg;

public class FireFox extends BaseClass{
    @Override
    String openBrowser(String Browser) {
        System.out.println("Open Firefox browser");

        return "";
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("Close Firefox browser");
        return "";
    }
}

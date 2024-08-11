package ex1_11082024.abstraction.browsereg;

public class Chrome extends BaseClass{
    @Override
    String closeBrowser(String Browser) {
        System.out.println("Open Chrome browser");
        return "";
    }

    @Override
    String openBrowser(String Browser) {
        System.out.println("Close Chrome browser");
        return "";
    }
}

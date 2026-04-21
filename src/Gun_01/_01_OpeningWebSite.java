package Gun_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSite {
    public static void main(String[] args) {

        WebDriver brauzer = new ChromeDriver(); // baruzeri yaratdiq
                            // new FireFoxDriver;
                            // new EdgeDriver;
        // 3 saniye gozle
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        brauzer.get("https://www.google.com/"); // Bu sehifeye get (html-ni arxa fonda yukle)

        // 3 saniye gozle
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


        brauzer.quit(); // Yaddashi temizle ve cixh

    }
}

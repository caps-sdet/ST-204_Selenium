package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_XetaliLocator {
    public static void main(String[] args) {


        WebDriver brauzer = new ChromeDriver();

        MyFunc.wait(3);

        brauzer.get("https://www.jotform.com/form/253224797975069");

        // WebElement adQutusu = brauzer.findElement(By.id("first_30")); testi dayndirdi

        try {
            WebElement adQutusu = brauzer.findElement(By.id("first_30"));
            // Test dayanmayib sonraki elementi tapa bilsin deye

        }catch (Exception e){
            System.out.println("Bele bir webelement tapilmadi" + e.getMessage());
        }

        brauzer.quit();

    }
}

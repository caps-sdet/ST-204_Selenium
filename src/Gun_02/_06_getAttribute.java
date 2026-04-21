package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_getAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        MyFunc.wait(3);
        driver.manage().window().maximize(); // brauzerimi cihaza gore maximum olaraq ach

        driver.get("https://www.amazon.com/");

        MyFunc.wait(2);
        WebElement sellLink = driver.findElement(By.linkText("Sell"));
        System.out.println("sellLink.getText() = " + sellLink.getText()); 
        
        // bu Elementin Atributlarini (Xususiyyetlerini) almaq
        System.out.println("sellLink.getAttribute(\"href\") = " + sellLink.getAttribute("href"));

        MyFunc.wait(2);

        driver.quit(); // Driveri tam baglamaq uchun (acilmish butun brauzerleri)
        // driver.close(); // pencereni ve ya tabi baglama qucun istifade olunur
        // (o anda aktiv olan brauzeri baglamaq ucun)

    }
}

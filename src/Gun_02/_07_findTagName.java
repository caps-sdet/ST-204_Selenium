package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _07_findTagName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        MyFunc.wait(3);
        driver.manage().window().maximize(); // brauzerimi cihaza gore maximum olaraq ach

        driver.get("https://www.amazon.com/");

        MyFunc.wait(2);

        List<WebElement> linkler = driver.findElements(By.tagName("a"));

        for (WebElement link : linkler){
            if (!link.getText().equals("") && link.getAttribute("href")!=null){
                System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("href"));
            }
        }
        MyFunc.wait(2);
        driver.quit();
    }
}

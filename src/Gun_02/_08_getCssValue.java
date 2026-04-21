package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_getCssValue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        MyFunc.wait(3);
        driver.manage().window().maximize(); // brauzerimi cihaza gore maximum olaraq ach

        driver.get("https://www.amazon.com/");

        MyFunc.wait(2);

        WebElement axtarisQutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // Class-ni deqiqleshdirek
        System.out.println("axtarisQutusu.getAttribute(\"class\") = " + axtarisQutusu.getAttribute("class"));

        System.out.println("axtarisQutusu.getCssValue(\"background\") = " +
                axtarisQutusu.getCssValue("background"));
        System.out.println("axtarisQutusu.getCssValue(\"font-size\") = " +
                axtarisQutusu.getCssValue("font-size"));
        System.out.println("axtarisQutusu.getCssValue() = " +
                axtarisQutusu.getCssValue("font-family"));
        System.out.println("axtarisQutusu.getCssValue(\"color\") = " +
                axtarisQutusu.getCssValue("color"));


        driver.quit();
    }
}

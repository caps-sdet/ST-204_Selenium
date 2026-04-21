package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_findByName {
    public static void main(String[] args) {
        WebDriver brauzer = new ChromeDriver();

        MyFunc.wait(3);

        brauzer.get("https://www.jotform.com/form/253224797975069");

        WebElement adQutusu = brauzer.findElement(By.name("q3_studentName[first]"));
        adQutusu.sendKeys("CAPS");

        WebElement soyadQutusu = brauzer.findElement(By.name("q3_studentName[last]"));

        soyadQutusu.sendKeys("Academy");

        WebElement enrollBtn = brauzer.findElement(By.id("input_2"));
        enrollBtn.click();

        // 3 saniye gozle
        MyFunc.wait(3);

        brauzer.quit();
    }
}

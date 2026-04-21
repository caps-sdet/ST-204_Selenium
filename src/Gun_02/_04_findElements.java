package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_findElements {
    public static void main(String[] args) {


        WebDriver brauzer = new ChromeDriver();
        MyFunc.wait(3);
        brauzer.manage().window().maximize(); // brauzerimi cihaza gore maximum olaraq ach

        brauzer.get("https://www.jotform.com/form/253224797975069");
        WebElement adQutusu = brauzer.findElement(By.name("q3_studentName[first]"));

        adQutusu.sendKeys("CAPS");
        MyFunc.wait(3);
        adQutusu.clear(); // qutunu temizle
        adQutusu.sendKeys("Alizamin");
        MyFunc.wait(2);

//        WebElement element = brauzer.findElement(By.className("form-sub-label"));
//        System.out.println("element.getText() = " + element.getText());
//        MyFunc.wait(2);

        List<WebElement> elementler = brauzer.findElements(By.className("form-sub-label"));
        for (WebElement e : elementler)
            System.out.println("e.getText() = " + e.getText());

        MyFunc.wait(2);

        brauzer.quit();
    }
















}

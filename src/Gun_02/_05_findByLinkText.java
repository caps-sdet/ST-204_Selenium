package Gun_02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_findByLinkText {
    public static void main(String[] args) {

        // id           : By.id
        // name         : By.name
        // classname    : By.classname
        // linktext     : By.linktext (Yalniz a tagli elementleri axtararken lazim olacaq)

        WebDriver driver = new ChromeDriver();
        MyFunc.wait(3);
        driver.manage().window().maximize(); // brauzerimi cihaza gore maximum olaraq ach

        driver.get("https://www.amazon.com/");

        MyFunc.wait(2);
        WebElement regsitryLink = driver.findElement(By.linkText("Registry"));
        // Link uzerinde gorunen text nedirse ona gore tapdiq
        System.out.println("regsitryLink.getText() = " + regsitryLink.getText()); // dogrulama kimi
//        MyFunc.wait(3);
//        regsitryLink.click();
        MyFunc.wait(2);

        WebElement partialLinkText = driver.findElement(By.partialLinkText("Customer"));
        // PartialLinText - Linkin gorunen hissesindeki yazinin bir hissesini yazaraq tapmaq ucun
        System.out.println("partialLinkText.getText() = " + partialLinkText.getText());
        MyFunc.wait(2);
        driver.quit();
    }
}

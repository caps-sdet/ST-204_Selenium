package Gun_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindById {
    public static void main(String[] args) {
        // Ssenarimiz :
        /*
        1. Sehifeye get (https://www.jotform.com/form/253224797975069)
        2. Adini daxil et (CAPS)
        3. Soyadini daxil et (Academy)
         */
        WebDriver brauzer = new ChromeDriver(); // baruzeri yaratdiq

        // 3 saniye gozle
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        brauzer.get("https://www.jotform.com/form/253224797975069");

        WebElement adQutusu = brauzer.findElement(By.id("first_3"));
        // Id-si first_3 olan WebElementi tap
        adQutusu.sendKeys("CAPS");
        // tapilsish WebElemente deyer gonder


        WebElement soyadQutusu = brauzer.findElement(By.id("last_3"));
        // Id-si first_3 olan WebElementi tap
        soyadQutusu.sendKeys("Academy");
        // tapilsish WebElemente deyer gonder

        WebElement enrollBtn = brauzer.findElement(By.id("input_2")); // elemt tapildi
        enrollBtn.click(); // duymeye klikle

        // 3 saniye gozle
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


        brauzer.quit();
    }
}

package Gun_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        // driver.get("https://testpages.eviltester.com/pages/basics/"); // Sehifeye get
        driver.navigate().to("https://testpages.eviltester.com/pages/basics/"); // sehifeye get

        System.out.println("Ilk gedilen sehifemiz");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // driverin hazirda oldugu sehife

        WebElement alertLink = driver.findElement(By.id("m-pagesbasicsalerts-javascript"));
        alertLink.click();
        System.out.println("Klikden sonraki gedilen sehife : ");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("Basic url-ye qayitdi? ");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("Klikden sonraki url-ye getdi? ");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        MyFunc.wait(5);
        gozleBagla();
    }
}

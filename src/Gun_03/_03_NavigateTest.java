package Gun_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_NavigateTest extends BaseDriver {

    @Test
   public void Test1(){
        driver.navigate().to("https://testpages.eviltester.com/pages/basics/");
        System.out.println("Ilk gedilen sehifemiz");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement alertLink = driver.findElement(By.id("m-pagesbasicsalerts-javascript"));
        alertLink.click();
        System.out.println("Klikden sonraki gedilen sehife : ");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        MyFunc.wait(2);
        driver.navigate().back();
        MyFunc.wait(2);
        driver.navigate().forward(); // https://testpages.eviltester.com/pages/basics/alerts-javascript/

        // Developer testi
//        if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/pages/basics/alerts-javascript/")){
//            System.out.println("Test Passed");
//        }
//        else {
//            System.out.println("Test Fail");
//        }

        // SDET testi
        Assert.assertTrue(
                "Sehife uygun gelmedi",
                driver.getCurrentUrl().equals("https://testpages.eviltester.com/pages/basics/alerts-javascript/"));

        // Expected ve Actual Assert ile dogrulana biler


        MyFunc.wait(2);
        gozleBagla();
   }
}

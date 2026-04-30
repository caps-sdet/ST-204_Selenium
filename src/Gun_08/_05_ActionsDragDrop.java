package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsDragDrop extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        // Actions hereketler = new Actions(driver);

        WebElement elementA = driver.findElement
                (By.xpath("//div[@id='column-a']"));
        WebElement elementB = driver.findElement
                (By.xpath("//div[@id='column-b']"));

        // hereketler.dragAndDrop(elementA,elementB).build().perform();


        MyFunc.wait(2);
        new Actions(driver)
                .clickAndHold(elementA)
                .moveToElement(elementB)
                .release()
                .build()
                .perform();
        // .clickAndHold(elementA)// klik et ve saxla
        // .moveToElement(elementB)// elemente apar
        // .release() elementi serbest burax

        MyFunc.wait(3);


        gozleBagla();
    }
}

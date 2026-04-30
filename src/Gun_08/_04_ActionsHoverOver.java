package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsHoverOver extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");

        WebElement hoverElement = driver.findElement
                (By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

        Actions hereketler = new Actions(driver);
        hereketler.moveToElement(hoverElement).build().perform();
        // moveToElement -> ele bir hereketdir ki, sanki mouse uzerine gedir
        MyFunc.wait(2);


        gozleBagla();
    }
}

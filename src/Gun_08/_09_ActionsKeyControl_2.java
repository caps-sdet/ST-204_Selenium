package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class _09_ActionsKeyControl_2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox = driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']"));
        // textBox.sendKeys("Teymur");

        MyFunc.wait(1);
        new Actions(driver)
                .moveToElement(textBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();
        MyFunc.wait(2);

        new Actions(driver)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        MyFunc.wait(2);
        gozleBagla();
    }
}

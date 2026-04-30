package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsKeyControl extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox = driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']"));
        // textBox.sendKeys("Teymur");

        MyFunc.wait(1);
        new Actions(driver)
                .moveToElement(textBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("t")
                .keyUp(Keys.SHIFT)
                .sendKeys("eymur")
                .build()
                .perform();

        // Duyme sixildiqdan (keyDown emri ile)sonra is bitibse duymeni mutleq ki Up etmek lazimdir

        MyFunc.wait(2);
        gozleBagla();
    }
}

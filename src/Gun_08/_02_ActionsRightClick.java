package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsRightClick extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnRightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions hereketler = new Actions(driver);
        hereketler.moveToElement(btnRightClick).contextClick().build().perform();

        // conctectClick() => sag click ifade edir
        MyFunc.wait(2);


        gozleBagla();
    }
}

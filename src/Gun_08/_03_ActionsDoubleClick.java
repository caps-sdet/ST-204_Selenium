package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsDoubleClick extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnDoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        Actions hereketler = new Actions(driver);
        hereketler.moveToElement(btnDoubleClick).doubleClick().build().perform();
        MyFunc.wait(2);


        gozleBagla();
    }
}

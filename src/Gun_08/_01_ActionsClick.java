package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsClick extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //btnClick.click(); // evvelki sade click

        Actions hereketler = new Actions(driver);

//        Action hereket = hereketler.moveToElement(btnClick).click().build();
        // click etmek ucun lazimli gedishati hazirla, heleki click etmir. Perform tapsirigini gozleyir
//        hereket.perform(); // hereket ucun hazirlanan plani yerine yetir tapsirigi
//        MyFunc.wait(2);

        // Qisa variant
//        hereketler.moveToElement(btnClick).click().build().perform();
//        MyFunc.wait(2);

        // daha qisa variant
//        new Actions(driver).moveToElement(btnClick).click().build().perform();
//        MyFunc.wait(2);

        // en qisa variant
        new Actions(driver).click(btnClick).build().perform();
        MyFunc.wait(2);


        gozleBagla();
    }
}

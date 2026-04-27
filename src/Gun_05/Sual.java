package Gun_05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sual extends BaseDriver {

    @Test
    public void Test1(){

        // Yalniz CssSelector istifade olunsun
        // bu sayta gedin  https://testpages.eviltester.com/pages/basics/
        // Saytda bu bolmeye klikleyin "Basic Web Page"
        // Bu bolmede "Click Me" butonona klikleyin
        // Assert olaraq "You clicked the button!" yazisinin gorunduyunu tesdiqleyin

        driver.get("https://testpages.eviltester.com/pages/basics/basic-web-page/");

//        WebElement basicPage = driver.findElement(By.cssSelector("[class='td-sidebar-nav-active-item']"));
//        basicPage.click();
//        MyFunc.wait(2);

        WebElement clickMeBtn = driver.findElement(By.cssSelector("[id='button1']"));
        clickMeBtn.click();
        MyFunc.wait(2);

        WebElement clickMessage = driver.findElement(By.cssSelector("[id='click-message']"));

        Assert.assertTrue("Uygun gelmedi" , clickMessage.getText().equals("You clicked the button!"));

        gozleBagla();

    }
}

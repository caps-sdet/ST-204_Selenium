package Gun_04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

public class _01_Calculate extends BaseDriver {


    @Test
    public void Test1(){
        driver.get("https://testpages.eviltester.com/apps/server-side-calculator/");

        WebElement input1 = driver.findElement(By.id("number1"));
        input1.sendKeys("5");
        MyFunc.wait(2);

        WebElement input2 = driver.findElement(By.id("number2"));
        input2.sendKeys("3");
        MyFunc.wait(2);

        WebElement calculateBtn = driver.findElement(By.id("calculate"));
        calculateBtn.click();
        MyFunc.wait(2);

        WebElement answer = driver.findElement(By.id("answer"));
        System.out.println("answer.getText() = " + answer.getText());
        String result = answer.getText();
        int resInt = Integer.parseInt(result);
        MyFunc.wait(2);

        // cavabi nece dogrulayacagiq?
        Assert.assertEquals("Test kecmedi",8,resInt);

        // todo developer bu dogrulamani nece ederdi? result == 8 ?

        gozleBagla();
    }
}

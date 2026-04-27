package Gun_05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _01_Calculate_CssSelector extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://testpages.eviltester.com/apps/server-side-calculator/");

        WebElement input1 = driver.findElement(By.cssSelector("[name='number1']")); // By.id("number1")
        input1.sendKeys("5");
        MyFunc.wait(2);

        WebElement input2 = driver.findElement(By.cssSelector("[id='number2']")); // By.id("number2")
        input2.sendKeys("3");
        MyFunc.wait(2);

        WebElement calculateBtn = driver.findElement(By.cssSelector("[onclick='calculate()']")); // By.id("calculate")
        calculateBtn.click();
        MyFunc.wait(2);

        WebElement answer = driver.findElement(By.cssSelector("[id='answer']")); //By.id("answer")
        System.out.println("answer.getText() = " + answer.getText());
        String result = answer.getText();
        int resInt = Integer.parseInt(result);
        MyFunc.wait(2);

        // cavabi nece dogrulayacagiq?
        Assert.assertEquals("Test kecmedi",8,resInt);

        gozleBagla();
    }
}

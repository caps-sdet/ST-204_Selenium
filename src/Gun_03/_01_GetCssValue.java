package Gun_03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement sbmBtn = driver.findElement(By.className("btn"));

        System.out.println("sbmBtn.getCssValue(\"color\") = " +
                sbmBtn.getCssValue("color"));

        System.out.println("sbmBtn.getCssValue(\"border-color\") = " +
                sbmBtn.getCssValue("border-color"));

        gozleBagla();
    }
}

package Gun_04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElementStatusu extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        System.out.println("monday.isDisplayed() = " + monday.isDisplayed()); // Gorunendirmi?
        System.out.println("monday.isEnabled() = " + monday.isEnabled()); // aktivlik statusu varmi?
        System.out.println("monday.isSelected() = " + monday.isSelected()); // secilib ve ya check edilib?
        // bu dogrulamalar Boolean Condion ile aparilir ve True or False qaytarir
        MyFunc.wait(2);
        monday.click();
        System.out.print("Monday statusu klikden sonra : ");
        System.out.println("monday.isSelected() = " + monday.isSelected());

        WebElement sunday = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println("sunday.isDisplayed() = " + sunday.isDisplayed());
        System.out.println("sunday.isEnabled() = " + sunday.isEnabled());
        System.out.println("sunday.isSelected() = " + sunday.isSelected());

        // Sunday gorunse bele secim ucun aciq olmadigini dogrula
        Assert.assertFalse("Test kecmedi",sunday.isEnabled()); // cavabin false olmasini gozleyir

        gozleBagla();
    }
}

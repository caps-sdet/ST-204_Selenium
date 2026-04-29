package Gun_07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_XpathSelect_Sual extends BaseDriver {
    /*
    Test Ssenarisi
    1. https://www.ebay.com/ saytina get
    2. kateqoriyalardan "Baby" sec
    3. Axtaris duymesine klikle
    4. Gedilen sehifenin bash hissesinde "Baby" sozunun yazildigini dogrulayin
    Locator ucun yalniz Xpath istifade edin, select ucun index ve ya value istifade ede bilersiz
     */
    @Test
    public void Test1(){

        driver.get("https://www.ebay.com/");
        MyFunc.wait(2);

        WebElement selectMenu = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select javaSelect = new Select(selectMenu);

        javaSelect.selectByValue("2984");
        MyFunc.wait(2);

        WebElement searchBtn = driver.findElement
                (By.xpath("//span[@class='gh-search-button__label']"));
        searchBtn.click();
        MyFunc.wait(2);

        WebElement headerText = driver.findElement
                (By.xpath("//h1[@class='textual-display page-title']"));
        System.out.println("headerText.getText() = " + headerText.getText());

        Assert.assertTrue("Axtarilan soz tapilmadi", headerText.getText().contains("Baby"));

        gozleBagla();
    }
}

package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_DrapDropBy extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions acs = new Actions(driver);

        WebElement altLimit = driver.findElement(By.xpath("//div[@id='slider-range'] / span[1]"));
        WebElement ustLimit = driver.findElement(By.xpath("//div[@id='slider-range'] / span[2]"));

        WebElement sliderRange = driver.findElement(By.xpath("//div[@id='slider-range']"));
        System.out.println("sliderRange.getSize() = " + sliderRange.getSize());
        System.out.println("sliderRange.getSize().width = " + sliderRange.getSize().width);
        System.out.println("sliderRange.getSize().height = " + sliderRange.getSize().height);

        acs.dragAndDropBy(altLimit,100,0).build().perform();
        MyFunc.wait(2);
        acs.dragAndDropBy(ustLimit,-50,0).build().perform();
        MyFunc.wait(2);


        gozleBagla();
    }
}

package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_MouseWheel extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@name='nested_scrolling_frame']"));

        MyFunc.wait(1);
        new Actions(driver)
                .scrollToElement(iframe)
                .build()
                .perform();

        MyFunc.wait(2);
        gozleBagla();
    }

    @Test
    public void Test2() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        MyFunc.wait(1);
        new Actions(driver)
                .scrollByAmount(0,1000)
                .build()
                .perform();
        //  .scrollByAmount(0,1000)  verilen piksel qeder
        MyFunc.wait(2);
        gozleBagla();
    }
}

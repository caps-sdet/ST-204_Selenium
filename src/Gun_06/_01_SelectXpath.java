package Gun_06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectXpath extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.amazon.com/");
        MyFunc.wait(2);

        WebElement selectMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//        selectMenu.click();
        Select javaSelect = new Select(selectMenu); // selectimiz selectMenu elementi uzerinde ishleyecek

//        javaSelect.selectByIndex(2); // index ile dropdown menyudan secim etdik
//        MyFunc.wait(2);

        System.out.println("javaSelect.getOptions().size() = " + javaSelect.getOptions().size());
//        for (int i = 0; i <javaSelect.getOptions().size() ; i++) {
//            javaSelect.selectByIndex(i);
//            MyFunc.wait(1);
//        } //butun select menuda olan secimlerin secilebilen oldugunu yoxladim Assert etmedim(edilmelidir)

        for (WebElement secim : javaSelect.getOptions()) {
            System.out.println("secim.getText() = " + secim.getText());
        }

        System.out.println("selectMenu.isDisplayed() = " + selectMenu.isDisplayed());
        System.out.println("selectMenu.isEnabled() = " + selectMenu.isEnabled());

        MyFunc.wait(2);
        javaSelect.selectByValue("Computers");
        MyFunc.wait(2);

        gozleBagla();

    }
}

package Gun_07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_XpathSual extends BaseDriver {
    //Ssenari
    /*
    1. https://www.saucedemo.com/ saytina daxil ol
    2. Login emeliyyatini et (username : standard_user  // Password : secret_sauce)
    3. "Sauce Labs Backpack" mehsulunu sebete elave et
    4. "Sauce Labs Bolt T-Shirt" mehsulunu elave et
    5. Sebete get
    6. Elave edilmis mehsullarin sebetde oldugunu dogrula (Backpack,T-Shirt sozlerinin kecdiyini )
        2 ferqli Assertion teleb olunur
    // Todo 4 may tarixinde tehvil verilecek
    7. "CheckOut" duymesine klikle
    8. Istifadeci melumatini doldur
    9. "Continue" duymesine klikle
    10. Buradaki her mehsulun cemini tapin ve "Item total" deyerine beraberliyini Assert edin
     */
    @Test
    public void Test1(){
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));

        login.click();
        MyFunc.wait(5);

        WebElement order1Add = driver.findElement
                (By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']"));
        order1Add.click();
        MyFunc.wait(2);
        WebElement order2Add = driver.findElement
                (By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        order2Add.click();
        MyFunc.wait(2);
        WebElement cartGood = driver.findElement
                (By.xpath("//*[@class='shopping_cart_link']"));
        cartGood.click();
        MyFunc.wait(2);
        WebElement order1 = driver.findElement
                (By.xpath("//div[text()='Sauce Labs Backpack']"));

        WebElement order2 = driver.findElement
                (By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));

        Assert.assertTrue("Backpack mehsulu tapilmadi",order1.getText().contains("Backpack"));
        Assert.assertTrue("T-Shirt mehsulu tapilmadi", order2.getText().contains("T-Shirt"));

        gozleBagla();
    }
}

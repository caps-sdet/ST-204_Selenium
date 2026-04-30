package Gun_08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _10_Sual extends BaseDriver {

    // Todo 4 maya qeder yalniz Actions istifade ederek
    // Bu sayta gedin : https://www.mediamarkt.com.tr/
    // Menyuya gederek, ordan "Beyaz Esya" bolmesine hover over edib
    // Kombilere klikleyin.
    // Gedilen sehifenin URL-sinde kombiler sozunun oldugunu Assert edin
    // Actions classi ile edilmelidir

    @Test
    public void Test1() {
        driver.get("https://www.mediamarkt.com.tr/");


        MyFunc.wait(2);
        gozleBagla();
    }
}

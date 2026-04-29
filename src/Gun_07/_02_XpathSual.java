package Gun_07;

import Utility.BaseDriver;
import org.junit.Test;

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
     */
    @Test
    public void Test1(){
        driver.get("https://www.saucedemo.com/");

        gozleBagla();
    }
}

package Gun10;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Soru extends BasicStaticDriver {
    public static void main(String[] args) {
        /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */


        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6 = driver.findElement(By.xpath("//a[text()=\"Samsung galaxy s6\"]"));
        s6.click();

        WebElement addCart = driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]"));
        addCart.click();

        driver.switchTo().alert().accept();






    }
}

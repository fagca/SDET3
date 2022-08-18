package Gun11;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru1 extends BasicStaticDriver {
    public static void main(String[] args) {

        /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id=\"topic\"]~input"));
        input.sendKeys("Türkiye");


        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.xpath("//input[@id=\"a\"]"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1); // son elemanı seçtik


        bekleKapat();






    }
}

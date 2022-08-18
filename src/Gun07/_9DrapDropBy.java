package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _9DrapDropBy extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement element = driver.findElement(By.xpath("(//*[@id='slider-range']//following-sibling::span)[1]"));

        bekle(1);
        Actions aksiyonlar   = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDropBy(element,100,0).build();
        aksiyon.perform();

        bekleKapat();
    }
}

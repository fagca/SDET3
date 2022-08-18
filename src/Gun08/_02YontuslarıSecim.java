package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02YontuslarıSecim extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element)
                .click()
                .sendKeys("b")
                .build();

        aksiyon.perform();

        bekle(2);
        aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        bekleKapat();

    }
}

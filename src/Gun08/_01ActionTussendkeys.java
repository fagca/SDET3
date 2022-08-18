package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01ActionTussendkeys extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("f")
                .keyUp(Keys.SHIFT)
                .sendKeys("erhat")
                .build();

        bekle(2);
        aksiyon.perform();






        bekleKapat();



    }
}

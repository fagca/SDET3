package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _7RightClick extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).contextClick().build();
        bekle(2);

        aksiyon.perform();
    }
}

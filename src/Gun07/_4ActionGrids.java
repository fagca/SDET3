package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _4ActionGrids extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        bekle(2);


        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();
        bekle(1);
        Actions aksiyonlar =  new Actions(driver);
        bekle(1);
        aksiyonlar.moveToElement(element).click().build();


    }
}

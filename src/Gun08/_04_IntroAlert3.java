package Gun08;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert3 extends BasicStaticDriver {
    public static void main(String[] args) {

        bekle(1);
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]"));
        element.click();

        bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("ferhat");
        bekle(3);
        driver.switchTo().alert().accept();

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("ferhat"));


        bekleKapat();
    }
}

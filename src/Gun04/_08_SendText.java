package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SendText extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        bekle(1);

        WebElement element = driver.findElement(By.partialLinkText("thanks"));
        element.click();

        WebElement txtBox = driver.findElement(By.id("user-message"));
        txtBox.sendKeys("Merhaba Selenium");

        WebElement btn = driver.findElement(By.className("btn-default"));
        btn.click();
        bekle(1);

        WebElement msg = driver.findElement(By.id("display"));
        if (msg.getText().contains("Merhaba Selenium"))
            System.out.println("Test çalışıyor");
        else System.out.println("Test failed!");









        bekleKapat();
    }
}

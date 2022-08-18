package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev2 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("username"));
        element.sendKeys("ttechno@gmail.com");

        WebElement element2 = driver.findElement(By.id("password"));
        element2.sendKeys("techno123.");

        WebElement element3 = driver.findElement(By.id("log-in"));
        element3.click();

        WebElement element4 = driver.findElement(By.id("time"));

        if (element4.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Your nearest branch closes in: 30m 5s is checked");
        else System.out.println("not found!");







        //bekleKapat();
    }
}

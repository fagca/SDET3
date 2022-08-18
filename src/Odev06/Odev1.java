package Odev06;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
        element.sendKeys("Automation");

        WebElement element1 = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
        element1.sendKeys("Testing@gmail.com");

        WebElement element2 = driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
        element2.sendKeys("Testing Current Address");

        WebElement element3 = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        element3.sendKeys("Testing Permanent Address");

        WebElement element4 = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        element4.click();

        String text = "Testing@gmail.com";

        WebElement element5 = driver.findElement(By.xpath("//p[@id=\"email\"]"));

        Assert.assertTrue(element5.getText() == text);
        bekleKapat();





    }

}

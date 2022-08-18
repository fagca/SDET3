package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/text-box");


        WebElement element = driver.findElement(By.id("userName"));
        element.sendKeys("Automation");

        WebElement element2 = driver.findElement(By.id("userEmail"));
        element2.sendKeys("Testing@campus.com");

        WebElement element3 = driver.findElement(By.id("currentAddress"));
        element3.sendKeys("Testing Current Address");

        WebElement element4 = driver.findElement(By.id("permanentAddress"));
        element4.sendKeys("Testing Permanent Address");

        WebElement element5 = driver.findElement(By.id("submit"));
        element5.click();

      WebElement element6 = driver.findElement(By.xpath("//p[@id=\"name\"]"));
      System.out.println(element6.getText());

        WebElement element7 = driver.findElement(By.xpath("//p[@id=\"email\"]"));

        System.out.println(element7.getText());



     // WebElement element7 = driver.findElement()


        //p[@id='name']


        //bekleKapat();
    }
}

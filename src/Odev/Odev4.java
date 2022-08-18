package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev4 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement element = driver.findElement(By.id("calculate"));
        element.click();

        WebElement element1 = driver.findElement(By.id("number1"));
        element1.sendKeys("2134324");

        WebElement element2 = driver.findElement(By.id("number2"));
        element2.sendKeys("1423432");

        WebElement element3 = driver.findElement(By.id("Calculate"));
        element3.click();

        WebElement element4 = driver.findElement(By.id("answer"));
        System.out.println(element4.getText());

        //WebElement element4 =






        //bekleKapat();
    }
}

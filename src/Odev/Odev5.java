package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev5 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element = driver.findElement(By.id("fakealerttest"));
        element.click();

        WebElement element1 = driver.findElement(By.id("fakealert"));
        element1.click();

        WebElement element2 = driver.findElement(By.id("dialog-ok"));
        element2.click();











        //bekleKapat();
    }
}

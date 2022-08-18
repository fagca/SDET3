package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev6 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element = driver.findElement(By.id("fakealerttest"));
        element.click();

        WebElement element1 = driver.findElement(By.id("fakealert"));
        element1.click();

        WebElement element2 = driver.findElement(By.id("dialog-ok"));
        element2.click();

        WebElement element3 = driver.findElement(By.id("modaldialog"));
        element3.click();

        WebElement element4= driver.findElement(By.id("dialog-ok"));
        element4.click();





        //bekleKapat();
    }
}

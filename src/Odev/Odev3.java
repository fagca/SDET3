package Odev;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("inputValEnter"));
        element.sendKeys("teddy bear");

        WebElement element1 = driver.findElement(By.className("sd-icon-search-under-catagory"));
        element1.click();

        WebElement element2 = driver.findElement(By.className("nnn"));
        if (element2.getText().contains("We've got 295 results for 'teddy bear'"))
            System.out.println("We've got 295 results for 'teddy bear' is checked");
        else System.out.println("is not checked");



        //bekleKapat();
    }
}

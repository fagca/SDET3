package Gun05;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;

public class _01_CssSelector extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement element = driver.findElement(By.id("u_1fG_4586_0"));
        element.click();

        WebElement element1 = driver.findElement(By.id("u_1fG_4588"));
        element1.click();



    WebElement element2 = driver.findElement(By.cssSelector("[value='Online Advertising']"));
     element2.click();



        WebElement element3 = driver.findElement(By.id("u_1fG_89585_0"));
        element3.click();

        WebElement element4 = driver.findElement(By.cssSelector("label [id='u_1fG_4589_0']"));
        element4.click();

     // WebElement element5 = driver.findElement(By.id("u_1fG_4597"));
     // element5.click();

        WebElement element6 = driver.findElement(By.cssSelector("[id='u_1fG_4597']> :nth-child(4)"));
        element6.click();


        bekleKapat();







    //id için
        //By.id("get-input")
        //cssSelector
        //By.cssSelector("id='get-input'")
        //By.cssSelector("#get-input")
    }
}

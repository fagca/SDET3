package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _1GetAttiribute extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement element = driver.findElement(By.id("inputValEnter"));

        System.out.println(element.getAttribute("name"));
        System.out.println(element.getAttribute("type"));
        System.out.println(element.getAttribute("class"));

        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("background"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getCssValue("height"));

        bekleKapat();


    }
}

package Gun05;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector_Soru extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement element = driver.findElement(By.cssSelector("div [placeholder=\"Full Name\"]"));
        element.sendKeys("Automation");

        WebElement element1 = driver.findElement(By.cssSelector("div [placeholder=\"name@example.com\"]"));
        element1.sendKeys("Testing@techno.com");

        WebElement element2 = driver.findElement(By.cssSelector("div [placeholder=\"Current Address\"]"));
        element2.sendKeys("Testing Current Address");

        WebElement element3 = driver.findElement(By.cssSelector("div [id=\"permanentAddress-wrapper\"] [class=\"form-control\"]"));
        element3.sendKeys("Testing Permanent Address");

        WebElement element4 = driver.findElement(By.cssSelector("div [class=\"mt-2 justify-content-end row\"] [class=\"btn btn-primary\"]"));
        element4.click();





    }
}

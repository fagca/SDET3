package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _06_ScrollToWebElement extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        JavascriptExecutor js = (JavascriptExecutor)driver;



        WebElement element = driver.findElement(By.xpath("//a[text()=\"View All Selenium Tutorials\"]"));
        js.executeScript("arguments[0].scrollIntoView()", element); // element'e kadar scroll yapar

        js.executeScript("arguments[0].click()");





        bekleKapat();
    }
}

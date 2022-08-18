package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.xpath("//div[@id=\"search-input\"]//input[@id=\"search\"]"));
        search.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]//yt-icon[@class=\"style-scope ytd-searchbox\"]"));
        searchButton.click();




        List<WebElement> tags = driver.findElements(By.xpath("//div[@id=\"title-wrapper\"]//yt-formatted-string"));
        int i = 0;

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


      for (WebElement w: tags
           ) {

          i++;
      }
        System.out.println("i = " + i);

    }
}

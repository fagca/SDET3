package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FridayProject_3_Hepsi_Ferhat extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"contact\"]")));
    // WebElement addChartEbook = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
    // addChartEbook.click();


    // WebElement frameCard = driver.findElement(By.xpath("//iframe[@class=\"EJIframeV3 EJOverlayV3\"]"));
    // driver.switchTo().frame(frameCard);

    // WebElement cartItemNo = driver.findElement(By.xpath("//ion-icon[@name=\"share\"]/following-sibling::span[@class=\"Cart-Items-Nos\"]"));
    // Assert.assertEquals("1",cartItemNo.getText());


    // WebElement removeButton = driver.findElement(By.cssSelector("[class=\"Product-Remove\"]"));
    // removeButton.click();

    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Your Cart is empty\"]")));

    // WebElement continueShipping = driver.findElement(By.cssSelector("[class=\"Continue-Button Close-Cart\"]"));
    // continueShipping.click();

    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"contact\"]")));


        bekle(1);
        WebElement mainPageItemNo = driver.findElement(By.cssSelector("[class=\"contact\"]"));
        mainPageItemNo.click();

        //Assert.assertEquals("0",mainPageItemNo.getText());

        bekleKapat();



    }
}

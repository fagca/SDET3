package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FridayProject_3_2 extends BasicStaticDriver {
    public static void main(String[] args) {

         driver.get("https://shopdemo.e-junkie.com/");

         bekle(2);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()=\"Demo eBook\"]//following::button[1]")));
         WebElement addChartDemoEBook = driver.findElement(By.xpath("//h4[text()=\"Demo eBook\"]//following::button[1]"));
         addChartDemoEBook.click();

         driver.switchTo().frame(4);

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"Apply-Button Show-Promo-Code-Button\"]")));
         WebElement addPromoCode = driver.findElement(By.xpath("//button[@class=\"Apply-Button Show-Promo-Code-Button\"]"));
         addPromoCode.click();

         bekle(1);

         WebElement promodeCodeWrite = driver.findElement(By.xpath("//input[@class=\"Promo-Code-Value\"]"));
         promodeCodeWrite.sendKeys("123456789");

         WebElement apply = driver.findElement(By.xpath("//button[@class=\"Promo-Apply\"]"));
         apply.click();

         WebElement invalidPromode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));
         System.out.println(invalidPromode.getText());

         String invalidPromode2 = "Invalid promo code";

         Assert.assertEquals(invalidPromode.getText(),invalidPromode2);
         bekleKapat();


         bekleKapat();


    }
}

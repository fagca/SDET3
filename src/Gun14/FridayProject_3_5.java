package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FridayProject_3_5 extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("https://shopdemo.e-junkie.com/");


        WebElement addChartDemoEBook = driver.findElement(By.xpath("//h4[text()=\"Demo eBook\"]//following::button[1]"));
        addChartDemoEBook.click();

        bekle(2);

        driver.switchTo().frame(4);
        driver.findElement(By.cssSelector("button[class='Payment-Button CC']")).click();

        bekle(1);

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fakedatas@gmail.com");

        driver.findElement(By.cssSelector("input[placeholder='Confirm Email']")).sendKeys("fakedatas@gmail.com");

        driver.findElement(By.cssSelector("input[placeholder='Name On Card']")).sendKeys("fakefake");

        driver.findElement(By.cssSelector("input[placeholder='Optional']")).sendKeys("123456789");

        driver.findElement(By.cssSelector("input[autocomplete='company']")).sendKeys("TechnoStdy");

        WebElement iframe = driver.findElement(By.cssSelector("[class='__PrivateStripeElement']>iframe"));
        driver.switchTo().frame(iframe);

        WebElement cardNumber = driver.findElement(By.cssSelector("[name='cardnumber']"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement aaYY = driver.findElement(By.cssSelector("[name='exp-date']"));
        aaYY.sendKeys("12/22");

        WebElement cvc = driver.findElement(By.cssSelector("[name='cvc']"));
        cvc.sendKeys("000");

        driver.switchTo().defaultContent();

        WebElement iframepay = driver.findElement(By.xpath("//iframe[@class=\"EJIframeV3 EJOverlayV3\"]"));
        driver.switchTo().frame(iframepay);

        WebElement pay2 = driver.findElement(By.xpath("//button[text()=\"Pay 0.50 USD\"]"));
        pay2.click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.textToBe(By.xpath("//span[@class=\"green_text_margin\"]"), " your order is confirmed. Thank you!\"" ));

        WebElement thankYou = driver.findElement(By.xpath("//span[@class=\"green_text_margin\"]"));

        Assert.assertTrue(thankYou.getText().equals(" your order is confirmed. Thank you!"));

        bekleKapat();
    }
}

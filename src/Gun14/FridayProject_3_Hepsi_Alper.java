package Gun14;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FridayProject_3_Hepsi_Alper extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("https://shopdemo.e-junkie.com/");

       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='contact']")));

        WebElement demoEbookButton = driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]"));
        demoEbookButton.click();

       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));

        driver.switchTo().frame(4);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Product-Quantity-Value readOnly']")));

        WebElement demoQuantity = driver.findElement(By.cssSelector("[class='Product-Quantity-Value readOnly']"));

        Assert.assertEquals(demoQuantity.getAttribute("value"),"1");


        WebElement demoButton = driver.findElement(By.cssSelector("[class='Product-Remove']"));
        demoButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Your Cart is empty']")));

        WebElement continueShopButton = driver.findElement(By.cssSelector("[class='Continue-Button Close-Cart']"));

        continueShopButton.click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='contact']")));

        demoEbookButton.click();

        driver.switchTo().frame(4);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Apply-Button Show-Promo-Code-Button']")));

        WebElement promoCodeButton = driver.findElement(By.cssSelector("[class='Apply-Button Show-Promo-Code-Button']"));
        promoCodeButton.click();

        String promoCode = "123456789";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Promo-Code-Value']")));

        WebElement promoCodeInput = driver.findElement(By.cssSelector("[class='Promo-Code-Value']"));
        promoCodeInput.sendKeys(promoCode);

        WebElement promoCodeApplyButton = driver.findElement(By.cssSelector("[class='Promo-Apply']"));
        promoCodeApplyButton.click();

        String invaildPromoCode = "Invalid promo code";

        WebElement snackBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));

        Assert.assertEquals(snackBar.getText(),invaildPromoCode);

        WebElement containerCloseIcon = driver.findElement(By.cssSelector("[class='Close Close-Cart Desktop-Only md hydrated']"));

        containerCloseIcon.click();

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='contact']")));

        demoEbookButton.click();

        driver.switchTo().frame(4);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Payment-Button CC']")));

        WebElement debbitCardButton = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        debbitCardButton.click();

        WebElement payButton = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        payButton.click();

        String snackBarValidateMessage = "Invalid Email\nInvalid Email\nInvalid Billing Name";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));
        snackBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));

        Assert.assertEquals(snackBar.getText(),snackBarValidateMessage);

        containerCloseIcon = driver.findElement(By.cssSelector("[class='Close Close-Cart Desktop-Only md hydrated']"));

        containerCloseIcon.click();


    //  driver.switchTo().defaultContent();

    //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));

    //  demoEbookButton.click();

    //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));

    //  driver.switchTo().frame(4);


    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Payment-Button CC']")));

    //  debbitCardButton = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));

    //  debbitCardButton.click();

    //  driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("alperes13@hotmail.com");
    //  driver.findElement(By.cssSelector("[placeholder='Confirm Email']")).sendKeys("alperes13@hotmail.com");
    //  driver.findElement(By.cssSelector("[placeholder='Name On Card']")).sendKeys("Alper");
    //  driver.findElement(By.cssSelector("[class='Billing-Phone Inline']>input")).sendKeys("123-456-7890");
    //  driver.findElement(By.cssSelector("[class='Billing-Company']>input")).sendKeys("Techno Study");

    //  driver.switchTo().frame(2);

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Kart numarası']")));

    //  WebElement creditCardInput = driver.findElement(By.cssSelector("[placeholder='Kart numarası']"));
    //  creditCardInput.sendKeys("1111 1111 1111 1111");


    //  driver.switchTo().defaultContent();
    //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));
    //  driver.switchTo().frame(4);


    //  payButton = driver.findElement(By.cssSelector("[class='Pay-Button']"));
    //  payButton.click();

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));
    //  snackBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='SnackBar']>span")));

    //  Assert.assertEquals(snackBar.getText(),"Kart numaranız geçersiz.");

    //  containerCloseIcon = driver.findElement(By.cssSelector("[class='Close Close-Cart Desktop-Only md hydrated']"));

    //  containerCloseIcon.click();


    //  driver.switchTo().defaultContent();

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='contact']")));

    //  demoEbookButton.click();

    //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));
    //  driver.switchTo().frame(4);

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Payment-Button CC']")));

    //  debbitCardButton = driver.findElement(By.cssSelector("[class='Payment-Button CC']"));

    //  debbitCardButton.click();

    //  driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("alperes13@hotmail.com");
    //  driver.findElement(By.cssSelector("[placeholder='Confirm Email']")).sendKeys("alperes13@hotmail.com");
    //  driver.findElement(By.cssSelector("[placeholder='Name On Card']")).sendKeys("Alper");
    //  driver.findElement(By.cssSelector("[class='Billing-Phone Inline']>input")).sendKeys("123-456-7890");
    //  driver.findElement(By.cssSelector("[class='Billing-Company']>input")).sendKeys("Techno Study");

    //  driver.switchTo().frame(2);

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Kart numarası']")));

    //  creditCardInput = driver.findElement(By.cssSelector("[placeholder='Kart numarası']"));
    //  creditCardInput.sendKeys("4242 4242 4242 4242");


    //  driver.findElement(By.cssSelector("[placeholder='AA / YY']")).sendKeys("1222");
    //  driver.findElement(By.cssSelector("[placeholder='CVC']")).sendKeys("000");


    //  driver.switchTo().defaultContent();
    //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe"))));
    //  driver.switchTo().frame(4);

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Pay-Button']")));

    //  payButton = driver.findElement(By.cssSelector("[class='Pay-Button']"));
    //  payButton.click();

    //  driver.switchTo().defaultContent();

    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='confirme_text']")));

    //  WebElement thankYou = driver.findElement(By.cssSelector("[class='confirme_text']>span"));
    //  Assert.assertEquals(thankYou.getText(),"your order is confirmed. Thank you!");



        bekleKapat();




    }
}

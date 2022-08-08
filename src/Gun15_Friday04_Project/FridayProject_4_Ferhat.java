package Gun15_Friday04_Project;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FridayProject_4_Ferhat extends BasicStaticDriver {

    public static void main(String[] args) throws AWTException {


        driver.get("http://demowebshop.tricentis.com/");

        driver.manage().window().maximize();

        By loginGeneral =  By.cssSelector("[class=\"ico-login\"");

        //SENARYO 1

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"ico-login\"")));
        WebElement login = driver.findElement(loginGeneral);
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("ozan@testmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123456789");

        password.submit();

        WebElement emailCorrection = driver.findElement(By.cssSelector("[class=\"account\""));
        Assert.assertEquals("ozan@testmail.com",emailCorrection.getText());



        //SENARYO 2

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"ico-logout\"")));
        WebElement logout = driver.findElement(By.cssSelector("[class=\"ico-logout\""));
        logout.click();

        login = driver.findElement(loginGeneral);
        login.click();

        email = driver.findElement(By.id("Email"));
        email.sendKeys("ozan1@testmail.com");

        password = driver.findElement(By.id("Password"));
        password.sendKeys("1234567891");
        password.submit();

        WebElement warning1 = driver.findElement(By.cssSelector("[class=\"validation-summary-errors\"]>span"));
        WebElement warning2 = driver.findElement(By.cssSelector("[class=\"validation-summary-errors\"]>ul>li"));

        Assert.assertTrue(warning1.getText().contains("unsuccessful"));
        Assert.assertTrue(warning2.getText().contains("account"));

        // SENARYO 3

        email = driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys("ozan@testmail.com");

        password = driver.findElement(By.id("Password"));
        password.sendKeys("123456789");
        password.submit();

        WebElement shoppingCardCheck = driver.findElement(By.cssSelector("[class=\"cart-qty\""));
        int shoppingCardCheckInt = Integer.parseInt(shoppingCardCheck.getText().replaceAll("[^0-9]",""));
        System.out.println("shoppingCardCheckInt = " + shoppingCardCheckInt);

    // if (shoppingCardCheckInt>0)
    // {
    //     WebElement shoppingBtn = driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]"));
    //     shoppingBtn.click();
    //     wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name=\"removefromcart\"")));
    //     WebElement removeClickShopping = driver.findElement(By.cssSelector("[name=\"removefromcart\""));
    //     removeClickShopping.click();

    //     WebElement updateShoppingCard = driver.findElement(By.cssSelector("[class=\"button-2 update-cart-button\""));

    //     wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"ico-logout\"")));
    //     logout = driver.findElement(By.cssSelector("[class=\"ico-logout\""));
    //     logout.click();
    // }


        WebElement laptopAdd = driver.findElement(By.xpath("(//*[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));
        laptopAdd.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"content\"")));
        WebElement addSuccessCheck = driver.findElement(By.cssSelector("[class=\"content\""));
        Assert.assertTrue(addSuccessCheck.getText().contains("added"));


        WebElement shoppingBtn = driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]"));
        shoppingBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("termsofservice")));
        WebElement termsOfService = driver.findElement(By.id("termsofservice"));
        termsOfService.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement cnt1 = driver.findElement(By.cssSelector("[onclick=\"Billing.save()\""));
        cnt1.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("PickUpInStore")));
        WebElement instorePickupBtn = driver.findElement(By.id("PickUpInStore"));
        instorePickupBtn.click();

        WebElement cnt2 = driver.findElement(By.cssSelector("[onclick=\"Shipping.save()\""));
        cnt2.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[onclick=\"PaymentMethod.save()\"")));
        WebElement cnt3 = driver.findElement(By.cssSelector("[onclick=\"PaymentMethod.save()\""));
        cnt3.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[onclick=\"PaymentInfo.save()\"")));
        WebElement cnt5 = driver.findElement(By.cssSelector("[onclick=\"PaymentInfo.save()\""));
        cnt5.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[onclick=\"ConfirmOrder.save()\"")));
        WebElement cnt6 = driver.findElement(By.cssSelector("[onclick=\"ConfirmOrder.save()\""));
        cnt6.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class=\"title\"]>strong"),"successfully"));
        WebElement sucsess = driver.findElement(By.cssSelector("[class=\"title\"]>strong"));
        Assert.assertTrue(sucsess.getText().contains("success"));

        bekleKapat();

    }
}

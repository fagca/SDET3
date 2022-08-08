package Gun15_Friday04_Project;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FridayProject_4_Together extends BasicStaticDriver {

    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        By passwordGeneral = By.id("Password");

        //SENARYO 1
        WebElement logIn = driver.findElement(By.linkText("Log in"));
        logIn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));

        WebElement eMail = driver.findElement(By.id("Email"));
        eMail.sendKeys("ozan@testmail.com");

        WebElement password = driver.findElement(passwordGeneral);
        password.sendKeys("123456789");

        password.submit();

        WebElement registerEmail = driver.findElement(By.cssSelector("[class='account']"));

        Assert.assertEquals("ozan@testmail.com", registerEmail.getText());


        //SENARYO2

        WebElement logOut = driver.findElement(By.linkText("Log out"));
        logOut.click();

        logIn = driver.findElement(By.linkText("Log in"));
        logIn.click();

        eMail = driver.findElement(By.id("Email"));
        eMail.sendKeys("ozan1@testmail.com");

        password = driver.findElement(passwordGeneral);
        password.sendKeys("1234567890");
        password.submit();

        WebElement warning = driver.findElement(By.cssSelector("[class='validation-summary-errors']>ul>li"));
        WebElement warning2 = driver.findElement(By.cssSelector("[class='validation-summary-errors']"));

        Assert.assertTrue(warning.getText().contains("No customer account found"));
        Assert.assertTrue(warning2.getText().contains("unsuccessful"));

        //SENARYO3


        eMail = driver.findElement(By.id("Email"));
        eMail.clear();
        eMail.sendKeys("ozan@testmail.com");

        password = driver.findElement(By.id("Password"));
        password.sendKeys("123456789");
        password.submit();

        WebElement giftCard = driver.findElement(By.cssSelector("[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]"));
        giftCard.click();

        WebElement reName = driver.findElement(By.id("giftcard_2_RecipientName"));
        reName.sendKeys("Alper EÅŸ");

        WebElement reEmail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
        reEmail.sendKeys("alperes@gmail.com");

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-2"));
        addToCartButton.click();

        WebElement sepet = driver.findElement(By.cssSelector("[class='cart-label']"));
        sepet.click();

        WebElement terms = driver.findElement(By.id("termsofservice"));
        terms.click();

        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();

        //wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.id("BillingNewAddress_CountryId"))));
        WebElement countries = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select dropDownMenu = new Select(countries);
        dropDownMenu.selectByVisibleText("Turkey");

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Ä°zmir");

        WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("Urla");

        WebElement zipCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("35000");

        WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNum.sendKeys("12345678900");

        WebElement ctnBtn = driver.findElement(By.cssSelector("[class=\"button-1 new-address-next-step-button\"]"));
        ctnBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='paymentmethod_0']")));

        ctnBtn = driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
        ctnBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='checkout-payment-info-load'] p")));

        ctnBtn = driver.findElement(By.cssSelector("[class='button-1 payment-info-next-step-button']"));
        ctnBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='title'] strong")));

        WebElement confrimBtn = driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']"));
        confrimBtn.click();

        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Your order has been successfully processed!']")));

        System.out.println("title.getText() = " + title.getText());

        Assert.assertTrue(title.getText().contains("successfully"));

        bekleKapat();
    }



}

package Gun07;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _3DersFacebook extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
        element.click();

        WebElement element1 = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        element1.sendKeys("ferhat");

        WebElement element2 = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        element2.sendKeys("aga");

        WebElement preEmail = driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
        System.out.println(preEmail.isDisplayed());


        WebElement element3 = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        element3.sendKeys("aga@gmail.com");

        WebElement reEmail = driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));

        Assert.assertTrue(preEmail != reEmail);

        bekleKapat();







        //bekleKapat();

    }
}

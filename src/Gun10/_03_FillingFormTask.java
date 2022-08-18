package Gun10;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BasicStaticDriver {
    public static void main(String[] args) {

        /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.xpath("//input[@id=\"title\"]"));
        name.sendKeys("Ferhat");

        WebElement comment = driver.findElement(By.xpath("//textarea[@id=\"description\"]"));
        comment.sendKeys("waht did you yesterday?");

        WebElement submit = driver.findElement(By.xpath("//input[@id=\"btn-submit\"]"));
        submit.click();

        WebElement text = driver.findElement(By.xpath("//div[@id=\"submit-control\"]"));


        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id=\"submit-control\"]"), "Form submited Successfully!" ));

        System.out.println(text.getText());

        Assert.assertEquals("Form submited Successfully!",text.getText());

        //bekleKapat();


    }
}

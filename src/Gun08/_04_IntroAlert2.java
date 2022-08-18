package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert2 extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]"));
        element.click();

        bekle(1);
        driver.switchTo().alert().dismiss();
        bekle(1);
        bekleKapat();





    }
}

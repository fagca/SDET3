package Gun08;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03Ornek extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.etsy.com/");


        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']")); //başlangıçtaki cookises ekranı
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        WebElement element = driver.findElement(By.xpath("//span[@id=\"catnav-primary-link-10855\"]"));
        WebElement neckless = driver.findElement(By.xpath("//span[@id=\"side-nav-category-link-10873\"]"));
        WebElement bibNeckless = driver.findElement(By.xpath("//a[@id=\"catnav-l3-10881\"]"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element).build();
        aksiyon.perform();
        bekle(1);
        Action aksiyon2 = aksiyonlar.moveToElement(neckless).build();
        aksiyon2.perform();
        bekle(1);
        Action aksiyon3 = aksiyonlar.moveToElement(bibNeckless).build();
        aksiyon3.perform();

        WebElement bibNecklessText = driver.findElement(By.xpath("//a[@id=\"catnav-l3-10881\"]"));
        System.out.println(bibNecklessText.getText());

        Assert.assertTrue(bibNecklessText.getText().contains("Bib"));


        bekleKapat();

    }
}

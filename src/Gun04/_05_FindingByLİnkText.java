package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindingByLİnkText extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.linkText("Siparişlerim")); //sadece <a> taglerinde çalışır
        System.out.println(element.getText());

        System.out.println("element.getAttribute(title) = " + element.getAttribute("title"));
        System.out.println("element.getAttribute(href) = " + element.getAttribute("href"));
        System.out.println("element.getAttribute(rel) = " + element.getAttribute("rel"));

        WebElement element2 = driver.findElement(By.partialLinkText("Süper Fiyat")); //sadece <a> taglerinde çalıyor
        System.out.println(element2.getText());










        bekleKapat();
    }
}

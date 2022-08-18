package Gun06;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.junit.Assert;

public class _02_Senaryo extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement element = driver.findElement(By.xpath("//input[@class=\"input_error form_input\"] [@placeholder=\"Username\"]"));
        element.sendKeys("standard_user");

        WebElement element1 = driver.findElement(By.xpath("//input[@class=\"input_error form_input\"] [@placeholder=\"Password\"]"));
        element1.sendKeys("secret_sauce");

        WebElement element2 = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        element3.click();

        WebElement element4 = driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        element4.click();

        WebElement element5 = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]"));
        element5.click();

        WebElement element6 = driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
        element6.click();

        WebElement element7 = driver.findElement(By.xpath("//button[@id=\"checkout\"]"));
        element7.click();

        WebElement element8 = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
        element8.sendKeys("ferhat");

        WebElement element9 = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
        element9.sendKeys("aga");

        WebElement element10 = driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
        element10.sendKeys("34000");

        WebElement element11 = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
        element11.click();

        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement e: elements
             ) {
            System.out.println("elements = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        WebElement element12 = driver.findElement(By.xpath("//*[@class=\"summary_tax_label\"]"));
        double elemen12Double = Double.parseDouble(element12.getText().substring(6));
        System.out.println("elemen12int = " + elemen12Double);

        toplam = toplam +elemen12Double;

        WebElement element13 = driver.findElement(By.xpath("//div[@class=\"summary_total_label\"]"));
        double element13Double = Double.parseDouble(element13.getText().substring(8));
        System.out.println("element13Double = " + element13Double);

        if (toplam == element13Double)
            System.out.println(" test passed ");
        else System.out.println(" test failed");

        Assert.assertTrue(toplam == element13Double+1);

        bekleKapat();

    }
}

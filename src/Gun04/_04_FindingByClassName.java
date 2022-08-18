package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_FindingByClassName extends BasicStaticDriver {
    public static void main(String[] args) {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.className("form-submit-button"));
        System.out.println(element.getText());

        WebElement element2 = driver.findElement(By.className("form-sub-label"));
        System.out.println(element2.getText());

        List<WebElement> elements = driver.findElements(By.className("form-sub-label")); //bulamazsa hata vermiyoriboş liste getiriyor.
        for (WebElement element3: elements
             ) {
            System.out.println(element3.getText());
        }













        bekleKapat();
    }


}

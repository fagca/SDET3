package Gun04;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _06_FindingElementByTag extends BasicStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement e: list
             ) {
            System.out.println("e.getText() = " + e.getText());
            
        }






        bekleKapat();
    }
}

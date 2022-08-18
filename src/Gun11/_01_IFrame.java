package Gun11;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_IFrame extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id=\"topic\"]~input"));
        input.sendKeys("Türkiye");

        //driver.switchTo().parentFrame(); // bir önceki sayfaya döner
        driver.switchTo().defaultContent(); // ilk sayfaya döner

        driver.switchTo().frame(1);

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1); // son elemanı seçtik







        bekleKapat();

    }
}

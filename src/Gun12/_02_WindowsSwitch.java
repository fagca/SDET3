package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");
        String anasayfaWindowId = driver.getWindowHandle();

        List<WebElement> elements = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement w: elements
        ) {
            if (!w.getAttribute("href").contains("mailto"))
                w.click();

        }

        Set<String> windowsId = driver.getWindowHandles();

        for (String id : windowsId)
        {
            if (id.equals(anasayfaWindowId)) continue; //anasayfa değilse

            driver.switchTo().window(id);
            System.out.println(id+"title = " + driver.getTitle());

        }

        bekle(1);
        bekleKapat();
    }
}

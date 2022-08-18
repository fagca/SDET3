package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        driver.manage().window().maximize();

     // WebElement element = driver.findElement(By.id("label_3"));
     // System.out.println(element.getText());

        WebElement element = driver.findElement(By.id("label_3"));
        System.out.println(element.getText());





        Thread.sleep(3000);

        driver.quit();

    }
}

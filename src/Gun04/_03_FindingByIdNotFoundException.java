package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        driver.manage().window().maximize();

        try {


            WebElement element = driver.findElement(By.id("label_"));
            System.out.println(element.getText());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }





        Thread.sleep(3000);
        driver.quit();

    }
}
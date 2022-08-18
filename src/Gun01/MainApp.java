package Gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://campus.techno.study/");
        driver.manage().window().maximize();



        Thread.sleep(3000);

        driver.quit();

    }
}

package Gun13;

import Utils.BasicStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class _02_EkranKaydet extends BasicStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("ferhat");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("ferhat");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage = driver.findElements(By.id("spanMessage"));

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        if (spanMessage.size()>0) //login olamadın hata ekran görüntüsünü saklayalım
        {
            System.out.println("login olamadaın çünkü hata mesajı gözüktü");
            TakesScreenshot ts = (TakesScreenshot) driver;

            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE); // SAKLAMA TİPİ SEÇİLDİ DOSYA DATABASE
            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri/LogınKontrol_"+now+".png")); //hoca discorddan verdi
            // buradaki dosya adını zamana bağlı hale getirin ki üzerine yazmasın.
        }


        bekleKapat();


    }
}

package Gun08;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BasicStaticDriver {
    public static void main(String[] args) {


        /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        element.click();

        bekle(1);
        driver.switchTo().alert().accept();
        bekleKapat();





    }
}

package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scroll extends BasicStaticDriver {
    public static void main(String[] args) {

        /*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */

        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)"); //    (x,y) sayfayı x kadar sağa, y kada aşşağıya kaydırır.

        bekle(1);

        js.executeScript("window.scrollBy(0,-1500)"); //    (x,y) sayfayı x kadar sağa, y kada aşşağıya kaydırır.






        bekleKapat();
    }
}

package Gun13;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotClass extends BasicStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");

        Robot rbt = new Robot();

        for (int i = 0; i <13 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); //tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB); //tuşa basıldı
            bekle(1);
        }

        bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);



        StringSelection stringSelection = new StringSelection("C:\\Users\\DELL\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i = 0; i <2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); //tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB); //tuşa basıldı
            bekle(1);
        }

        bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

         WebElement asser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

         Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));




    }
}

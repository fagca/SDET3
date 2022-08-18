package Gun13;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

public class _04_Task2 extends BasicStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://www.google.com/");

        Robot robot = new Robot();

        String googleId = driver.getWindowHandle();

        for (int i = 0; i <2; i++)
        {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_T);
        }

        bekle(1);

        Set<String> windowsId = driver.getWindowHandles();
        ArrayList<String> windowList = new ArrayList<>();

        for (String w: windowsId
             ) {
            if (w.equals(googleId)) continue;
            driver.switchTo().window(w);
            windowList.add(w);
        }

        driver.switchTo().window(windowList.get(1));
        bekle(1);
        driver.get("https://tr-tr.facebook.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));




    }
}

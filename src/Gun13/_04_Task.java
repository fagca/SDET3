package Gun13;

import Utils.BasicStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _04_Task extends BasicStaticDriver {
    public static void main(String[] args) throws AWTException {

       driver.get("https://demoqa.com/elements");

         Robot rbt = new Robot();

         for (int i = 0; i <3; i++) {
             driver.manage().window().maximize();
             rbt.keyPress(KeyEvent.VK_CONTROL);
             rbt.keyPress(KeyEvent.VK_T);
             bekle(1);
             rbt.keyRelease(KeyEvent.VK_CONTROL);
             rbt.keyRelease(KeyEvent.VK_T);
         }

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(2));
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        driver.switchTo().window(tabs.get(3));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


    }
}

package Gun07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _2ElemanStatu extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement element = driver.findElement(By.xpath("//input[@id=\"gwt-debug-cwCheckBox-Tuesday-input\"]"));

        System.out.println(element.isDisplayed());
        System.out.println(element.isEnabled());
        System.out.println(element.isSelected());


        element.click();
        System.out.println(element.isSelected());

        bekleKapat();



    }
}

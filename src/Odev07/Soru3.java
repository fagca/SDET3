package Odev07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        String kirmizi = "rgba(255, 0, 0, 1)";
        String yesil = "rgba(0, 128, 0, 1)";

        List<WebElement> itemList = driver.findElements(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        int z = 0;
        for (WebElement w: itemList
             ) {
            z++;
        }
        System.out.println("i = " + z);

        List<WebElement> boxesList = driver.findElements(By.xpath("//ul[@style=\"height: 72px;\"]"));
        int b = 0;
        for (WebElement w: boxesList
             ) {b++;
        }
        System.out.println("b = " + b);

        WebElement items = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        WebElement boxes = driver.findElement(By.xpath("//ul[@style=\"height: 72px;\"]"));

        Actions aksiyonlar = new Actions(driver);









    }
}

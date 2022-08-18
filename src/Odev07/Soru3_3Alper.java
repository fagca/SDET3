package Odev07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3_3Alper extends BasicStaticDriver {
    public static void main(String[] args) {



        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        bekle(2);

        List<WebElement> sehirler = driver.findElement(By.id("allItems")).findElements(By.tagName("li"));
        List<WebElement> ulkelerDiv = driver.findElement(By.id("dhtmlgoodies_mainContainer")).findElements(By.tagName("div"));

        Actions actions = new Actions(driver);


        for (WebElement sehir:sehirler) {
            for (WebElement ulkeDiv: ulkelerDiv) {

                Action action = actions.clickAndHold(sehir).build();
                action.perform();

                bekle(1);

                action = actions.moveToElement(ulkeDiv.findElement(By.tagName("ul"))).release().build();
                action.perform();

                if (sehir.getAttribute("class").equals("correctAnswer")){
                    break;
                }


            }
        }

        bekleKapat();
    }
}

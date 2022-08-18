package Odev07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3_1Alper extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        bekle(2);

        List<WebElement> ulkeler = driver.findElements(By.xpath("//*[@id='questionDiv']//div[@class='destinationBox']"));
        List<WebElement> sehirler = driver.findElements(By.xpath("//*[@id='answerDiv']//div"));

        Actions actions = new Actions(driver);

        for (WebElement sehir:sehirler){
            for (WebElement ulke:ulkeler){

                Action action = actions.clickAndHold(sehir).build();
                action.perform();

                bekle(1);

                action = actions.moveToElement(ulke).release().build();
                action.perform();

                // rgba(0, 128, 0, 1)

                if (sehir.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")){
                    break;
                }


            }
        }

        bekleKapat();
    }
}

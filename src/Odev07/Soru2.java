package Odev07;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru2 extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");


        WebElement teama = driver.findElement(By.xpath("//ul[@id=\"box1\"]"));
        WebElement teamb = driver.findElement(By.xpath("//ul[@id=\"box2\"]"));
        WebElement teamc = driver.findElement(By.xpath("//ul[@id=\"box3\"]"));
        WebElement teamd = driver.findElement(By.xpath("//ul[@id=\"box4\"]"));
        WebElement teame = driver.findElement(By.xpath("//ul[@id=\"box5\"]"));

        WebElement elements = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.clickAndHold(elements).moveToElement(teama).release(teama).build();
        aksiyon.perform();

        WebElement elements2 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar2 = new Actions(driver);
        Action aksiyon2 = aksiyonlar2.clickAndHold(elements2).moveToElement(teama).release(teama).build();
        aksiyon2.perform();

        WebElement elements3 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar3 = new Actions(driver);
        Action aksiyon3 = aksiyonlar3.clickAndHold(elements3).moveToElement(teama).release(teama).build();
        aksiyon3.perform();

        WebElement elements4 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar4 = new Actions(driver);
        Action aksiyon4 = aksiyonlar4.clickAndHold(elements4).moveToElement(teama).release(teama).build();
        aksiyon4.perform();

        //


        WebElement elements5 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar5 = new Actions(driver);
        Action aksiyon5 = aksiyonlar5.clickAndHold(elements5).moveToElement(teamb).release(teamb).build();
        aksiyon5.perform();

        WebElement elements6 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar6 = new Actions(driver);
        Action aksiyon6 = aksiyonlar6.clickAndHold(elements6).moveToElement(teamb).release(teamb).build();
        aksiyon6.perform();

        WebElement elements7 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar7 = new Actions(driver);
        Action aksiyon7 = aksiyonlar7.clickAndHold(elements7).moveToElement(teamb).release(teamb).build();
        aksiyon7.perform();

        WebElement elements8 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar8 = new Actions(driver);
        Action aksiyon8 = aksiyonlar8.clickAndHold(elements8).moveToElement(teamb).release(teamb).build();
        aksiyon8.perform();

        //

        WebElement elements9 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar9 = new Actions(driver);
        Action aksiyon9 = aksiyonlar9.clickAndHold(elements9).moveToElement(teamc).release(teamc).build();
        aksiyon9.perform();

        WebElement elements10 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar10 = new Actions(driver);
        Action aksiyon10 = aksiyonlar10.clickAndHold(elements10).moveToElement(teamc).release(teamc).build();
        aksiyon10.perform();

        WebElement elements11 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar11 = new Actions(driver);
        Action aksiyon11 = aksiyonlar11.clickAndHold(elements11).moveToElement(teamc).release(teamc).build();
        aksiyon11.perform();

        WebElement elements12 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar12 = new Actions(driver);
        Action aksiyon12 = aksiyonlar12.clickAndHold(elements12).moveToElement(teamc).release(teamc).build();
        aksiyon12.perform();

        //

        WebElement elements13 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar13 = new Actions(driver);
        Action aksiyon13 = aksiyonlar13.clickAndHold(elements13).moveToElement(teamd).release(teamd).build();
        aksiyon13.perform();

        WebElement elements14 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar14 = new Actions(driver);
        Action aksiyon14 = aksiyonlar14.clickAndHold(elements14).moveToElement(teamd).release(teamd).build();
        aksiyon14.perform();

        WebElement elements15 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar15 = new Actions(driver);
        Action aksiyon15 = aksiyonlar15.clickAndHold(elements15).moveToElement(teamd).release(teamd).build();
        aksiyon15.perform();

        WebElement elements16 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar16 = new Actions(driver);
        Action aksiyon16 = aksiyonlar16.clickAndHold(elements16).moveToElement(teamd).release(teamd).build();
        aksiyon16.perform();

        //

        WebElement elements17 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar17 = new Actions(driver);
        Action aksiyon17 = aksiyonlar17.clickAndHold(elements17).moveToElement(teamd).release(teamd).build();
        aksiyon17.perform();

        WebElement elements18 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar18 = new Actions(driver);
        Action aksiyon18 = aksiyonlar18.clickAndHold(elements18).moveToElement(teamd).release(teamd).build();
        aksiyon18.perform();

        WebElement elements19 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar19 = new Actions(driver);
        Action aksiyon19 = aksiyonlar19.clickAndHold(elements19).moveToElement(teamd).release(teamd).build();
        aksiyon19.perform();

        WebElement elements20 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar20 = new Actions(driver);
        Action aksiyon20 = aksiyonlar20.clickAndHold(elements20).moveToElement(teamd).release(teamd).build();
        aksiyon20.perform();

        WebElement elements21 = driver.findElement(By.xpath("//ul[@id=\"allItems\"]//child::li"));
        Actions aksiyonlar21 = new Actions(driver);
        Action aksiyon21 = aksiyonlar21.clickAndHold(elements21).moveToElement(teamd).release(teamd).build();
        aksiyon21.perform();

        //




    }
}

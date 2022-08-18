package Gun09;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Proje1 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("http://a.testaddressbook.com/");

        driver.manage().window().maximize();



        WebElement adress = driver.findElement(By.xpath("//a[@id=\"sign-in\"]"));
        adress.click();

        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("ferhat@outlook.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        password.sendKeys("ferhat");

        WebElement signin = driver.findElement(By.xpath("//input[@name=\"commit\"]"));
        signin.click();

        WebElement adressIn = driver.findElement(By.xpath("//a[@data-test=\"addresses\"]"));
        adressIn.click();

        WebElement newAdress = driver.findElement(By.xpath("//a[@class=\"row justify-content-center\"]"));
        newAdress.click();

        WebElement name = driver.findElement(By.xpath("//input[@name=\"address[first_name]\"]"));
        name.sendKeys("Fernando");

        WebElement lastname = driver.findElement(By.xpath("//input[@id=\"address_last_name\"]"));
        lastname.sendKeys("Torres");

        WebElement adress1 = driver.findElement(By.xpath("//input[@name=\"address[address1]\"]"));
        adress1.sendKeys("Anfield Rd");

        WebElement adress2 = driver.findElement(By.xpath("//input[@name=\"address[address2]\"]"));
        adress2.sendKeys("Anfield");

        WebElement adressCity = driver.findElement(By.xpath("//input[@id=\"address_city\"]"));
        adressCity.sendKeys("Liverpool");

        int randomNum = (int) (Math.random()*52);
        WebElement state = driver.findElement(By.xpath("//*[@id=\"address_state\"]/option["+randomNum+"]"));
        state.click();
        bekle(1);

        WebElement zipCode = driver.findElement(By.xpath("//input[@id=\"address_zip_code\"]"));
        zipCode.sendKeys("L4 0TH");

        WebElement country = driver.findElement(By.xpath("//input[@id=\"address_country_us\"]"));
        country.click();

    //  List<WebElement> state = driver.findElements(By.xpath("//select[@id=\"address_state\"]"));

    //  ArrayList<String> yenilist = new ArrayList<>();

    //  for (WebElement e: state
    //       )
    //  {
    //      System.out.println(e.getText());


    //  }

        WebElement date = driver.findElement(By.xpath("//input[@name=\"address[birthday]\"]"));
        date.sendKeys("20/03/1984");

        WebElement age = driver.findElement(By.xpath("//input[@name=\"address[age]\"]"));
        age.sendKeys("36");

        WebElement website = driver.findElement(By.xpath("//input[@name=\"address[website]\"]"));
        website.sendKeys("https://www.google.com");

        WebElement phone = driver.findElement(By.xpath("//input[@name=\"address[phone]\"]"));
        phone.sendKeys("8625747878");

        WebElement commonInterest = driver.findElement(By.xpath("//input[@id=\"address_interest_climb\"]"));
        commonInterest.click();

        WebElement commonInterestDancing = driver.findElement(By.xpath("//input[@id=\"address_interest_dance\"]"));
        commonInterestDancing.click();

        WebElement note = driver.findElement(By.xpath("//textarea[@id=\"address_note\"]"));
        note.sendKeys("Never back down");

        WebElement submit = driver.findElement(By.xpath("//input[@name=\"commit\"]"));
        submit.click();

        WebElement edit = driver.findElement(By.xpath("//a[@data-test=\"edit\"]"));
        edit.click();

        WebElement nameChange = driver.findElement(By.xpath("//input[@id=\"address_first_name\"]"));
        nameChange.click();
        nameChange.clear();
        nameChange.sendKeys("Peter");

        bekle(1);

        WebElement lastnameChange = driver.findElement(By.xpath("//input[@id=\"address_last_name\"]"));
        lastnameChange.click();
        lastnameChange.clear();
        lastnameChange.sendKeys("Crouch");

        WebElement upDate = driver.findElement(By.xpath("//input[@data-disable-with=\"Update Address\"]"));
        upDate.click();

        WebElement nameControl = driver.findElement(By.xpath("//span[@data-test=\"first_name\"]"));
        WebElement lastnameControl = driver.findElement(By.xpath("//span[@data-test=\"last_name\"]"));

        String adKontrol = "Peter";
        String soyadKontrol = "Crouch";


        Assert.assertTrue(nameControl.getText().equals(adKontrol));
        Assert.assertTrue(lastnameControl.getText().equals(soyadKontrol));


        WebElement adresses = driver.findElement(By.xpath("//a[@data-test=\"addresses\"]"));
        adresses.click();

  //  List<WebElement> destroyList = driver.findElements(By.xpath("//*[@data-confirm=\"Are you sure?\"]"));

  //  for (WebElement w: destroyList
  //       ) {

  //      bekle(1);
  //      w.click();
  //      bekle(1);
  //      driver.switchTo().alert().accept();

  //      bekle(1);

  //  }

  //   WebElement destroy = driver.findElement(By.xpath("//*[@data-confirm=\"Are you sure?\"]"));

  //   //destroy.click();
  //   bekle(1);
  //   driver.switchTo().alert().accept();
  //   bekle(1);

    //  WebElement destroy = driver.findElement(By.xpath("(//a[@data-confirm=\"Are you sure?\"])[1]"));
    //  System.out.println(destroy.isDisplayed());

    //  boolean isDisplayed = destroy.isDisplayed();

    //  destroy.click();
    //  bekle(1);
    //  driver.switchTo().alert().accept();

    //  WebElement destroy2 = driver.findElement(By.xpath("(//a[@data-confirm=\"Are you sure?\"])[1]"));
    //  boolean isDisplayedAfter = destroy2.isDisplayed();
    //  System.out.println(isDisplayedAfter);

    //  Assert.assertTrue(isDisplayedAfter != isDisplayed );

        WebElement destroy = driver.findElement(By.xpath("//*[text()='Destroy']"));
        bekle(1);

        destroy.click();
        bekle(1);

        driver.switchTo().alert().accept();
        bekle(1);

        WebElement verify = driver.findElement(By.xpath("//*[text()='Address was successfully destroyed.']"));
        Assert.assertTrue(verify.getText().equals("Address was successfully destroyed."));

        bekleKapat();
    }
}

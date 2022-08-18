package Gun11;

import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _03_Soru2 extends BasicStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");



        List<WebElement> calculation = driver.findElements(By.cssSelector("[id=\"selectOperationDropdown\"]>option"));

        WebElement integerSelect = driver.findElement(By.id("integerSelect"));
        integerSelect.click();

        for (WebElement w:calculation
             ) {
            w.click();

            for (int i = 0; i <5; i++)
            {
                WebElement firstNumber = driver.findElement(By.id("number1Field"));
                firstNumber.clear();
                String num1 = String.valueOf ((int) (Math.random()*100));
                firstNumber.sendKeys(num1);

                WebElement secondNumber = driver.findElement(By.id("number2Field"));
                secondNumber.clear();
                String num2 = String.valueOf ((int) (Math.random()*100));
                secondNumber.sendKeys(num2);

                WebElement calculate = driver.findElement(By.id("calculateButton"));
                calculate.click();

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));



                WebElement answerBox = driver.findElement(By.id("numberAnswerField"));
                String answer = answerBox.getAttribute("value");


                int number1int = Integer.parseInt(num1);
                double number1double = Double.parseDouble(num1);
                int number2int = Integer.parseInt(num2);
                double number2double = Double.parseDouble(num2);
                int answerInt = Integer.parseInt(answer);
                double answerDouble = Double.parseDouble(answer);

                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);
                System.out.println("num1/num2"+ (number1double/number2double));
                System.out.println("answer = " + answer);
                System.out.println("w.getText() = " + w.getText());

                if (w.getText().equals("Add"))
                {
                    Assert.assertTrue((number1int + number2int) == answerInt );
                } else if (w.getText().equals("Subtract"))
                {
                    Assert.assertTrue((number1int - number2int) == answerInt );
                }else if (w.getText().equals("Multiply"))
                {
                    Assert.assertTrue((number1int * number2int) == answerInt );
                } else if (w.getText().equals("Divide"))
                 {
                     Assert.assertTrue((number1int / number2int) == answerInt );
                 }else if (w.getText().equals("Concatenate"))
                 {
                     Assert.assertTrue((num1 + num2).equals(answer));
                 }

            }

        }
        bekleKapat();

    }
}

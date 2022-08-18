package Gun13;

import Utils.BasicStaticDriver;
import org.openqa.selenium.Dimension;

public class _03_WindowsSize extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        bekle(1);

        Dimension dim = new Dimension(500, 600);
        driver.manage().window().setSize(dim);


        bekleKapat();
    }
}

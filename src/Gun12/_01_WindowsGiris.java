package Gun12;

import Utils.BasicStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BasicStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.selenium.dev/");

        List<WebElement> elements = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement w: elements
             ) {
            if (!w.getAttribute("href").contains("mailto"))
                w.click();

        }

        Set<String> windowsID =  driver.getWindowHandles();

        for (String id:windowsID
             ) {
            System.out.println("id = " + id);
            
        }





        bekleKapat();

    }
}


   //  id = CDwindow-4948B341E435C3F6B55035FDCB11EDF8
   //  id = CDwindow-76051A258809162B890F0E04DF7CBC73
   //  id = CDwindow-F9EDB4F02C919B71FC8D19A1E0A8F39F
   //  id = CDwindow-5B135EBF19E835FE6C97DFDAF7F8CB75
   //  id = CDwindow-00319CB6435B988B419F9CFE1BEBF61A
   //  id = CDwindow-C4EE6C911BEDFB16EE746297D33CCCA3
   //  id = CDwindow-81E3D47C50233CBCABAE439F1D0D6911
   //  id = CDwindow-BA683E8C4F8EC98BEB3850B88D2FEBE4
   //  id = CDwindow-086C2A1003A294EC9F4755659BF25E4C
   //  id = CDwindow-3C1CA8C16CC5223C5D44F2F93BFC129D

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class hello {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\New folder (2)\\SeleniumPractice\\src\\test\\resources\\executables\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ironspider.ca/forms/dropdowns.htm");
        WebElement w = driver.findElement(By.name("coffee"));
        Select s=new Select(w);
        List<WebElement> o = s.getOptions();
        for (WebElement x:o) {
            System.out.println(x.getAttribute("value"));
        }

        for(WebElement a:o){
            System.out.println(a.getText());
        }

        for(WebElement a:o){
            if(a.getAttribute("value").equalsIgnoreCase("cream") || a.getAttribute("value").equalsIgnoreCase("sugar") )
                s.selectByValue("skim");
            s.selectByValue("whipped");
        }

    }
}

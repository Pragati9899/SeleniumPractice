import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Basic_TestClass {

    @Test  //Write a Script to open and close the browser based on user input
    public void openBrowsers() {
        Scanner sc = new Scanner(System.in);

        System.setProperty("webDriver.chrome.driver", "D:\\New folder (2)\\SeleniumPractice\\src\\test\\resources\\executables\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.geeksforgeeks.org/what-is-has-a-relation-in-java/?ref=ml_lbp");

        driver.close();
    }
}

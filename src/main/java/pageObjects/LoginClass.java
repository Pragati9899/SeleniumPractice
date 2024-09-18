package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginClass {
    WebElement username = DriverManager.getDriver().findElement(By.id("username"));
    WebElement password = DriverManager.getDriver().findElement(By.id("password"));
    WebElement loginBtn = DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']"));
    WebElement dashboard = DriverManager.getDriver().findElement(By.xpath("//span[text()='Dashboard']"));

    public void login(){
        username.sendKeys("pragati2606");
        password.sendKeys("Abcd@1234");
        loginBtn.click();
    }

    public boolean isDashboardDisplayed(){
        return dashboard.isDisplayed();
    }
}

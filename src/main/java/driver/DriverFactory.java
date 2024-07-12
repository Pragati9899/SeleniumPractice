package driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ReadConfigFile;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverFactory {
    private DriverFactory() {
    }

    public static Properties p;
    private static WebDriver driver;

    public static WebDriver get(String os, String br) throws IOException {

        if (ReadConfigFile.getValue("execution_env").equalsIgnoreCase("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();              //⦁	URL to see sessions:  http://localhost:4444/

            //os
            if (os.equalsIgnoreCase("windows")) {
                capabilities.setPlatform(Platform.WIN10);
            } else if (os.equalsIgnoreCase("mac")) {
                capabilities.setPlatform(Platform.MAC);
            } else {
                System.out.println("No matching os");
                return null;
            }

            //browser
            switch (br.toLowerCase()) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    break;
                case "edge":
                    capabilities.setBrowserName("MicrosoftEdge");
                    break;
                default:
                    System.out.println("No matching browser");
                    return null;
            }

            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        }
        if (ReadConfigFile.getValue("execution_env").equalsIgnoreCase("local")) {

            switch (br.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser name..");
                    return null;
            }
        }
        return driver;
    }
}

package driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ReadConfigFile;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Objects;

import static driver.DriverManager.*;

public class Driver {

    public static WebDriver driver;

    public static void setup() throws IOException {
        if (Objects.isNull(getDriver())) {

            driver = DriverFactory.get(ReadConfigFile.getValue("os"), ReadConfigFile.getValue("browser"));
            setDriver(driver);

            getDriver().manage().deleteAllCookies();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            getDriver().get(ReadConfigFile.getValue("url")); // reading url from properties file.
            getDriver().manage().window().maximize();
        }
    }

    public static void tearDown() {
        if (Objects.nonNull(getDriver())) {
            getDriver().quit();
            unload();
        }
    }

    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
        File targetFile = new File(targetFilePath);

        sourceFile.renameTo(targetFile);

        return targetFilePath;

    }
}


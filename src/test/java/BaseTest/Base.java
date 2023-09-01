package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    protected WebDriver driver;
    @BeforeTest
    public void setup() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        option.addArguments("C:\\Users\\Dell\\AppData\\Local\\Chromium\\User Data\\Default\n");
        option.addArguments("--profile-directory=Work");
        driver = new ChromeDriver(option);
        driver.get("https://www.google.com");

    }
    @AfterTest
    public void close(){

      //  driver.close();
    }

}


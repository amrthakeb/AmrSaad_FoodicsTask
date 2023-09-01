package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
public HomePage (WebDriver driver)
{
    this.driver=driver;
}
    public By searchBar=By.id("APjFqb");
    private By searchBtn=By.className("gNO89b");
    public void enterText(String text){
        driver.findElement(searchBar).sendKeys(text);
    }


    public resultsPage clickSearch(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return new resultsPage(driver); //will be linked by the constructor in resultsPage
    }



}

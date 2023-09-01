package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class resultsPage {
    private WebDriver driver;

    public resultsPage(WebDriver driver){
        this.driver=driver;
    }

    private By searchBar2=By.id("APjFqb");
    private By searchBtn=By.className("Tg7LZd");
    private By results=By.className("iTPLzd");
    private By nextBtn=By.xpath("//span[contains(text(), 'Next')]");
    public void clearSearchBar(){
        driver.findElement(searchBar2).clear();

    }

    public void enterNewText(String text){

        driver.findElement(searchBar2).sendKeys(text);
    }

    public void clickSearch(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration here        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public void countNoOfResults(){

        // Get the list of search result elements
        List<WebElement> searchResults = driver.findElements(results);

        // Print the count of search results
        int noOfResults=searchResults.size();
        System.out.println("Number of search results: " + noOfResults);
    }


    public void scroll(){
        // Create a JavascriptExecutor object
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Scroll to the bottom of the page
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void clickNextPage(){
        driver.findElement(nextBtn).click();
    }
}

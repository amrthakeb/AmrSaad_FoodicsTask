package Tests;

import BaseTest.Base;
import Pages.HomePage;
import Pages.resultsPage;
import org.testng.annotations.Test;

public class scenarioTest extends Base //inheritance from the Base class
{
@Test
        public void testFullScenario()
{
 HomePage homePage=new HomePage(driver);
 homePage.enterText("Panda");
    homePage.clickSearch();
    resultsPage resultsPage=new resultsPage(driver);
    resultsPage.clearSearchBar();
    resultsPage.enterNewText("Foodics EG");
    resultsPage.clickSearch();
    resultsPage.countNoOfResults();
    resultsPage.scroll();

}

}

package stepDefinitions;

/**
 * Created by mgoode on 12/8/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DynamicLoadingPage;


public class StepsDynamicLoadingPage {

    public WebDriver driver;
    public String url = "https://the-internet.herokuapp.com/dynamic_loading/1";
    public DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);
    public Boolean expectedTrue = true;

    @Given("^I am on the Dynamic Loading test page$")
    public void i_am_on_the_Dynamic_Loading_test_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/mgoode/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("^I click the start button$")
    public void i_click_the_start_button() throws Throwable {
        dynamicLoadingPage = PageFactory.initElements(driver, DynamicLoadingPage.class);
        dynamicLoadingPage.clickStartButton();
    }

    @Then("^I see a loading bar appear$")
    public void i_see_a_loading_bar_appear() throws Throwable {
        dynamicLoadingPage = PageFactory.initElements(driver, DynamicLoadingPage.class);
        Assert.assertEquals(dynamicLoadingPage.isLoadingBarDisplayed(), expectedTrue);

    }

    @Then("^I wait and see \"(.*?)\" appear$")
    public void i_wait_and_see_appear(String postLoadingMessage) throws Throwable {
        dynamicLoadingPage = PageFactory.initElements(driver, DynamicLoadingPage.class);
        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
        Assert.assertEquals(dynamicLoadingPage.isLoadingBarDisplayed(), expectedTrue);

        driver.close();
        driver.quit();

    }

}

package stepDefinitions;

/**
 * Created by mgoode on 12/7/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ChallengingDOMPage;

public class StepsChallengingDOM {

   //

    public WebDriver driver;
    public String url = "https://the-internet.herokuapp.com/challenging_dom";
    public ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(driver);
    public Boolean expectedTrue = true;

    @Given("^I am on the Challenging Dom test page$")
    public void i_am_on_the_Challenging_Dom_test_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/mgoode/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);

    }

    @When("^I see the table contains \"(.*?)\"$")
    public void i_see_the_table_contains(String cellText) throws Throwable {
        challengingDOMPage  = PageFactory.initElements(driver, ChallengingDOMPage.class);
        Assert.assertEquals(challengingDOMPage.sitCellFour.getText(), cellText);
    }

    @Then("^I see the answer box contains a number$")
    public void i_see_the_answer_box_contains_a_number() throws Throwable {
        challengingDOMPage  = PageFactory.initElements(driver, ChallengingDOMPage.class);

    }

    @Then("^I see the blue button contains text$")
    public void i_see_the_blue_button_contains_text() throws Throwable {
        challengingDOMPage  = PageFactory.initElements(driver, ChallengingDOMPage.class);
        Assert.assertEquals(challengingDOMPage.blueButtonContainsAlphaText(), expectedTrue);
    }

    @Then("^I click the blue button$")
    public void i_click_the_blue_button() throws Throwable {
        challengingDOMPage  = PageFactory.initElements(driver, ChallengingDOMPage.class);
        challengingDOMPage.clickBlueButton();

        driver.close();
        driver.quit();
    }

    @Then("^I see the answer box contains an updated number$")
    public void i_see_the_answer_box_contains_an_updated_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}

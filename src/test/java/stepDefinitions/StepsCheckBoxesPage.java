package stepDefinitions;

/**
 * Created by mgoode on 12/8/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckBoxesPage;

public class StepsCheckBoxesPage {

    public WebDriver driver;
    public String url = "https://the-internet.herokuapp.com/checkboxes";
    public CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
    public Boolean expectedTrue = true;
    public Boolean expectedFalse = false;

    @Given("^I am on the Checkboxes test page$")
    public void i_am_on_the_Checkboxes_test_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/mgoode/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("^I see checkboxTwo is checked$")
    public void i_see_checkboxTwo_is_checked() throws Throwable {
        checkBoxesPage  = PageFactory.initElements(driver, CheckBoxesPage.class);
        Assert.assertEquals(checkBoxesPage.isCheckBoxTwoSelected(), expectedTrue);
    }

    @Then("^I click checkboxOne$")
    public void i_click_checkboxOne() throws Throwable {
        checkBoxesPage  = PageFactory.initElements(driver, CheckBoxesPage.class);
        checkBoxesPage.clickCheckBoxOne();
    }

    @Then("^I see checkboxOne is checked$")
    public void i_see_checkboxOne_is_checked() throws Throwable {
        checkBoxesPage = PageFactory.initElements(driver, CheckBoxesPage.class);
        Assert.assertEquals(checkBoxesPage.isCheckBoxOneSelected(), expectedTrue);
    }

    @Then("^I click checkboxTwo$")
    public void i_click_checkboxTwo() throws Throwable {
        checkBoxesPage = PageFactory.initElements(driver, CheckBoxesPage.class);
        checkBoxesPage.clickCheckBoxtwo();
    }

    @Then("^I see checkboxTwo is unchecked$")
    public void i_see_checkboxTwo_is_unchecked() throws Throwable {
       checkBoxesPage = PageFactory.initElements(driver, CheckBoxesPage.class);
       Assert.assertEquals(checkBoxesPage.isCheckBoxTwoSelected(), expectedFalse);
       driver.close();
       driver.quit();
    }

}

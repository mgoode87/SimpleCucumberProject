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
import pageObjects.LoginPage;

public class StepsLoginPage {

    public WebDriver driver;
    public String url = "https://the-internet.herokuapp.com/login";
    public String inValidUsername = "dog";
    public String inValidPassword = "cat";
    public LoginPage loginPage = new LoginPage(driver);



    @Given("^I am on the Login test page$")
    public void i_am_on_the_Login_test_page(){
        System.setProperty("webdriver.chrome.driver", "/Users/mgoode/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("^I enter an invalid Username$")
    public void i_enter_an_invalid_Username(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUserName(inValidUsername);
    }

    @When("^I enter an invalid Password$")
    public void i_enter_an_invalid_Password() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterPassword(inValidPassword);
    }

    @When("^I click the Login button$")
    public void i_click_the_Login_button()  {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickLoginButton();
    }

    @Then("^I see an error message appear$")
    public void i_see_an_error_message_appear() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        Boolean expectedTrue = true;
        Assert.assertEquals(loginPage.isErrorMessageDisplayed(), expectedTrue);

        driver.close();
        driver.quit();
    }
}

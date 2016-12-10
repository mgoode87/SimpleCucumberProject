package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

/**
 * Created by mgoode on 12/8/16.
 */
public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/h2")
    WebElement pageTitle;

    @FindBy(how = How.ID, using = "username")
    WebElement usernameBox;

    @FindBy(how = How.ID, using = "password")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"login\"]/button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"flash\"]")
    WebElement errorMessage;

    public void enterUserName(String username){
        usernameBox.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getLoginPageTextTitle(){
        return pageTitle.toString();
    }

    public Boolean isErrorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }
}

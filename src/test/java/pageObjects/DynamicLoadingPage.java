package pageObjects;

/**
 * Created by mgoode on 12/7/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    public WebDriver driver;
    public WebElement element;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"start\"]/button")
    WebElement startButton;

    @FindBy(how = How.ID, using = "loading")
    WebElement loadingBar;


    @FindBy(how = How.ID, using = "finish")
    WebElement finishMessage;

    @FindBy(xpath = "//*[@id=\"finish\"]/h4")
    WebElement finishText;


    public void clickStartButton(){
        startButton.click();
    }

    public Boolean isLoadingBarDisplayed(){
        return loadingBar.isDisplayed();
    }

    public Boolean isFinishMessageDisplayed(){
        return finishMessage.isDisplayed();
    }

    public String getFinishText(){
        return finishText.getText();
    }

}

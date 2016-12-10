package pageObjects;

/**
 * Created by mgoode on 12/7/16.
 */

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.apache.commons.lang3.StringUtils.*;

public class ChallengingDOMPage {

    public WebDriver driver;
    public WebElement element;

    public ChallengingDOMPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[4]")
    public WebElement sitCellFour;


    @FindBy(how = How.CLASS_NAME, using = "button")
    WebElement blueButton;

    @FindBy(xpath = "//*[@id=\"canvas\"]")
    WebElement answerBox;

    public String getBlueButtonText(){
        return blueButton.getText();
    }

    public void clickBlueButton(){
        blueButton.click();
    }

    //@FindBy(xpath = "//*[@id=\"content\"]/script/text()")

    public Boolean blueButtonContainsAlphaText(){
        return !StringUtils.isAlpha(blueButton.getText());
    }
}

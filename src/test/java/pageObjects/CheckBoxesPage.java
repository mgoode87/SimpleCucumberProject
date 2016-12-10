package pageObjects;

/**
 * Created by mgoode on 12/8/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage {

    public WebDriver driver;

    public CheckBoxesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkBoxOne;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkBoxTwo;

    public void clickCheckBoxOne(){
        checkBoxOne.click();
    }

    public void clickCheckBoxtwo(){
        checkBoxTwo.click();
    }

    public Boolean isCheckBoxOneSelected(){
        return checkBoxOne.isSelected();
    }

    public Boolean isCheckBoxTwoSelected() {
        return checkBoxTwo.isSelected();
    }
}

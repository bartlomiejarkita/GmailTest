package page_objects;

import baseclass.PageObject;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data public class LogInPageObject extends PageObject {

    public LogInPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "whsOnd")
    private WebElement emailInput;

    @FindBy(className = "RveJvd")
    private WebElement nextButton;

}

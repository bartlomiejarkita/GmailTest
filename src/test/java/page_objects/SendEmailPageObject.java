package page_objects;

import baseclass.PageObject;
import lombok.Data;
import org.openqa.selenium.WebDriver;

@Data public class SendEmailPageObject extends PageObject {

    public SendEmailPageObject(WebDriver driver) {
        super(driver);
    }

}

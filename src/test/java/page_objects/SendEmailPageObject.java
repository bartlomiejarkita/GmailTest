package page_objects;

import baseclass.PageObject;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Data public class SendEmailPageObject extends PageObject {

    public SendEmailPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")
    private WebElement createMailButton;

    @FindBy(tagName = "textarea")
    private WebElement recipientInput;

    @FindBy(className = "dC")
    private WebElement sendButton;

    @FindBy(css = "a[href='https://mail.google.com/mail/u/0/#sent']")
    private WebElement sentMessagesButton;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")
    private WebElement numberOfSentMessages;

}

package step_definitions.send_email_step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.LogInPageObject;
import page_objects.SendEmailPageObject;

import static org.junit.Assert.assertEquals;


public class EmptyMessageRecipentFilled {

    DesiredCapabilities dc = new DesiredCapabilities();
    WebDriver driver = new ChromeDriver(dc);
    SendEmailPageObject sendEmailPageObject = new SendEmailPageObject(driver);
    LogInPageObject logInPageObject = new LogInPageObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 20);


    @Given("^I'm logged in to my gmail account using \"([^\"]*)\" email and \"([^\"]*)\" password$")
    public void i_m_logged_in_to_my_gmail_account(String email, String password) throws Throwable {
        driver.navigate().to("https://gmail.com");
        driver.manage().window().maximize();
        logInPageObject.getEmailInput().sendKeys(email);
        logInPageObject.clickWebElement(logInPageObject.getNextButton());
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='password']")));
        //Element needed to be defined inside step because of StaleElement error.
        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='password']"));
        passwordInput.sendKeys(password);
        logInPageObject.clickWebElement(logInPageObject.getNextButton());
    }

    @And("^I'm on gmail homepage$")
    public void i_m_on_gmail_homepage() throws Throwable {
        Assert.assertTrue(driver.getCurrentUrl().contains("mail.google.com"));
    }

    @When("^I click Create button$")
    public void i_click_Create_button() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(sendEmailPageObject.getCreateMailButton()));
        sendEmailPageObject.clickWebElement(sendEmailPageObject.getCreateMailButton());
    }

    @And("^I fill recipient field with valid email \"([^\"]*)\"$")
    public void i_fill_recipient_field_with_valid_email(String email) throws Throwable {
        sendEmailPageObject.getRecipientInput().sendKeys(email);
    }

    @And("^I click Send button$")
    public void i_click_Send_button() throws Throwable {
        sendEmailPageObject.clickWebElement(sendEmailPageObject.getSendButton());
    }

    @And("^I click confirmation message about sending an empty email$")
    public void i_click_confirmation_message_about_sending_an_empty_email() throws Throwable {
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Then("^I should be able to see my sent massage under Sent category$")
    public void i_should_be_able_to_see_my_sent_massage_under_Sent_category() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='https://mail.google.com/mail/u/0/#sent']")));
        sendEmailPageObject.clickWebElement(sendEmailPageObject.getSentMessagesButton());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")));
        assertEquals(sendEmailPageObject.getNumberOfSentMessages().getText(), 1);
    }

}

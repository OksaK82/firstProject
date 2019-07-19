package com.wagwalking.page;

import com.wagwalking.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeWalkerPage extends BasePage {

    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button-text")
    private WebElement applyNow;

    public void clickApplyNowButton() {
        applyNow.click();
    }

    @FindBy(css = ".error-message")
    private List<WebElement> requiredFields;

    /*
    [0] - first name
    [1] - last name
    [2] - email
    [3] - phone number
     */


    @FindBy(css = "input[id=\"first_name\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[id=\"last_name\"]")
    private WebElement lastNameField;
    @FindBy(css = "input[id=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement addressField;

    @FindBy(css = "#address__line_2")
    private WebElement aptField;




    public String getRequiredFirstName() {
        return requiredFields.get(0).getText();
    }

    public String getRequiredLastName() {
        return requiredFields.get(1).getText();
    }

    public String getRequiredEmail() {
        return requiredFields.get(2).getText();
    }

    public String getRequiredPhoneNumber() {
        return requiredFields.get(3).getText();
    }

    public void clickFirstNameField() {
        firstNameField.click();
    }
    public void clickLastNameField() {
        lastNameField.click();
    }
    public void clickEmailField() {
        emailField.click();
    }
    public void clickPhoneField() {
        phoneField.click();
    }
    public void clickAddressField() {
        addressField.click();
    }
    public void clickAptField() {
        aptField.click();
    }
    public void inputFirstNameApply(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }
    public void inputLastNameApply(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputEmailApply(String email) {
        emailField.sendKeys(email);
    }
    public void inputPhoneAplly(String phone) {
        phoneField.sendKeys(phone);
    }
    public void inputAddressApply(String address) {
        addressField.sendKeys(address);
    }
    public void inputAptApply(String apt) {
        aptField.sendKeys(apt);
    }


}




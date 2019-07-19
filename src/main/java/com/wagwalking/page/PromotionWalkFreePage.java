package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionWalkFreePage extends BasePage {

    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "input[type =\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type =\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[type=\"tel\"]")
    private WebElement cellPhoneField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> requiredFields;


    /*
    [0] - email required
    [1] - firstName required
    [2] - lastName required
    [3] - cellphone reqiured

     */

    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> verifyPassword;

    /*

    [0] - 8 Characters
    [1] - 1 Letter
    [2] - 1 Number

     */

    
    @FindBy(css = ".sc-gzVnrw.jvIbBW")
    private WebElement next;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement existingEmail;

    public void inputEmail(String email) {

        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {

        passwordField.sendKeys(password);
    }

    public void inputfirstName(String firstName) {

        firstNameField.sendKeys(firstName);
    }

    public void inputlastName(String lastName) {

        lastNameField.sendKeys(lastName);
    }

    public void inputcellPhone(String cellPhone) {

        cellPhoneField.sendKeys(cellPhone);
    }

    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public void clickfirstName() {
        firstNameField.click();
    }

    public void clicklastName() {
        lastNameField.click();

    }

    public void clickcellPhone() {
        cellPhoneField.click();

    }

    public String getRequiredEmailNote() {
        return requiredFields.get(0).getText();
    }

    public String getRequiredFirstNameNote() {
        return requiredFields.get(1).getText();
    }

    public String getRequiredLastNameNote() {
        return requiredFields.get(2).getText();
    }

    public String getRequiredCellPhoneNote() {
        return requiredFields.get(3).getText();

    }

    public String getPasswordField8Characters() {
        return verifyPassword.get(0).getText();

    }

    public String getPasswordField1Letter() {
        return verifyPassword.get(1).getText();

    }

    public String getPasswordField1Number() {
        return verifyPassword.get(2).getText();

    }

    public void clickButtonNext() {
        next.click();
    }

    public String getExistingEmai () {
        return existingEmail.getText();
    }
}










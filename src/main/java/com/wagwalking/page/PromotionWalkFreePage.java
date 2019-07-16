package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement requiredEmailField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredPasswordField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredFirstNameField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredLastNameField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredCellPhoneField;


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
        return requiredEmailField.getText();
    }

    public String getRequiredPasswordNote() {
        return requiredPasswordField.getText();
    }

    public String getRequiredFirstNameNote() {
        return requiredFirstNameField.getText();
    }

    public String getRequiredLastNameNote() {
        return requiredLastNameField.getText();
    }

    public String getRequiredCellPhoneNote() {
        return requiredCellPhoneField.getText();

    }
}






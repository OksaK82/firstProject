package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    WebElement walkFreeButton;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    WebElement becomeWalkerButton;

    @FindBy(css = ".sc-ifAKCX.fHUled")
    public List<WebElement> loginButton;


    public PromotionWalkFreePage clickWalkFreeButton() {
        walkFreeButton.click();

        return new PromotionWalkFreePage(driver);

    }
    public BecomeWalkerPage clickBecomeWalkerButton() {
        becomeWalkerButton.click();

        return new BecomeWalkerPage(driver);
    }
    public void clickLoginButton(){
    wait.until(ExpectedConditions.elementToBeClickable(loginButton.get(3)));
    loginButton.get(3).click();
    }


}

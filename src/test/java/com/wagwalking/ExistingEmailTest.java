package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExistingEmailTest extends BaseTest {


    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;


    @Test
    public void testExistingEmail() throws InterruptedException {

        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.clickEmailField();
        List<WebElement> fieldsCollection = driver.findElements(By.cssSelector("input"));

        fieldsCollection.get(0).sendKeys(user.getEmail());
        fieldsCollection.get(1).sendKeys(user.getPassword());
        fieldsCollection.get(2).sendKeys(user.getFirstName());
        fieldsCollection.get(3).sendKeys(user.getLastName());
        fieldsCollection.get(4).sendKeys(user.getCellPhone());


        promotionPage.clickButtonNext();
        Thread.sleep(1000);
        String existingEmail = promotionPage.getExistingEmai();
        System.out.println(existingEmail);
        Assert.assertTrue(existingEmail.contains("Email address already registered"));


    }


}

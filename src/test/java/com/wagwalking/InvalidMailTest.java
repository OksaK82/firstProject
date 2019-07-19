package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class InvalidMailTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;

    @Test
    public  void testInvalidMail() {
         homePage = new HomePage(driver);
         promotionWalkFreePage = homePage.clickWalkFreeButton();
         promotionWalkFreePage.inputEmail("1234566");
         promotionWalkFreePage.clickPasswordField();
         String errorNote = promotionWalkFreePage.getInvalidEmail();
        System.out.println(errorNote);
        Assert.assertEquals("please provide a valid email", errorNote);
    }
}

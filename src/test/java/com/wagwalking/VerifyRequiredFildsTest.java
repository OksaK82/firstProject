package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Handler;

public class VerifyRequiredFildsTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;


    @Test
    public void testVerifyRequiredFields() {

        homePage = new HomePage(driver);

        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.clickEmailField();

        promotionPage.clickfirstName();

        promotionPage.clicklastName();

        promotionPage.clickcellPhone();

        promotionPage.clickPasswordField();



        String emailNote = promotionPage.getRequiredEmailNote();

        System.out.println(emailNote);

        Assert.assertEquals("required", emailNote);

        String firstNameNote = promotionPage.getRequiredFirstNameNote();

        System.out.println(firstNameNote);

        Assert.assertEquals("required",firstNameNote);

        String lastNameNote = promotionPage.getRequiredLastNameNote();

        System.out.println(lastNameNote);

        Assert.assertEquals("required",lastNameNote);

        String cellPhone = promotionPage.getRequiredCellPhoneNote();

        System.out.println(cellPhone);

        Assert.assertEquals("required",cellPhone);

        String characters = promotionPage.getPasswordField8Characters();

        System.out.println(characters);

        Assert.assertEquals("(8 Characters,",characters);

        String letters = promotionPage.getPasswordField1Letter();

        System.out.println(letters);

        Assert.assertEquals("1 Letter,", letters);

        String numbers = promotionPage.getPasswordField1Number();

        System.out.println(numbers);

        Assert.assertEquals("1 Number)",numbers);




    }



}

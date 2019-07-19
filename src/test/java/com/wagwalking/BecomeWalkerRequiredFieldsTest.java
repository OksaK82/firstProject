package com.wagwalking;

import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import org.junit.Assert;
import org.junit.Test;

import java.text.StringCharacterIterator;

public class BecomeWalkerRequiredFieldsTest extends BaseTest {

    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;


    @Test
    public void testBecomeWalkerFields (){

        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkerButton();

        becomeWalkerPage.clickApplyNowButton();


        String firstName = becomeWalkerPage.getRequiredFirstName();

        System.out.println(firstName);

        Assert.assertEquals("First name cannot be blank",firstName);

        String lastName = becomeWalkerPage.getRequiredLastName();

        System.out.println(lastName);

        Assert.assertEquals("Last name cannot be blank",lastName);

        String email = becomeWalkerPage.getRequiredEmail();

        System.out.println(email);

        Assert.assertEquals("Enter a valid email address",email);

        String phoneNumber = becomeWalkerPage.getRequiredPhoneNumber();

        System.out.println(phoneNumber);

        Assert.assertEquals("Enter a valid phone number",phoneNumber);

    }



}

package com.wagwalking;

import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import org.junit.Test;

public class RegistrationWalkerTest extends BaseTest {

  private HomePage homePage;
  private BecomeWalkerPage becomeWalkerPage;

   @Test
  public void testRegistrationWalker() {

     homePage = new HomePage(driver);
     becomeWalkerPage = homePage.clickBecomeWalkerButton();

     becomeWalkerPage.clickFirstNameField();
     becomeWalkerPage.inputFirstNameApply(user2.getFirstName());

     becomeWalkerPage.clickLastNameField();
     becomeWalkerPage.inputLastNameApply(user2.getLastName());

     becomeWalkerPage.clickEmailField();
     becomeWalkerPage.inputEmailApply(user2.getEmail());

     becomeWalkerPage.clickPhoneField();
     becomeWalkerPage.inputPhoneAplly(user2.getCellPhone());

     becomeWalkerPage.clickAddressField();
     becomeWalkerPage.inputAddressApply(user2.getAddress());

     becomeWalkerPage.clickAptField();
     becomeWalkerPage.inputAptApply(user2.getApt());




   }




}

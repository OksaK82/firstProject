package com.wagwalking;

import com.wagwalking.page.BasePage;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;

    @Test
    public  void testWalkFree () {

       homePage = new HomePage(driver);

       promotionWalkFreePage = homePage.clickWalkFreeButton();

       promotionWalkFreePage.inputEmail("kim28@gmail.com");

       promotionWalkFreePage.inputPassword("123457yefj");

       promotionWalkFreePage.inputfirstName("Oksana");

       promotionWalkFreePage.inputlastName("Ivanova");

       promotionWalkFreePage.inputcellPhone("3122533789");


    }



}

package edu.bsuir.test;

import edu.bsuir.page.ApplicationPage;
import edu.bsuir.page.LoginPage;
import edu.bsuir.page.MenuPage;
import org.junit.Before;
import org.junit.Test;

public class TestApplication {
    LoginPage lp = new LoginPage();
    ApplicationPage ap = new ApplicationPage();



    @Before
    public void loginTest2(){
        lp.enterLoginPage();
        lp.typeUsername("smirnov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        //assert
    }

    @Test

    public void ApplicTest(){
        ap.enterApplicPage();
        ap.clickTesterButton();
        ap.clickPriorityButton();
        ap.clickTreatyButton();
        ap.clickSaveButton();
        //assert
    }
}



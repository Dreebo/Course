package edu.bsuir.test;

import edu.bsuir.page.LoginPage;
import edu.bsuir.page.MenuPage;
import org.junit.Before;
import org.junit.Test;

public class TestNew {
    LoginPage lp = new LoginPage();




    @Test
    public void loginTest2(){
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        //assert
    }
}

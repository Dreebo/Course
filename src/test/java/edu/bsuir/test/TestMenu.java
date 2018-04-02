package edu.bsuir.test;


import edu.bsuir.page.LoginPage;
import edu.bsuir.page.MenuPage;
import org.junit.Before;
import org.junit.Test;


public class TestMenu {

    LoginPage lp = new LoginPage();
    MenuPage mp = new MenuPage();



    @Before
    public void loginTest2(){
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        //assert
    }

    @Test

    public void MenuTest(){
        mp.enterMenuPage();
        mp.clickDirectoryButton();
        mp.clickHomeButton();
        mp.clickSelectionButton();
        //assert
    }
}

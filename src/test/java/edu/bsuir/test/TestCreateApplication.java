package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.page.CreateApplicationPage;
import edu.bsuir.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCreateApplication {
    CreateApplicationPage cp = new CreateApplicationPage();
    LoginPage lp = new LoginPage();

    @Before
    public void loginTest2(){
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        //assert
    }
    @Test
    public void applicationTest(){
        cp.enterCreateApplicationPage();
        cp.clickNewApplication();
        cp.typePosition("Менеджер");
        cp.clickPriority();
        cp.clickCandidate();
        cp.clickCatalog();
        cp.clickCompetence();
        cp.moveCompetenceW();
        cp.clickCompetenceW();
        cp.clickButtonOk();
        cp.clickButtonSave();
        //assert
    }

    @After
    public void closeTest() {
        WebDriverSingleton.destroyInstance();
          }
}

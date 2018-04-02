package edu.bsuir.test;


import edu.bsuir.page.LoginPage;
import org.junit.Test;


public class TestExample {

    LoginPage lp = new LoginPage();




   // @After
   // public void shutDown() {
     //   driver.close();
    //}

    @Test
    public void loginTest2(){
       lp.enterLoginPage();
       lp.typeUsername("kabanov@tc.by");
       lp.typePassword("welcome");
       lp.clickLoginButton();
        //assert
    }


}

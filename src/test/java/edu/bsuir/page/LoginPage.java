package edu.bsuir.page;
import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import edu.bsuir.elements.Element;
public class LoginPage {

        WebDriver driver = WebDriverSingleton.getInstance();

        public void enterLoginPage(){
            driver.get(LoginElements.URL);
        }

        public void typeUsername(String username){
        LoginElements.USERNAME.type(username) ;

        }

        public void typePassword(String password){
            LoginElements.PASSWORD.type(password);

        }

        public void clickLoginButton(){
            LoginElements.LOGIN_BUTTON.click();
        }
}

package edu.bsuir.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

        WebDriver driver = WebDriverSingleton.getInstance();

        public void enterLoginPage(){
            driver.get(LoginElements.URL);
        }

        public void typeUsername(String username){
            WebElement element = driver.findElement(LoginElements.USERNAME);
            element.clear();
            element.sendKeys(username);
        }

        public void typePassword(String password){
            WebElement element = driver.findElement(LoginElements.PASSWORD);
            element.clear();
            element.sendKeys(password);
        }

        public void clickLoginButton(){
            WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
            element.click();
        }
}

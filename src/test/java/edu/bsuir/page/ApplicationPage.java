package edu.bsuir.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.ApplicationElements;
import edu.bsuir.elements.MenuElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationPage {
    WebDriver driver = WebDriverSingleton.getInstance();


    public void enterApplicPage(){
        driver.get(ApplicationElements.URL);
    }

    public void clickTesterButton(){
        WebElement element = driver.findElement(ApplicationElements.TESTER_BUTTON);
        element.click();
    }

    public void clickPriorityButton(){
        WebElement element = driver.findElement(ApplicationElements.PRIORITY_BUTTON);
        element.click();
    }

       public void clickTreatyButton(){
        WebElement element = driver.findElement(ApplicationElements.TREATY_BUTTON);
        element.click();
    }

    public void clickSaveButton(){
        WebElement element = driver.findElement(ApplicationElements.SAVE_BUTTON);
        element.click();
    }


}

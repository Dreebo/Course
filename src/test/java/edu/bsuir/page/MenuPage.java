package edu.bsuir.page;

import edu.bsuir.driver.WebDriverSingleton;

import edu.bsuir.elements.MenuElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterMenuPage(){
        driver.get(MenuElements.URL);
    }

    public void clickHomeButton(){
        WebElement element = driver.findElement(MenuElements.HOME_BUTTON);
        element.click();
    }

    public void clickSelectionButton(){
        WebElement element = driver.findElement(MenuElements.SELECTION_BUTTON);
        element.click();
    }

    public void clickDirectoryButton(){
        WebElement element = driver.findElement(MenuElements.DIRECTORY_BUTTON);
        element.click();
    }
}

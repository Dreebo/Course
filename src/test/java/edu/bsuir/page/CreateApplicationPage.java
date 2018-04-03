package edu.bsuir.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.CreateApplicationElement;
import edu.bsuir.elements.LoginElements;
import org.openqa.selenium.WebDriver;

public class CreateApplicationPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterCreateApplicationPage(){
        driver.get(CreateApplicationElement.URL);
    }

    public void clickNewApplication(){
        CreateApplicationElement.NEW_APPLICATION.click();
    }

    public void typePosition(String position){
        CreateApplicationElement.POSITION.type(position) ;

    }

    public void clickPriority(){
        CreateApplicationElement.PRIORITY.click();
    }

    public void clickCandidate(){
        CreateApplicationElement.CANDIDATE.click();
    }

    public void clickCatalog(){
        CreateApplicationElement.ADD_CATALOG.click();
        }
    public void clickCompetence(){
        CreateApplicationElement.COMPETENCE.click();

    }

    public void moveCompetenceW(){
        CreateApplicationElement.COMPETENCE_W.moveToElement();
    }

    public void clickCompetenceW(){
        CreateApplicationElement.COMPETENCE_W.doubleClick();
    }
    public void clickButtonOk(){
        CreateApplicationElement.BUTTON_OK.click();
    }

    public void clickButtonSave(){
        CreateApplicationElement.SAVE.click();
    }
}

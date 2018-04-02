package edu.bsuir.elements;

import org.openqa.selenium.By;

public class LoginElements {
    public static String URL="http://testing.cld.iba.by/web/guest/home";
    public static By USERNAME=By.id("_58_login");
    public static By PASSWORD=By.id("_58_password");
    public static By LOGIN_BUTTON = By.xpath("//div[@class='button-holder ']//button");
}

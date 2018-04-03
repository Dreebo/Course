package edu.bsuir.elements;

import org.openqa.selenium.By;

public class LoginElements {
    public static String URL="http://testing.cld.iba.by/web/guest/home";
    public static   Element USERNAME = new Element ("Поле логина",
            By.xpath("//input[@id='_58_login']"));
    public static Element PASSWORD= new Element ("Поле пороля",By.id("_58_password"));
    public static Element LOGIN_BUTTON =  new Element ( "Вход",By.xpath("//div[@class='button-holder ']//button"));
}

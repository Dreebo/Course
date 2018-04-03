package edu.bsuir.elements;

import org.openqa.selenium.By;

public class CreateApplicationElement {
    public static String URL="http://testing.cld.iba.by/web/guest/recruiting/applications";
    public static Element NEW_APPLICATION = new Element ("новая заявка",
            By.xpath("//*[@id=\"createButton\"]"));
    public static   Element POSITION = new Element ("Должность",
            By.xpath("//*[@id=\"name\"]"));
    public static   Element PRIORITY = new Element ("Приоритет",
            By.xpath("//*[@id=\"priority-1\"]"));
    public static   Element CANDIDATE = new Element ("Тип кандидата",
            By.xpath("//*[@id=\"candidateTypeExternal\"]"));
    public static   Element ADD_CATALOG = new Element ("Добавить ",
            By.xpath("//*[@id=\"editrequiredCompetence\"]"));
    public static   Element COMPETENCE = new Element ("Компетенция",
            By.xpath("//span[text()='MS Office']"));
    public static   Element COMPETENCE_W = new Element ("Компетенция2",
            By.xpath("//span[text()='MS Word']"));
    public static Element BUTTON_OK = new Element("Ok",By.xpath("//button[text() = 'OK']"));
    public static Element SAVE = new Element("Сохранить",By.xpath("//*[@id=\"save\"]"));

}





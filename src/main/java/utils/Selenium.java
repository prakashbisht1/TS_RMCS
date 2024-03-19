package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium {
    public static WebDriver driver;




    public static void click(WebElement element){
        element.click();
        System.out.println("Clicking on "+element.getText()+ "Element");
    }

    public static void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
        System.out.println("Enter text on "+element.getText()+ "box");
    }
}

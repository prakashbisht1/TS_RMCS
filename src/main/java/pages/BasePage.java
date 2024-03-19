package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Screen;
import io.github.marcoslimaqa.sikulifactory.SikuliFactory;

public class BasePage {

    WebDriver driver;
	Screen sikuli;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public BasePage(Screen sikuli) {
  		this.sikuli = sikuli;
  		SikuliFactory.initElements(sikuli, this);
  	}
    public void launchURL(String URL){
        driver.get(URL);
    }
    
  
}

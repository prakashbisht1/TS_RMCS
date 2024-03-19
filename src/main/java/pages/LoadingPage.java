package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Screen;
import io.github.marcoslimaqa.sikulifactory.FindByImage;
import io.github.marcoslimaqa.sikulifactory.SikuliElement;
import io.github.marcoslimaqa.sikulifactory.SikuliFactory;
import utils.DriverFactory;
import utils.Property;

public class LoadingPage {
    WebDriver driver;
    Screen sikuli;
	
    public LoadingPage(WebDriver driver)
    {   
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
       
    public LoadingPage(Screen sikuli) 
    {
      		this.sikuli = sikuli;
      		SikuliFactory.initElements(sikuli, this);
      	}
      

    @FindByImage(Constant.skipbutton)
    public SikuliElement skip;
    
    @FindByImage(Constant.startbutton)
    public SikuliElement start;
    
   
  

  public void goTo()
   {
      DriverFactory.getDriver().get(Property.getConfig("url"));
   }  

    public void skipLoading() throws InterruptedException 
    {
        Thread.sleep(9000);

		skip.click();
		
	}

    public void ClickOnStartButton() 

    {  
    	
    	start.click();

    }



}

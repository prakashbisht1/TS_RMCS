package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Screen;
import io.github.marcoslimaqa.sikulifactory.FindByImage;
import io.github.marcoslimaqa.sikulifactory.SikuliElement;
import io.github.marcoslimaqa.sikulifactory.SikuliFactory;

public class MenuPage {
	
WebDriver driver;
Screen sikuli;

	
    public MenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    
    
    public MenuPage(Screen sikuli) {
		this.sikuli = sikuli;
		SikuliFactory.initElements(sikuli, this);
	}
    
   
    @FindBy(xpath="//div[text()='HELP']")
    public WebElement helptext;
    
    
    @FindByImage(Constant.menubutton)
    public SikuliElement menu;
    
    @FindByImage(Constant.helpbutton)
    public SikuliElement help;
    
    @FindByImage(Constant.paytablebutton)
    public SikuliElement paytable;
    
    @FindByImage(Constant.helppaytableclose)
    public SikuliElement closeHelpPaytable;
    
    @FindByImage(Constant.languagebutton)
    public SikuliElement languageButton;
    
    @FindByImage(Constant.languageclose)
    public SikuliElement languageClose;
    
    @FindByImage(Constant.hindi)
    public SikuliElement hindi;
    
    @FindByImage(Constant.confirmbutton)
    public SikuliElement confirmlanguage;
    
    
  
        
        
        public void OpenMenu() 
        {
    		
    		menu.click();
    	}
        
        public void OpenHelp() 
        {
    		
    		help.click();
    	}
        
       
        
        public void OpenLanguage() 
        {
    		
        	languageButton.click();
    	}
        
        public void OpenPaytable() 
        {
    		
    		paytable.click();
    	}
        public void CloseHelpPaytable() 
        {
    		
        	closeHelpPaytable.click();
    	}
        
        public void CloseLanguage() 
        {
    		
        	languageClose.click();
    	}
        
        public void HindiLanguage() 
        {
    		
        	hindi.click();
    	}
        
        public void ConfirmLanguage() 
        {
    		
        	confirmlanguage.click();
    	}

}

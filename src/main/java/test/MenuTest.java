package test;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Constant;
import pages.LoadingPage;
import pages.MenuPage;


public class MenuTest extends BaseTest {
	
	
	WebDriver driver;
    Screen sikuli = new Screen();
    MenuPage menuPage = new MenuPage(sikuli);
    BasePage basePage = new BasePage(driver);
    LoadingPage loadingPage = new LoadingPage(sikuli);
    

    @Test(priority = 3)
    
    public void Verify_Player_is_able_to_click_on_menu_button() throws InterruptedException
    {
      
    	loadingPage.goTo();
        loadingPage.skipLoading();
        loadingPage.ClickOnStartButton();
        menuPage.OpenMenu();
		printStatusMessage(sikuli, Constant.helpbutton, "Menu Panel Opened", "Menu Panel not opened");		
        
    }
    
    @Test(priority = 4)
    public void Verify_Player_is_able_to_Click_on_Paytable_button() throws InterruptedException
    {
        
    	menuPage.OpenPaytable();
		printStatusMessage(sikuli, Constant.paytabletext, "Paytable Page Verifed", "Paytable Page Not Verified");		
        menuPage.CloseHelpPaytable();
    }
    
    @Test(priority = 5)
    public void Verify_Player_is_able_to_Click_on_Help_button() throws InterruptedException
    {
        
        menuPage.OpenMenu();
    	menuPage.OpenHelp();
		printStatusMessage(sikuli, Constant.helptext, "Help Page Verified", "Help Page Not Verified");		
        menuPage.CloseHelpPaytable();

    }
    
    @Test(priority = 6)
    public void Verify_Player_is_able_to_Change_Language() throws InterruptedException
    {
        
        menuPage.OpenMenu();
    	menuPage.OpenLanguage();
    	menuPage.HindiLanguage();
    	menuPage.ConfirmLanguage();
		printStatusMessage(sikuli, Constant.jeet, "Language Changed to Hindi", "Language not changed");		

    }



}




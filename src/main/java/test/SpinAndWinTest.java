package test;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Constant;
import pages.LoadingPage;
import pages.SpinAndWin;


public class SpinAndWinTest extends BaseTest {
	
	
	WebDriver driver;
    Screen sikuli = new Screen();
    BasePage basePage = new BasePage(driver);
    LoadingPage loadingPage = new LoadingPage(sikuli);
    SpinAndWin spin = new SpinAndWin(sikuli);		

    

    @Test(priority = 7)
    
    public void Verify_Player_is_able_to_trigger_5oak_win() throws InterruptedException
    
    {
      
    	loadingPage.goTo();
        loadingPage.skipLoading();	
        loadingPage.ClickOnStartButton();
        spin.Trigger5OAK();
		printStatusMessage(sikuli, Constant.fiveOAK, "5oak triggered", "5oak not triggered");		
        spin.StageClick();


    }
    

    
    @Test(priority = 8)
    public void Verify_Player_is_able_to_Gamble() throws InterruptedException
    
    {
    	spin.Trigger4OAK();
        spin.StageClick();
        spin.Gamble();


    }
    
    @Test(priority = 9)
    public void Verify_Player_is_able_to_trigger_freegames() throws InterruptedException
    
    {
        
         spin.TriggerFreeGames();
         spin.StageClick();
 	//	 printStatusMessage(sikuli, Constant.freespinintro, "FS Intro Displayed", "FS Intro not displayed");		

        
         
        

    }



}




package test;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Constant;
import pages.LoadingPage;

public class LoadingTest extends BaseTest {

    WebDriver driver;
    Screen sikuli = new Screen(); 
    LoadingPage loadingPage = new LoadingPage(sikuli);
    BasePage basePage = new BasePage(driver);    


    @Test(priority = 1)
    public void Verify_Player_is_able_to_skip_loading_page() throws InterruptedException
    {
      

        loadingPage.goTo();
        ///Thread.sleep(9000);
        loadingPage.skipLoading();
      
		printStatusMessage(sikuli, Constant.startbutton, "Skipped Successfully", "Not Skipped");		
      
    }
    
    @Test(priority = 2)
    public void Verify_Player_is_able_to_Click_on_Start_button_on_Intro_Screen() throws InterruptedException
    {
      
    	loadingPage.ClickOnStartButton();   	
		printStatusMessage(sikuli, Constant.spinbutton, "Entered into Base Game", "Not in Base Game");		

    }



}

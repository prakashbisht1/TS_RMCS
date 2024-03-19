package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Screen;
import io.github.marcoslimaqa.sikulifactory.FindByImage;
import io.github.marcoslimaqa.sikulifactory.SikuliElement;
import io.github.marcoslimaqa.sikulifactory.SikuliFactory;



public class SpinAndWin {
	
	
WebDriver driver;
Screen sikuli;


	
    public SpinAndWin(WebDriver driver) 
    {   
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
       
    
    public SpinAndWin(Screen sikuli) 
    {   
		this.sikuli = sikuli;
		SikuliFactory.initElements(sikuli, this);


	}
    
    @FindByImage(Constant.Cheatbox)
     public SikuliElement Cheatbox;
    
    
    @FindByImage(Constant.spinbutton)
    public SikuliElement SpinButton;
    
    @FindByImage(Constant.stageclick)
    public SikuliElement stageclick;
    

    @FindByImage(Constant.gamble)
    public SikuliElement gamble;
    
    @FindByImage(Constant.findchor)
    public SikuliElement findchor;
    
    @FindByImage(Constant.collectgamble)
    public SikuliElement collectgamble;
    

  

 public void StageClick() 
    {
    	stageclick.click();
    }
 
public void Trigger5OAK() throws InterruptedException 
{
	Cheatbox.type(Constant.Cheat5OAK);
	SpinButton.click();
    Thread.sleep(6000);

}

public void Trigger4OAK() throws InterruptedException 
{
	Cheatbox.type(Constant.Cheat4OAK);
	SpinButton.click();
    Thread.sleep(4000);

}


public void TriggerFreeGames() throws InterruptedException 
{
	Cheatbox.type(Constant.CheatFreeGame);
	SpinButton.click();
    Thread.sleep(4000);


}

public void Gamble() 
{
	gamble.click();
	findchor.click();
	collectgamble.click();
    
}



}

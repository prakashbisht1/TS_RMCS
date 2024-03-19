package test;

import org.sikuli.script.Screen;
import org.testng.annotations.*;
import pages.Constant;
import utils.DriverFactory;
public class BaseTest {

    //if you wish to run browser from testng.xml, comment/uncomment the following lines
//    @BeforeTest(alwaysRun = true)
//    @Parameters(value = "browser")
//    public void browserSetupUsingParameters(String browserName) {
//        DriverFactory.setThreadDriverName(browserName);
//    }

//    if you wish to run browser from config.properties file, comment/uncomment the following lines
    @BeforeClass(alwaysRun = true)
    public void browserSetupUsingConfigProperties() 
    {
        DriverFactory.setThreadDriverName(Constant.BROWSER);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() 
    {
    	DriverFactory.quitDriver();
    }
    
    public static void printStatusMessage(Screen sikuli, String imagePath, String successMessage, String failureMessage) 
    {
        if (sikuli.exists(imagePath) != null) 
        {
            System.out.println(successMessage);
        } else 
        {
            System.out.println(failureMessage);

        }     
    
}
    

    }


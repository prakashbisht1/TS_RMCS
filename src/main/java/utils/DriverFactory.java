package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import pages.Constant;

import java.time.Duration;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static final ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadDriver.get() == null) {
            if (threadDriverName.get() == null) {
                threadDriverName.set("chrome");
            }
            switch (threadDriverName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT));
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT));
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT));
                    break;
                default:
                    ChromeOptions chromeOptions = new ChromeOptions();

                    chromeOptions.addArguments("--headed");
                    chromeOptions.addArguments("--disable-gpu");
                    chromeOptions.addArguments("--disable-software-rasterizer");
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                    chromeOptions.addArguments("--no-sandbox");

                    threadDriver.set(new ChromeDriver(chromeOptions));
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT));
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }

    public static void setThreadDriverName(String browserName) {
        threadDriverName.set(browserName);
    }
}

package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager extends BasePage{
    LoadProp loadProp = new LoadProp();
    DesiredCapabilities caps = new DesiredCapabilities();
    public final String USERNAME = System.getenv("pinalnavin_Z9Vco5");
    public final String AUTOMATE_KEY = System.getenv("WdzepxWLwPp4G1rxiiek");
    public final String BrowseStackURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    //boolean cloud= true;
    String browserName ="chrome";
    // String browserName = System.getProperty("browser");

   public void startOfBrowser(){
        if(cloud){
            System.out.println("Running in cloud");
            //applying conditional loop for web-browser selection
            if (browserName.equalsIgnoreCase("Chrome")){
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.0.0");
            }else{
                System.out.println("Your Browser name is wrong");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowseStackURL),caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println("Running Locally...");
        }
       if (browserName.equalsIgnoreCase("chrome"))
       {
           System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
           driver = new ChromeDriver();
        }
      else if(browserName.equalsIgnoreCase("Firefox")){
          FirefoxOptions options = new FirefoxOptions();
          options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //location where Firefox is installed
          System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe" );
          driver= new FirefoxDriver();
        }

        //open chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeTheBrowser(){
        driver.quit();
    }
}



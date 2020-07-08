package com.cognizant.dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerChrome {
	
	public static void main(String[] args) throws MalformedURLException {
//		WebDriver driver = new FirefoxDriver();
		
//		DesiredCapabilities dc =  DesiredCapabilities.chrome();
//		
//		URL url = new URL("http://0.0.0.0:4444/wd/hub");
//		
//		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
//		driver.get("https://google.com");
//		System.out.println("the title is: " +driver.getTitle());
		
		// standalone file
		
 
		 WebDriverManager.chromedriver().setup();

		    //Create Chrome Options
		    ChromeOptions option = new ChromeOptions();
		    option.addArguments("--no-sandbox");
		    option.addArguments("--headless");
		    option.addArguments("--disable-dev-shm-usage");
		    DesiredCapabilities chrome = DesiredCapabilities.chrome();
		    chrome.setJavascriptEnabled(true);
		    option.setCapability(ChromeOptions.CAPABILITY, option);

		    //Create driver object for Chrome
		    WebDriver driver = new ChromeDriver(option);

         
		driver.get("https://google.com");
		System.out.println("the title is: " +driver.getTitle());
		
		driver.quit();
	}
}

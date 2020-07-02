package com.cognizant.dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerChrome {
	
	public static void main(String[] args) throws MalformedURLException {
//		WebDriver driver = new FirefoxDriver();
		
//		DesiredCapabilities dc =  DesiredCapabilities.firefox();
//		
//		URL url = new URL("http://localhost:4444/wd/hub");
//		
//		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();

         //System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
         driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("the title is: " +driver.getTitle());
		
		driver.quit();
	}
}

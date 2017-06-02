package helloWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloWorld1 {
	public static void main(String[] args) throws Exception, IOException{
	 
	 WebDriver driver;
	 
	        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Enter the numbers:");
			int BrowserName=Integer.parseInt(br.readLine());
			
        	switch (BrowserName){

        	case 1:
        		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        		driver = new FirefoxDriver();
        		System.out.println("Done");
    			break;
    		case 2:
    			System.setProperty("webdriver.chrome.driver","./geckodriver.exe");
    			driver = new ChromeDriver();
    			break;
    		case 3:
    			driver = new InternetExplorerDriver();
    			break;
    		default:
    			System.out.println("browser : " + BrowserName + " is invalid, Launching Firefox as browser of choice..");
    			driver = new FirefoxDriver();
        	}
			
	}

}


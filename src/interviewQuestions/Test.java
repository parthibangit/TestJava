package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * @author Parthiban
 *
 */
public class Test
{

	/**
	 *  This is about the reverse the order
	 */
	
	public static void main(String[] args)
	{
		browser("ie");
	}
	
	
	
	static void browser(String browserName)
	{
		
		
		
		switch(browserName)
		{
		case "chrome":
			  
			  System.out.println("Chrome driver matched");
			  break;
			  
		case "firefox":
			  
			  System.out.println("Firefox driver matched");
			  break;
			  
		case "ie":
			
			  System.out.println("IE browser opened");
			  break;	  
			  
	    default:
	    	
	    	 System.out.println("None of the browsers matched - So default chrome browser opened");
		}
	}
	
}

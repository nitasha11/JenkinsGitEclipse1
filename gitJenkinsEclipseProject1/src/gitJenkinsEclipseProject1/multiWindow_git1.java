package gitJenkinsEclipseProject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//added comment to master
public class multiWindow_git1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    String parent=driver.getWindowHandle();
	    driver.findElement(By.xpath("//li//a[@title='Search Recruiters']")).click();
	    driver.switchTo().window(parent);
	    driver.findElement(By.xpath("//li//a[@title='Jobs Posted By Top Companies']")).click();
	    Set<String> windows= driver.getWindowHandles();
	    System.out.println("No of Windows="+windows.size());
	    try {
	    for(String child:windows) {
	    	if (!parent.equalsIgnoreCase(child)) {
	    		driver.switchTo().window(child);
	    		Thread.sleep(1000);
	    		driver.close();
	    		//Comment 1
	    	}
	    }
	    }catch(Exception e) {
	    	e.getStackTrace();
	    }
	    //added comment2

	}


	}



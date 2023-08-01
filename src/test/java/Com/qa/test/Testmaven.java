package Com.qa.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testmaven {

	//comment
	@Test
	
	public void  demo() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver-v0.20.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
			               driver.navigate().to("http://result.rgpv.ac.in/result/programselect.aspx");
							driver.findElement(By.xpath(".//*[@id='radlstProgram_0']")).click();
		    driver.navigate().to("http://result.rgpv.ac.in/result/programselect.aspx");
		

	}
	
	
}

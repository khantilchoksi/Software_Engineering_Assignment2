package selenium.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebTest
{
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
		//driver = new HtmlUnitDriver();
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void  tearDown() throws Exception
	{
		driver.close();
		driver.quit();
	}

	
	@Test
	public void googleExists() throws Exception
	{
		driver.get("http://www.google.com");
        assertEquals("Google", driver.getTitle());		
	}
	


	
	//1. Unit test for The participant count of "Frustration of Software Developers" is 55
	@Test
	public void Frustration() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		String pathToFrustration = "//span[.='Frustration of Software Developers']/../../following-sibling::div/p/span";
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathToFrustration)));
		
		WebElement frustrationSoftwareDeveloperVotesSpan = driver.findElement(By.xpath(pathToFrustration));
		String votes = frustrationSoftwareDeveloperVotesSpan.getText();
		System.out.println("Votes Value: "+votes);
		
		assertNotNull(frustrationSoftwareDeveloperVotesSpan);
		assertEquals(55, Integer.parseInt(votes));
	}
	
	//2. The total number of studies closed is 5.
	@Test
	public void Closed() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		List<WebElement> spans = driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));

		assertNotNull(spans);
		assertEquals(5, spans.size());
	}
	
	//3. If a status of a study is open, you can click on a "Participate" button.
	@Test
	public void OpenClick() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		String openStatusSpans = "//a[@class='status']/span[.='OPEN']";
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(openStatusSpans)));
		List<WebElement> spans = driver.findElements(By.xpath("//a[@class='status']/span[.='OPEN']"));
		
		for(WebElement element: spans) {
			System.out.println("\n Hello: "+
					(element.findElement(By.xpath("..")).getAttribute("href")));
			String divIfCanParticipate = "../../div/button";
			WebElement participateButton = element.findElement(By.xpath(divIfCanParticipate));
			System.out.println(" Href: "+participateButton.getAttribute("data-href"));
			participateButton.click();
		}
		String divIfCanParticipate = "//following-sibling::div/button";
		WebElement participateButton = spans.get(1).findElement(By.xpath(divIfCanParticipate));
		System.out.println(" Value: "+participateButton.getAttribute("data-href"));
		participateButton.click();

		assertNotNull(spans);
		//assertEquals(5, spans.size());
	}
	
	//4. Check if the "Software Changes Survey" has a Amazon reward image.
	@Test
	public void ImageCheck() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		String imgPath = "//span[.='Software Changes Survey']/../../div[@class='award']/div[@data-bind='foreach: awards']/span/img";
//		String imgPath = "//span[.='Software Changes Survey']/../../div[@class='award']/div[@data-bind='foreach: awards']/span[@data-bind='if: awardImg']";
		
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imgPath)));
		
		WebElement amazonImgElement = driver.findElement(By.xpath(imgPath));
		String src = amazonImgElement.getAttribute("src");
		System.out.println("\n Src: "+src);
		
		assertNotNull(amazonImgElement);
		assertEquals("http://www.checkbox.io/media/amazongc-micro.jpg", src);
	}

}

package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class WikipediaBienvenidosPage {
	@Test(description = "Validar que el titulo de wikipedia sea Bienvenidos")
	public void ValidarBienvenidosWikipedia() throws Exception 
	{  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Key\\Desktop\\Automation\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.get("http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement aWikipedia = driver.findElement(By.xpath("//*[@id='Bienvenidos_a_Wikipedia,']"));  
	Assert.assertTrue(aWikipedia.isDisplayed());
	String textowiki="Bienvenidos a Wikipedia,";
	String resultado= aWikipedia.getText();
	Assert.assertEquals(resultado, textowiki);
	driver.close();	
	}
}

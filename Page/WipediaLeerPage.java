package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WipediaLeerPage {
	@Test(description = "Validar que el click boton Leer de wikipedia portada")
	public void ValidarBienvenidosWikipedia() throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Key\\Desktop\\Automation\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.get("http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement imput = driver.findElement(By.xpath("//*[@id='main-tfa']//*[@class='main-footer'] //*[@class='main-footer-actions main-plainlist nomobile']/ul/li[1]/a[1]"));  
	Assert.assertTrue(imput.isDisplayed());  
	imput.click();
	Thread.sleep(1000);
	WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  
	System.out.println("Texto encontrado "+ tituloResultado.getText());  
	Assert.assertTrue(tituloResultado.isDisplayed(), "Antonín_Dvořák");
	driver.close();	
	}
}


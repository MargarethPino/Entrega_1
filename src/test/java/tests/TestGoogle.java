package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
   private WebDriver driver;
private static final String TIPO_DRIVER ="webdriver.chrome.driver";
private static final String PATH_DRIVER ="src/test/resources/webDriver/chromedriver.exe";  
private String URL = "https://inscripcionestdea.com/facultad-de-ingenieria";

@BeforeClass

  public static void setUpBeforeClass() {
	  System.out.println("inicio de test");
	  System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	  
  }
@Before
   public  void setUp() {
	   driver = new ChromeDriver();
	   driver.get(URL);
	   
   }
@Test
   public void testSourch() {
	   String textEnviado = "andres";
	   WebElement txtSourch = driver.findElement(By.name("form_fields[name]"));
	   txtSourch.sendKeys(textEnviado);
	   
	   String textEnviado1 = "andresmar@gmail.com";
	   WebElement txtSourch1 = driver.findElement(By.name("form_fields[email]"));
	   txtSourch1.sendKeys(textEnviado1);
	   
	   String textEnviado11 = "24582237";
	   WebElement txtSourch11 = driver.findElement(By.name("form_fields[message]"));
	   txtSourch11.sendKeys(textEnviado11);
	   
	   String textEnviado111 = "3146211874";
	   WebElement txtSourch111= driver.findElement(By.name("form_fields[field_9e056e6]"));
	   txtSourch111.sendKeys(textEnviado111);
	   
	   String textEnviado1111 = "Ingenieria de Ambiental";
	   WebElement txtSourch1111= driver.findElement(By.name("form_fields[field_682fffc]"));
	   txtSourch1111.sendKeys(textEnviado1111);
	   
	   String textEnviado11111 = "Redes sociales";
	   WebElement txtSourch11111= driver.findElement(By.name("form_fields[field_70ab007]"));
	   txtSourch11111.sendKeys(textEnviado11111);
	   txtSourch11111.submit();
	   @SuppressWarnings("deprecation")
	Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
	   String titulo = driver.getTitle();
	  Assert.assertFalse("validar ttitulo", titulo.contains(textEnviado11111));   
   }

@After 
public void tearDown() {
	   driver.quit();
}
@AfterClass 
public static void  tearDownAfterClass() {
} {
	   System.out.println("finalizar");
	   
}
   

   
   
   
   
   
 
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
   
  
}

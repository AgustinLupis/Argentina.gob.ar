package postulaciones;


import java.util.regex.Pattern;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;

public class VerificarCompletitudDePantalla {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  File pathToBinary = new File("/opt/firefox/firefox");
	  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	  FirefoxProfile firefoxProfile = new FirefoxProfile();       
	  driver = new FirefoxDriver(ffBinary,firefoxProfile);
	//driver = new FirefoxDriver();
    baseUrl = "http://qa-back.argentina.gob.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVerificarCompletitudDePantalla() throws Exception {
	    /* maximizar navegador*/
		driver.manage().window().maximize();
		/* maximizar navegador*/
    driver.get(baseUrl + "postulaciones");
    String actText = driver.findElement(By.id("edit-nombres")).getText();
    String actText1 = driver.findElement(By.id("edit-apellido")).getText();
    String actText2 = driver.findElement(By.id("edit-telefono")).getText();
    String actText3 = driver.findElement(By.id("edit-dni")).getText();
    String actText4 = driver.findElement(By.id("edit-mail")).getText();
    String actText5 = driver.findElement(By.id("edit-nombres")).getText();
    String actText6 = driver.findElement(By.id("edit-nombres")).getText();
    String actText7 = driver.findElement(By.id("edit-localidad")).getText();
    String actText8 = driver.findElement(By.id("edit-nivel-de-estudio")).getText();
    String actText9 = driver.findElement(By.id("edit-estado-cursada")).getText();
    String actText10 = driver.findElement(By.id("edit-titulo-obtenido")).getText();
    String actText11 = driver.findElement(By.id("edit-aos-de-experiencia-laboral-en-apn")).getText();
    String actText12 = driver.findElement(By.id("edit-en-donde")).getText();
    String actText13 = driver.findElement(By.id("edit-nombre-organizacion")).getText();
    String actText14 = driver.findElement(By.id("edit-jerarquia")).getText();
    String actText15 = driver.findElement(By.id("edit-comentario")).getText();
    String actText16 = driver.findElement(By.id("edit-terminos-y-condiciones")).getText();
    String actText17 = driver.findElement(By.id("edit-submit-button")).getText();
    System.out.println("Taking Screen Shot");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("/home/nicolas/Capturas/Postulaciones/VerificarCompletitudDePantalla.png"));	

    
  }  
    
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

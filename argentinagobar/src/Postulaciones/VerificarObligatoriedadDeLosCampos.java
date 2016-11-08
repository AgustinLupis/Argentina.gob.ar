package Postulaciones;

import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
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




public class VerificarObligatoriedadDeLosCampos {
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
  public void testAltaSinAdjunto() throws Exception {
    /* maximizar navegador*/
	driver.manage().window().maximize();
	/* maximizar navegador*/
    driver.get(baseUrl + "postulaciones");
    driver.findElement(By.id("edit-submit-button")).click();
    boolean a = driver.getPageSource().contains("El campo Nombres es obligatorio.");
    assertTrue(a);
    boolean b = driver.getPageSource().contains("El campo Apellido es obligatorio.");
    assertTrue(b);
    boolean c = driver.getPageSource().contains("El campo Teléfono es obligatorio.");
    assertTrue(c);
    boolean d = driver.getPageSource().contains("El campo DNI es obligatorio.");
    assertTrue(d);
    boolean e = driver.getPageSource().contains("El campo Correo Electrónico es obligatorio.");
    assertTrue(e);
    boolean f = driver.getPageSource().contains("El campo Adjuntar archivo: es obligatorio.");
    assertTrue(f);
    boolean g = driver.getPageSource().contains("El campo He leído");
    assertTrue(g);
    System.out.println("Taking Screen Shot");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("/home/aluna/Desktop/capturas/postulaciones/testingv2/capturas/VerificarObligatoriedadDeLosCampos.png"));    
	
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
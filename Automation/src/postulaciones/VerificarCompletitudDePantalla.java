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
    boolean a = driver.getPageSource().contains("Datos Personales");
    assertTrue(a);
    boolean b = driver.getPageSource().contains("nombres");
    assertTrue(b);
    boolean c = driver.getPageSource().contains("apellido");
    assertTrue(c);
    boolean d = driver.getPageSource().contains("telefono");
    assertTrue(d);
    boolean f = driver.getPageSource().contains("dni");
    assertTrue(f);  
    boolean g = driver.getPageSource().contains("mail");
    assertTrue(g);
    boolean h = driver.getPageSource().contains("pais_residencia");
    assertTrue(h);
    boolean i = driver.getPageSource().contains("fecha_nacimiento[month]");
    assertTrue(i);
    boolean j = driver.getPageSource().contains("fecha_nacimiento[day]");
    assertTrue(j);
    boolean k = driver.getPageSource().contains("fecha_nacimiento[year]");
    assertTrue(k);
    boolean l = driver.getPageSource().contains("genero");
    assertTrue(l);
    boolean m = driver.getPageSource().contains("nivel_de_estudio");
    assertTrue(m);
    boolean n = driver.getPageSource().contains("titulo_obtenido");
    assertTrue(n);
    driver.findElement(By.id("edit-otro-estudio")).click();
    boolean o = driver.getPageSource().contains("nivel_de_estudio2");
    assertTrue (o);
    boolean p = driver.getPageSource().contains("titulo_obtenido2");
    assertTrue (p);
    boolean q = driver.getPageSource().contains("area_de_estudio2");
    assertTrue (q);
    boolean r = driver.getPageSource().contains("años_de_experiencia_laboral_en_apn");
    assertTrue (r);
    
        
    
    System.out.println("Taking Screen Shot");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("//home/nicolas/Capturas/Postulaciones/verificarCompletitudDePantalla.png"));	

     	
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

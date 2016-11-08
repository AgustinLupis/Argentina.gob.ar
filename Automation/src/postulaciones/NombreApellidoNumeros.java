package postulaciones;

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




public class NombreApellidoNumeros {
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
    driver.findElement(By.id("edit-nombres")).clear();
    driver.findElement(By.id("edit-nombres")).sendKeys("123456");
    driver.findElement(By.id("edit-apellido")).clear();
    driver.findElement(By.id("edit-apellido")).sendKeys("123456");
    driver.findElement(By.id("edit-telefono")).clear();
    driver.findElement(By.id("edit-telefono")).sendKeys("43211212");
    driver.findElement(By.id("edit-dni")).clear();
    driver.findElement(By.id("edit-dni")).sendKeys("23111222");
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("asd@asd.com");
    driver.findElement(By.xpath("//div[@id='edit-pais-residencia']/label")).click();
    new Select(driver.findElement(By.id("edit-provincia"))).selectByVisibleText("Buenos Aires");
    driver.findElement(By.id("edit-localidad")).clear();
    driver.findElement(By.id("edit-localidad")).sendKeys("asdasd");
    driver.findElement(By.xpath("//div[@id='edit-genero']/label")).click();
    new Select(driver.findElement(By.id("edit-nivel-de-estudio"))).selectByVisibleText("Secundaria");
    new Select(driver.findElement(By.id("edit-estado-cursada"))).selectByVisibleText("Completo");
    driver.findElement(By.id("edit-titulo-obtenido")).clear();
    driver.findElement(By.id("edit-titulo-obtenido")).sendKeys("asd");
    new Select(driver.findElement(By.id("edit-aos-de-experiencia-laboral-en-apn"))).selectByVisibleText("0-1 Años");
    driver.findElement(By.xpath("//div[@id='edit-trabajo-en-sector-publico']/label")).click();
    driver.findElement(By.id("edit-en-donde")).clear();
    driver.findElement(By.id("edit-en-donde")).sendKeys("asd");
    driver.findElement(By.xpath("//div[@id='edit-trabaja-actualmente']/label")).click();
    driver.findElement(By.id("edit-nombre-organizacion")).clear();
    driver.findElement(By.id("edit-nombre-organizacion")).sendKeys("asd");
    new Select(driver.findElement(By.id("edit-jerarquia"))).selectByVisibleText("Jefe/Superior");
    driver.findElement(By.xpath("//div[@id='edit-lugar-de-trabajo-deseado']/label")).click();
    driver.findElement(By.xpath("//div[@id='edit-desea-postularse']/label")).click();
    driver.findElement(By.xpath("//div[@id='edit-discapacidad']/label")).click();
    driver.findElement(By.xpath("//div[@id='edit-discapacidad-certificado']/label")).click();
    driver.findElement(By.id("edit-comentario")).clear();
    driver.findElement(By.id("edit-comentario")).sendKeys("asd");
    LocalFileDetector detector = new LocalFileDetector();
    File file = detector.getLocalFile("/home/nicolas/Para Adjuntar/pdf.pdf");
    driver.findElement(By.name("files[cv]")).sendKeys(file.getAbsolutePath());
    driver.findElement(By.id("edit-terminos-y-condiciones")).click();
    driver.findElement(By.id("edit-submit-button")).click();
    String actText = driver.findElement(By.xpath("//main/div/div")).getText();
    System.out.println("Taking Screen Shot");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("/home/nicolas/Capturas/nombreapellidonumeros.png"));	
	
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
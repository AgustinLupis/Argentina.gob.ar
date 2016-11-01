package CasaDelFuturo;

import java.util.regex.Pattern;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class CaminoFelizCasaDelFuturo {
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
  public void testCaminoFelizCasaDelFuturo() throws Exception {
    driver.get(baseUrl + "cuestionario-casa-del-futuro");
    driver.findElement(By.id("edit-nombre-apellido")).clear();
    driver.findElement(By.id("edit-nombre-apellido")).sendKeys("roberto gomez bolaños");
    driver.findElement(By.id("edit-identidad-de-genero")).clear();
    driver.findElement(By.id("edit-identidad-de-genero")).sendKeys("masculino");
    driver.findElement(By.id("edit-nacionalidad")).clear();
    driver.findElement(By.id("edit-nacionalidad")).sendKeys("argentino");
    driver.findElement(By.id("edit-numero-cuil")).clear();
    driver.findElement(By.id("edit-numero-cuil")).sendKeys("29333331111");
    driver.findElement(By.id("edit-edad-solicitante")).clear();
    driver.findElement(By.id("edit-edad-solicitante")).sendKeys("21");
    driver.findElement(By.id("edit-estado-civil")).clear();
    driver.findElement(By.id("edit-estado-civil")).sendKeys("soltero");
    driver.findElement(By.id("edit-telefono-fijo")).clear();
    driver.findElement(By.id("edit-telefono-fijo")).sendKeys("12312312");
    driver.findElement(By.id("edit-telefono-celular")).clear();
    driver.findElement(By.id("edit-telefono-celular")).sendKeys("1928473645");
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("qa@asd.com");
    new Select(driver.findElement(By.id("edit-fecha-nacimiento-month"))).selectByVisibleText("Ago");
    new Select(driver.findElement(By.id("edit-fecha-nacimiento-day"))).selectByVisibleText("17");
    new Select(driver.findElement(By.id("edit-fecha-nacimiento-year"))).selectByVisibleText("1989");
    driver.findElement(By.id("edit-numero-documento")).clear();
    driver.findElement(By.id("edit-numero-documento")).sendKeys("37111666");
    driver.findElement(By.xpath("//div[@id='edit-escolaridad']/label[2]")).click();
    driver.findElement(By.cssSelector("label.btn.btn-default")).click();
    driver.findElement(By.xpath("//div[@id='edit-modalidad']/div/label")).click();
    driver.findElement(By.xpath("//div[@id='edit-turno']/div/label")).click();
    driver.findElement(By.xpath("//div[@id='edit-nivel']/div/label")).click();
    driver.findElement(By.id("edit-max-nivel-primero-secundario")).click();
    driver.findElement(By.xpath("//div[@id='edit-salud']/label[2]")).click();
    driver.findElement(By.id("edit-cual")).clear();
    driver.findElement(By.id("edit-cual")).sendKeys("asd");
    driver.findElement(By.xpath("//div[@id='edit-enfermedades']/label[2]")).click();
    driver.findElement(By.xpath("//div[@id='edit-enfermedades-hogar']/div/label[2]")).click();
    driver.findElement(By.xpath("//div[@id='edit-situacion-empleo']/label[2]")).click();
    driver.findElement(By.cssSelector("#edit-situacion-empleo > label.btn.btn-default")).click();
    driver.findElement(By.id("edit-tipo-situacion-empleador-patron")).click();
    driver.findElement(By.id("edit-cual-empleo")).clear();
    driver.findElement(By.id("edit-cual-empleo")).sendKeys("asd");
    driver.findElement(By.id("edit-formal")).clear();
    driver.findElement(By.id("edit-formal")).sendKeys("asd");
    driver.findElement(By.id("edit-vivienda")).clear();
    driver.findElement(By.id("edit-vivienda")).sendKeys("lavalle");
    driver.findElement(By.id("edit-altura")).clear();
    driver.findElement(By.id("edit-altura")).sendKeys("333");
    driver.findElement(By.id("edit-piso")).clear();
    driver.findElement(By.id("edit-piso")).sendKeys("3");
    driver.findElement(By.id("edit-dpto")).clear();
    driver.findElement(By.id("edit-dpto")).sendKeys("2");
    driver.findElement(By.id("edit-villa")).clear();
    driver.findElement(By.id("edit-villa")).sendKeys("villa");
    driver.findElement(By.id("edit-manzana")).clear();
    driver.findElement(By.id("edit-manzana")).sendKeys("1");
    driver.findElement(By.id("edit-casa")).clear();
    driver.findElement(By.id("edit-casa")).sendKeys("1");
    driver.findElement(By.id("edit-edificio")).clear();
    driver.findElement(By.id("edit-edificio")).sendKeys("1");
    driver.findElement(By.id("edit-habitacion")).clear();
    driver.findElement(By.id("edit-habitacion")).sendKeys("1");
    driver.findElement(By.id("edit-barrio")).clear();
    driver.findElement(By.id("edit-barrio")).sendKeys("1");
    driver.findElement(By.id("edit-comuna")).clear();
    driver.findElement(By.id("edit-comuna")).sendKeys("1");
    driver.findElement(By.id("edit-provincia")).clear();
    driver.findElement(By.id("edit-provincia")).sendKeys("1");
    driver.findElement(By.id("edit-municipio")).clear();
    driver.findElement(By.id("edit-municipio")).sendKeys("1");
    driver.findElement(By.id("edit-localidad")).clear();
    driver.findElement(By.id("edit-localidad")).sendKeys("1");
    driver.findElement(By.id("edit-cp")).clear();
    driver.findElement(By.id("edit-cp")).sendKeys("1");
    driver.findElement(By.id("edit-fraccion")).clear();
    driver.findElement(By.id("edit-fraccion")).sendKeys("1");
    driver.findElement(By.id("edit-entre-calles")).clear();
    driver.findElement(By.id("edit-entre-calles")).sendKeys("asd");
    driver.findElement(By.id("edit-tipo-casa")).click();
    driver.findElement(By.xpath("//div[@id='edit-ambientes']/div/label")).click();
    driver.findElement(By.id("edit-dueno-vivienda-vivienda-terreno")).click();
    driver.findElement(By.xpath("//div[@id='edit-hijos']/div/label")).click();
    new Select(driver.findElement(By.id("edit-cantidad-convivientes"))).selectByVisibleText("2");
    driver.findElement(By.id("edit-cuantos")).clear();
    driver.findElement(By.id("edit-cuantos")).sendKeys("2");
    driver.findElement(By.xpath("//div[@id='edit-planes']/label[2]")).click();
    driver.findElement(By.id("edit-nombre1")).clear();
    driver.findElement(By.id("edit-nombre1")).sendKeys("alberto");
    driver.findElement(By.id("edit-apellido1")).clear();
    driver.findElement(By.id("edit-apellido1")).sendKeys("cofme");
    driver.findElement(By.id("edit-edad1")).clear();
    driver.findElement(By.id("edit-edad1")).sendKeys("12");
    driver.findElement(By.id("edit-sexo1")).clear();
    driver.findElement(By.id("edit-sexo1")).sendKeys("masculino");
    driver.findElement(By.id("edit-nombre2")).clear();
    driver.findElement(By.id("edit-nombre2")).sendKeys("carlos");
    driver.findElement(By.id("edit-apellido2")).clear();
    driver.findElement(By.id("edit-apellido2")).sendKeys("lopez");
    driver.findElement(By.id("edit-edad2")).clear();
    driver.findElement(By.id("edit-edad2")).sendKeys("12");
    driver.findElement(By.id("edit-sexo2")).clear();
    driver.findElement(By.id("edit-sexo2")).sendKeys("masculino");
    driver.findElement(By.id("edit-nombre3")).clear();
    driver.findElement(By.id("edit-nombre3")).sendKeys("raul");
    driver.findElement(By.id("edit-apellido3")).clear();
    driver.findElement(By.id("edit-apellido3")).sendKeys("portales");
    driver.findElement(By.id("edit-edad3")).clear();
    driver.findElement(By.id("edit-edad3")).sendKeys("12");
    driver.findElement(By.id("edit-sexo3")).clear();
    driver.findElement(By.id("edit-sexo3")).sendKeys("masculino");
    driver.findElement(By.id("edit-submit-button")).click();
  }

  @After
  public void tearDown() throws Exception {
    /*driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }*/
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


package Argentina.gob.ar.Argentina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_renovardni {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.argentina.gob.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTCRenovardni() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div[3]/div/div/a/div")).click();
    try {
      assertEquals("Renovar el DNI | Argentina.gob.ar", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Sacá un turno")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Sacá un turno")).click();
    try {
      assertTrue(isElementPresent(By.linkText("DNI en 24 horas para argentinos solo en CABA")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("DNI en 24 horas para argentinos solo en CABA")).click();
    try {
      assertTrue(isElementPresent(By.linkText("Buscá la oficina más cercana en el mapa")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Buscá la oficina más cercana en el mapa")).click();
    try {
      assertTrue(isElementPresent(By.linkText("formulario")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("formulario")).click();
    try {
      assertTrue(isElementPresent(By.linkText("lugares habilitados")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("lugares habilitados")).click();
    try {
      assertTrue(isElementPresent(By.linkText("Centros de Gestión y Participación de CABA")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Centros de Gestión y Participación de CABA")).click();
    try {
      assertTrue(isElementPresent(By.linkText("Registros Civiles de todo el país")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Registros Civiles de todo el país")).click();
    try {
      assertTrue(isElementPresent(By.linkText("actualización")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("actualización")).click();
    try {
      assertTrue(isElementPresent(By.linkText("estado del trámite en línea")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("estado del trámite en línea")).click();
    try {
      assertTrue(isElementPresent(By.linkText("Línea gratuita 0800-999-9364")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Línea gratuita 0800-999-9364")).click();
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
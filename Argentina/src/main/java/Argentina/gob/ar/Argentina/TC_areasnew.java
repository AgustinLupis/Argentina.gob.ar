package Argentina.gob.ar.Argentina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_areasnew {
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
  public void testTCAreasnew() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Áreas")).click();
    try {
      assertEquals("Áreas de Gobierno | Argentina.gob.ar", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-facebook")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-twitter")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("ul.list-inline > li.last")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Presidencia de la Nación")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Presidencia de la Nación")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Secretaría General")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Secretaría General")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("secretariageneral@presidencia.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("legalytecnica@slyt.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Sedronar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Sedronar")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("jcasmil@presidencia.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Jefatura de Gabinete de Ministros")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Jefatura de Gabinete de Ministros")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("mpena@argentina.gob.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
      try {
      assertTrue(isElementPresent(By.linkText("Secretaría de Asuntos Estratégicos")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Secretaría de Asuntos Estratégicos")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Secretaría de Comunicación Pública")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Secretaría de Comunicación Pública")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Secretaría de Coordinación Interministerial")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Secretaría de Coordinación Interministerial")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Secretaría de Coordinación de Políticas Públicas")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Secretaría de Coordinación de Políticas Públicas")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.cssSelector("a > strong")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("a > strong")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Agencia de Administración de Bienes del Estado")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Agencia de Administración de Bienes del Estado")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Unidad Plan Belgrano")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Unidad Plan Belgrano")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Agroindustria")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Agroindustria")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Ambiente y Desarrollo Sustentable")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Ambiente y Desarrollo Sustentable")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Ciencia, Tecnología e Innovación Productiva")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("info@mincyt.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Ciencia, Tecnología e Innovación Productiva")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Comunicaciones")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Comunicaciones")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Cultura")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("info@correocultura.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("mindef@mindef.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Defensa")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Desarrollo Social")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("mdsyma@desarrollosocial.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Desarrollo Social")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Educación y Deportes")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Educación y Deportes")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Energía y Minería")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Energía y Minería")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Hacienda y Finanzas")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("ciudadano@mecon.gob.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Hacienda y Finanzas")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio del Interior, Obras Públicas y Vivienda")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio del Interior, Obras Públicas y Vivienda")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Justicia y Derechos Humanos")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Justicia y Derechos Humanos")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Modernización")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Modernización")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Producción")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("info@producción.gob.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Producción")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Relaciones Exteriores y Culto")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Relaciones Exteriores y Culto")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Salud")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("consultas@msal.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Salud")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Seguridad")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Seguridad")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Trabajo, Empleo y Seguridad Social")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("consultas@trabajo.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Trabajo, Empleo y Seguridad Social")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Transporte")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Transporte")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio de Turismo")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("ministerio@turismo.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio de Turismo")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Congreso de la Nación Argentina")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Congreso de la Nación Argentina")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Honorable Senado de la Nación")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Honorable Senado de la Nación")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Honorable Cámara de Diputados de la Nación")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Honorable Cámara de Diputados de la Nación")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Corte Suprema de Justicia de la Nación")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("jurisprudencia@csjn.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Corte Suprema de Justicia de la Nación")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio Público Fiscal – Procuración General de la Nación")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("web@mpf.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio Público Fiscal – Procuración General de la Nación")).click();
    driver.get(baseUrl + "/areas");
    try {
      assertTrue(isElementPresent(By.linkText("Ministerio Público de la Defensa")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("mesaentradas@mpd.gov.ar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ministerio Público de la Defensa")).click();
    driver.get(baseUrl + "/areas");
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
package Argentina.gob.ar.Argentina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_sedronar {
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
  public void testTCSedronar() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Áreas")).click();
    driver.findElement(By.linkText("Sedronar")).click();
    try {
      assertEquals("SEDRONAR", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("i.fa.fa-comments")).click();
    driver.get(baseUrl + "sedronar");
    driver.findElement(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[2]/a/div")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Recibir atención ante el consumo problemático de alcohol y drogas | Argentina.gob.ar".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-map-marker")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[3]/a/div")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Ubicar centros preventivos, asistenciales y comunitarios de la SEDRONAR | Argentina.gob.ar".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[4]/a/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("i.fa.fa-user-plus")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Actuar como agente de prevención ante el consumo problemático de drogas y alcohol | Argentina.gob.ar".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[5]/a/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("i.fa.fa-laptop")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Recibir capacitación sobre consumos problemáticos de drogas y alcohol | Argentina.gob.ar".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-pencil-square-o")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[6]/a/div")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Registrar una institución prestadora de servicios asistenciales en la SEDRONAR | Argentina.gob.ar".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[7]/a/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='block-system-main']/section[2]/div/div/div/div/div/div[7]/a/div")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("OAD - Observatorio Argentino de Drogas".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "sedronar");
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-map-o")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-spinner")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-line-chart")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-crosshairs")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("i.fa.fa-flag")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img.img-responsive.img-rounded")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
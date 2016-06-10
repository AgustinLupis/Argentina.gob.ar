package Argentina.gob.ar.Argentina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Header {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.argentina.gob.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTCHeader() throws Exception {
    driver.get(baseUrl + "/");
    try {
      assertEquals("Áreas", driver.findElement(By.linkText("Áreas")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("País", driver.findElement(By.linkText("País")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Ayuda", driver.findElement(By.linkText("Ayuda")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Servicios")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Áreas")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("País")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Ayuda")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-search")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    try {
      assertEquals("Servicios", driver.findElement(By.linkText("Servicios")).getText());
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
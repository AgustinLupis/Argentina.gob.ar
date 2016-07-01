package Argentina.gob.ar.Argentina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Footer {
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
  public void testTCFooter() throws Exception {
    driver.get(baseUrl + "/");
    try {
      assertTrue(isElementPresent(By.cssSelector("ul.menu.nav > li.first.leaf > a")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Áreas')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'País')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Mapa del Estado")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("ul.menu.nav > li.last.leaf > a")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Acerca de este sitio")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Términos y condiciones")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Créditos")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("ul.menu.nav > li.first.leaf > a")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Áreas')])[2]")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'País')])[2]")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Mapa del Estado")).click();
    driver.get("https://www.argentina.gob.ar/");
    driver.findElement(By.cssSelector("ul.menu.nav > li.last.leaf > a")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Acerca de este sitio")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Términos y condiciones")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Créditos")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inicio\"]")).click();
    driver.findElement(By.linkText("Creative Commons Reconocimiento 2.5 Argentina License")).click();
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
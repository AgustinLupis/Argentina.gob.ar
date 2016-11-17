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




public class BotonMinisterios {
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
		//driver.manage().window().maximize();
		/* maximizar navegador*/
	    driver.get(baseUrl + "postulaciones");
	    driver.findElement(By.id("edit-postulaciones-preferenciales-fieldset")).click();
	    boolean a = driver.getPageSource().contains("postulaciones_preferenciales[minsiterio_de_agroindustria]");
	    assertTrue(a);
	    boolean b = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_ambiente_y_desarrollo_sustentable]");
	    assertTrue(b);
	    boolean c = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_ciencia_tecnologia_e_innovación]");
	    assertTrue(c);
	    boolean d = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_comunicaciones]");
	    assertTrue(d);
	    boolean e = driver.getPageSource().contains("postulaciones_preferenciales[minsitrerio_de_cultura]");
	    assertTrue(e);
	    boolean f = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_defensa]");
	    assertTrue(f);
	    boolean g = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_desarrollo_social]");
	    assertTrue (g);
	    boolean h = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_educacion_y_deporte]");
	    assertTrue (h);
	    boolean i = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_energia_y_mineria]");
	    assertTrue (i);
	    boolean j = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_hacienda_y_finanazas_publicas]");
	    assertTrue (j);
	    boolean k = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_justicia_y_derechos_humanos]");
	    assertTrue (k);
	    boolean l = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_modernizacion]");
	    assertTrue (l);
	    boolean m = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_produccion]");
	    assertTrue (m);
	    boolean n = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_relaciones_exteriores_y_culto]");
	    assertTrue (n);
	    boolean o = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_salud]");
	    assertTrue (o);
	    boolean p = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de]");
	    assertTrue (p);
	    boolean q = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_trabajo_empleo_y_seguridad_social]");
	    assertTrue (q);
	    boolean r = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_transporte]");
	    assertTrue (r);
	    boolean s =driver.getPageSource().contains("postulaciones_preferenciales[ministerio_de_turismo]");
	    assertTrue (s);
	    boolean t = driver.getPageSource().contains("postulaciones_preferenciales[ministerio_del_interior_vivienda_y_obras_publicas]");
	    assertTrue (t);
	
	}
  
  @After
  public void tearDown() throws Exception {
   // driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
  
}

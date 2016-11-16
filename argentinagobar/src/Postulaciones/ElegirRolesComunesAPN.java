package Postulaciones;


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

public class ElegirRolesComunesAPN {
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
    driver.findElement(By.xpath("(//a[contains(@href, '#')])[5]")).click();
    boolean a = driver.getPageSource().contains("roles_asuntos_legales[asuntos_juridicos]");
    assertTrue(a);
    boolean b = driver.getPageSource().contains("roles_asuntos_legales[asuntos_judiciales]");
    assertTrue(b);
    boolean c = driver.getPageSource().contains("roles_del_area_administrativa_contable[finanzas]");
    assertTrue(c);
    boolean d = driver.getPageSource().contains("roles_del_area_administrativa_contable[presupuesto]");
    assertTrue(d);
    boolean f = driver.getPageSource().contains("roles_del_area_administrativa_contable[contable]");
    assertTrue(f);  
    boolean g = driver.getPageSource().contains("roles_del_area_administrativa_contable[tesoreria]");
    assertTrue(g);
    boolean h = driver.getPageSource().contains("roles_del_area_administrativa_contable[planeamiento_y_control_de_gestion]");
    assertTrue(h);
    boolean i = driver.getPageSource().contains("roles_del_area_administrativa_contable[compras_y_contrataciones]");
    assertTrue(i);
    boolean j = driver.getPageSource().contains("roles_institucionales_y_comunicacion[eventos_ceremonial_y_protocolos]");
    assertTrue(j);
    boolean k = driver.getPageSource().contains("roles_institucionales_y_comunicacion[comunicacion_interna]");
    assertTrue(k);
    boolean l = driver.getPageSource().contains("roles_institucionales_y_comunicacion[comunicacion_externa]");
    assertTrue(l);
    boolean m = driver.getPageSource().contains("roles_institucionales_y_comunicacion[cooperacion_internacional_y_convenios]");
    assertTrue(m);
    boolean n = driver.getPageSource().contains("roles_recursos_humanos[administracion_personal]");
    assertTrue(n);
    boolean o = driver.getPageSource().contains("roles_recursos_humanos[capacitacion_y_desarrollo]");
    assertTrue(o);
    boolean p = driver.getPageSource().contains("roles_recursos_humanos[seleccion_de_personal]");
    assertTrue(p);
    boolean q = driver.getPageSource().contains("roles_recursos_humanos[relaciones_laborales]");
    assertTrue(q);
    boolean r = driver.getPageSource().contains("roles_de_secretarias_recepcionistas[secretaria_privada]");
    assertTrue(r);
    boolean s = driver.getPageSource().contains("roles_de_secretarias_recepcionistas[recepcionistas]");
    assertTrue(s);
    boolean t = driver.getPageSource().contains("roles_de_secretarias_recepcionistas[telefonista]");
    assertTrue(t);
    boolean u = driver.getPageSource().contains("roles_servicios_generales[mantenimiento]");
    assertTrue(u);
    boolean v = driver.getPageSource().contains("roles_servicios_generales[patrimonio]");
    assertTrue(v);
    boolean w = driver.getPageSource().contains("roles_servicios_generales[mesa_de_entradas]");
    assertTrue(w);
    boolean x = driver.getPageSource().contains("roles_servicios_generales[cedeteria]");
    assertTrue(x);
    boolean y = driver.getPageSource().contains("roles_servicios_generales[gestion_edilicia]");
    assertTrue(y);
    boolean z = driver.getPageSource().contains("roles_servicios_generales[seguridad]");
    assertTrue(z);
    boolean aa = driver.getPageSource().contains("roles_servicios_generales[chofer]");
    assertTrue(aa);
    boolean bb = driver.getPageSource().contains("roles_sistemas[administracion_base_de_datos]");
    assertTrue(bb);
    boolean cc = driver.getPageSource().contains("roles_sistemas[analisis_funcional]");
    assertTrue(cc);
    boolean dd = driver.getPageSource().contains("roles_sistemas[data_warehousing]");
    assertTrue(dd);
    boolean ee = driver.getPageSource().contains("roles_sistemas[insfraestructura]");
    assertTrue(ee);
    boolean ff = driver.getPageSource().contains("roles_sistemas[programacion]");
    assertTrue(ff);
    boolean gg = driver.getPageSource().contains("roles_sistemas[redes]");
    assertTrue(gg);
    boolean hh = driver.getPageSource().contains("roles_sistemas[seguridad_informatica]");
    assertTrue(hh);
    boolean ii = driver.getPageSource().contains("roles_sistemas[soporte_tecnico]");
    assertTrue(ii);
    boolean jj = driver.getPageSource().contains("roles_sistemas[testing]");
    assertTrue(jj);
    boolean kk = driver.getPageSource().contains("roles_sistemas[capacitador_informatico]");
    assertTrue(kk);
    boolean ll = driver.getPageSource().contains("roles_sistemas[arquitectura_soluciones]");
    assertTrue(ll);
    boolean mm = driver.getPageSource().contains("roles_sistemas[operadores_NOC]");
    assertTrue(mm);
    boolean nn = driver.getPageSource().contains("roles_sistemas[telefonia_IP]");
    assertTrue(nn);
    boolean oo = driver.getPageSource().contains("roles_auditoria[auditoria_contable]");
    assertTrue(oo);
    boolean pp = driver.getPageSource().contains("roles_auditoria[auditoria_legal]");
    assertTrue(pp);
    boolean qq = driver.getPageSource().contains("roles_auditoria[auditoria_de_sistemas]");
    assertTrue(qq);
    boolean rr = driver.getPageSource().contains("roles_procesos[analista_funcional]");
    assertTrue(rr);
    boolean ss = driver.getPageSource().contains("roles_procesos[project_manager]");
    assertTrue(ss);
    boolean tt = driver.getPageSource().contains("roles_procesos[reingenieria_de_procesos]");
    assertTrue(tt);
    boolean uu = driver.getPageSource().contains("roles_procesos[bussines_intelligence]");
    assertTrue(uu);
        
    System.out.println("Taking Screen Shot");
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("/home/aluna/Desktop/capturas/postulaciones/testingv2/capturas/ElegirRolesComunesAPN.png"));	

     	
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

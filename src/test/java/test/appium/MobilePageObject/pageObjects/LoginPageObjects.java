package test.appium.MobilePageObject.pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.By;

public class LoginPageObjects  extends MobilePageObject{

	public LoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    String edtUsuario = "com.experitest.ExperiBank:id/usernameTextField";
    String edtContrasena = "com.experitest.ExperiBank:id/passwordTextField";
    String btnIngresar = "com.experitest.ExperiBank:id/loginButton";
    String btnPagos = "com.experitest.ExperiBank:id/makePaymentButton";
    String txtSaldo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View\r\n";
    String expense = "com.experitest.ExperiBank:id/expenseReportButton";
    String add="com.experitest.ExperiBank:id/addButton";
    String borrar="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView[1]";
    String extraccion = "//android.widget.ListView/android.widget.LinearLayout";
    int numero1, numero2;
    
    
	public void iniciarApp() throws MalformedURLException {
		//iniciar app
	}

	public void ingresarUsuario(String usuario) {
		element(By.id(this.edtUsuario)).sendKeys(usuario);		
	}

	public void ingresarContrasena(String contrasena) {
		element(By.id(this.edtContrasena)).sendKeys(contrasena);
		
	}

	public void darClicEnBotonIngresar() throws InterruptedException {
		element(By.id(this.btnIngresar)).click();
		element(By.id(expense)).click();
		element(By.id(add)).click();
		element(By.id(add)).click();
		Thread.sleep(2000);
		extraer();
		Thread.sleep(2000);
		element(By.xpath(borrar)).click();
		extraer2();
		
		if (numero1>numero2) {
			System.out.println("Borro columna");
			
			
			
		}
		
	
		assertEquals(numero2, (numero1-1));
	}

	public void validarMensajeSaldo(String mensaje) {
		//waitFor(4).seconds();
		//String mensajeAValidar = element(By.xpath(this.txtSaldo)).getText().toString();
		//System.out.println("mensaje: "+mensajeAValidar+" mensaje feature: "+mensaje);
		//c
	}
	
	public void extraer() {
		List <WebElement> elementos = getDriver().findElements(By.xpath(extraccion));
		System.out.println(elementos.size());
		numero1 = elementos.size();
	}
	public void extraer2() {
		List <WebElement> elementos2 = getDriver().findElements(By.xpath(extraccion));
		System.out.println(elementos2.size());
		numero2 = elementos2.size();
		
		
		
	}
	
	
}

package test.appium.MobilePageObject.steps;

import java.net.MalformedURLException;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import test.appium.MobilePageObject.pageObjects.LoginPageObjects;

public class LoginSteps {

	LoginPageObjects loginPageObjects;
	
	@Step
	public void iniciarAplicacion() throws MalformedURLException {
		loginPageObjects.iniciarApp();
		Serenity.takeScreenshot();
		
	}
	
	@Step
	public void loguinConUsuarioYContrasena(String usuario, String contrasena) throws InterruptedException {
		Serenity.takeScreenshot();
		loginPageObjects.ingresarUsuario(usuario);
		loginPageObjects.ingresarContrasena(contrasena);
		loginPageObjects.darClicEnBotonIngresar();
		Serenity.takeScreenshot();
		
	}

	@Step
	public void validarIngreso(String mensaje) {
		loginPageObjects.validarMensajeSaldo(mensaje);
		Serenity.takeScreenshot();
		
	}
	@Step
	public void extraer() {
		loginPageObjects.extraer();
	}


}

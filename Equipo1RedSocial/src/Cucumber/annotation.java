package Cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import modelo.Usuario;
import persistencia.DAOUsuario;

public class annotation {
	
	private DAOUsuario usuario=null;
	Usuario user = new Usuario();
	
	@Given("^Un usuario y password$")
	public void Un_usuario_y_password() {
		usuario= new DAOUsuario(); 
		user=new Usuario();
	}
	
	@Then("^se loguea$")
	public void se_loguea() throws Throwable {
    	assertFalse(null==user);
	}
	

	@When("^usuario correcto y password correcta$")
	public void usuario_correcto_y_password_correcta() {
		String email="prueba@gmail.com";
		String pwd="123456";
		user.setDireccion(email);
		user.setPwd(pwd);
		try {
			user=usuario.select(user.getDireccion(), user.getPwd());
		} catch (Exception e) {
			assertFalse(true);
		}
		
	}
	
	
	@When("^Usuario incorrecto y una password incorrecta$")
	public void Usuario_incorrecto_y_una_password_incorrecta() {
	   String email="prueba80@gmail.com";
	   String pwd="12345";
	   user.setDireccion(email);
	   user.setPwd(pwd);
	   try {
		   user=usuario.select(user.getDireccion(),user.getPwd());
	   }catch(Exception e) {
		   assertFalse(true);
	   }
	   
	}

	@Then("^no se loguea$")
	public void no_se_loguea() {
	  assertTrue(null==user);
	}
	
	@Given("^un usuario$")
	public void un_usuario() {
		usuario= new DAOUsuario(); 
		user=new Usuario();
	}

	@When("^se hace logout$")
	public void se_hace_logout() {
	   usuario.delete(user);
	}

	@Then("^se sale$")
	public void se_sale() {
		String n=user.getDireccion();
	    assertTrue(n==null);
	}


}

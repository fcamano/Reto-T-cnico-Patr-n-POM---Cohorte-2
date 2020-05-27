package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//@DefaultUrl("https://trello.com/login")

@DefaultUrl("https://id.atlassian.com/login?application=trello&continue=https%3A%2F%2Ftrello.com%2Fauth%2Fatlassian%2Fcallback%3FreturnUrl%3D%252F%26csrf%3D5X36CQOpNqLzzAD02j%252BDvMXiTACRfVztUiw%252BDJOLuiA%253D%26display%3D&email=fcamano%40choucairtesting.com&errorCode&login_hint=fcamano%40choucairtesting.com&restrict=true")
public class TrelloLoginPage extends PageObject {
   
	// campo usuario
	//@FindBy (xpath= "//*[@id='user']")    
	//public WebElementFacade txtUsername;
	
	//Campo password
	//@FindBy (xpath= "//*[@id=\"password\"]")  // primera pagina
	@FindBy (xpath= "//INPUT[@id='password']")  //segunda pagina
	public WebElementFacade txtPassword;

	//boton
	
	//*[@id="login"]
//	@FindBy (xpath= "//*[@id=\"login\"]") //primera pagina
	@FindBy (xpath= "//*[@id=\"login-submit\"]/span/span") //segunda pagina
	public WebElementFacade btnSignIn;
		
	//Campo password
	//@FindBy (xpath= "//INPUT[@id='password']")
	//public WebElementFacade txtPassword1;
	
	//@FindBy (xpath= "//*[@id='login']")
	//public WebElementFacade btnSignIn1;
	


	//label de home a verficar
	@FindBy (xpath= "//*[@id='content']/div/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/h3")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos(String strUsuario,String strPass) {
		//txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		//txtPassword1.sendKeys(strPass);
		btnSignIn.click();
		//btnSignIn1.click();
	}
	public void VerificarHome() {
		String labelv ="Tableros personales";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje,containsString(labelv));
	}

}

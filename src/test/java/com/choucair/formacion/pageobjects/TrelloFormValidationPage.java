package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrelloFormValidationPage extends PageObject{
	
	
	
	@FindBy(xpath="//INPUT[@placeholder='Añadir título de tablero']")
	public WebElementFacade txtTablero;	
	
	@FindBy(xpath="//INPUT[@placeholder='Añadir título de tablero']")
	public WebElementFacade txtCrear;
	
	@FindBy(xpath="(//SPAN[text()='Crear tablero'])[1]")
	public WebElementFacade btnValidate;
	
	public void Required(String dataPrueba) {
		txtTablero.click();
		txtTablero.clear();
		txtTablero.sendKeys(dataPrueba);
		
	}
	public void validate() {
		btnValidate.click();
	}


}

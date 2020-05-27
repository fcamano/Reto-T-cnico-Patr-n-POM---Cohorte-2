package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matcher.containsString;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class TreelloMenuPage extends PageObject{
	
	@FindBy(xpath="//DIV[@class='board-tile mod-add']")
	public WebElementFacade CreaTablero;
	
public void menuFormValidation() {
	CreaTablero.click();
	//menuFormValidation.click();
	//String strMensaje = 
	
}
	
}

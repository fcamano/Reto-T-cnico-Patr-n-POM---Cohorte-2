package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.TrelloLoginPage;
import com.choucair.formacion.pageobjects.TreelloMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationTrelloSteps {
	
	
	TrelloLoginPage trelloLoginPage;
	TreelloMenuPage trelloMenuPage;
	
	@Step
	public void login_trello(String strUsuario, String strPass) {
		trelloLoginPage.open();
		trelloLoginPage.IngresarDatos(strUsuario, strPass);
	}
@Step
public void ingreso_a_la_funcionalidad_trello() {
	trelloMenuPage.menuFormValidation();
}
}

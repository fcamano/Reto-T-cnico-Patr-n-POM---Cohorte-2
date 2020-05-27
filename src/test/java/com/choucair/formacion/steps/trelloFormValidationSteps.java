package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.TrelloFormValidationPage;

import net.thucydides.core.annotations.Step;

public class trelloFormValidationSteps {
	
	TrelloFormValidationPage trelloFormValidationPage;

@Step
public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
	trelloFormValidationPage.Required(data.get(id).get(0).trim());
	trelloFormValidationPage.validate();
}
}

package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.PopupValidationTrelloSteps;
import com.choucair.formacion.steps.trelloFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class PopupValidacionTrelloDefinicion {

	@Steps
	PopupValidationTrelloSteps popupValidationTrelloSteps;
	
	@Steps
	trelloFormValidationSteps trelloFormValidationSteps;
	


@Given("^autentico en trello con usuario  \"([^\"]*)\" y clave \"([^\"]*)\"$")
public void autentico_en_trello_con_usuario_y_clave(String Usuario, String Clave)   {
    // Write code here that turns the phrase above into concrete actions
	popupValidationTrelloSteps.login_trello(Usuario, Clave);
  
}

@Given("^Ingreso a la funcionalidad trello$")
public void ingreso_a_la_funcionalidad_trello()   {
    // Write code here that turns the phrase above into concrete actions
	popupValidationTrelloSteps.ingreso_a_la_funcionalidad_trello();

}

@When("^Diligencio la creacion de un tablero y validacion de nombre$")
public void diligencio_la_creacion_de_un_tablero_y_validacion_de_nombre(DataTable dtDatosForm)   {
    // Write code here that turns the phrase above into concrete actions
	List<List<String>> data = dtDatosForm.raw();
	
	for (int i=1; i<data.size(); i++) {
		trelloFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
		
	}

}

@Then("^Verifico ingreso exitoso$")
public void verifico_ingreso_exitoso()   {
    // Write code here that turns the phrase above into concrete actions

}

}

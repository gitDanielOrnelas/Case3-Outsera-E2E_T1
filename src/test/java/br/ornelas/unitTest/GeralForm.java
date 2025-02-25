package br.ornelas.unitTest;

import org.openqa.selenium.WebDriver;

import br.ornelas.Forms.InsurantDataForm;
import br.ornelas.Forms.PriceOptionsForm;
import br.ornelas.Forms.ProductDataForm;
import br.ornelas.Forms.SendQuoteForm;
import br.ornelas.Forms.ValidaMensagemForm;
import br.ornelas.Forms.VehicleDataForm;
import br.ornelas.core.Web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GeralForm {

	private WebDriver navegador;

	@Given("que acesso o site sampleapp")
	public void que_acesso_o_site_sampleapp() {

		navegador = Web.createChrome();
	}

	@And("preencho o formulario VehicleData")
	public void preencho_o_formulario_vehicle_data() throws InterruptedException {

		new VehicleDataForm(navegador).preenchendoVehicle();
	}

	@And("preencho o formulario InsurantData")
	public void preencho_o_formulario_insurant_data() throws InterruptedException {

		new InsurantDataForm(navegador).preenchendoInsurant();
	}

	@And("preencho o formulario ProductData")
	public void preencho_o_formulario_product_data() throws InterruptedException {

		new ProductDataForm(navegador).preenchendoProduct();
	}

	@And("preencho o formulario PriceOption")
	public void preencho_o_formulario_price_option() throws InterruptedException {

		new PriceOptionsForm(navegador).preenchendoPrice();
	}

	@When("enviar para o email")
	public void enviar_para_o_email() throws InterruptedException {

		new SendQuoteForm(navegador).preenchendoSend();
	}

	@Then("valida mensagem")
	public void valida_mensagem() throws InterruptedException {

		new ValidaMensagemForm(navegador).validaMensagem();

		navegador.quit();
	}
}

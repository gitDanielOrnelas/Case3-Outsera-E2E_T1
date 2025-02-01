package br.ornelas.pages;

import org.openqa.selenium.WebDriver;

import br.ornelas.Forms.InsurantDataForm;
import br.ornelas.Forms.PriceOptionsForm;
import br.ornelas.Forms.ProductDataForm;
import br.ornelas.Forms.SendQuoteForm;
import br.ornelas.Forms.ValidaMensagemForm;
import br.ornelas.Forms.VehicleDataForm;

public class FormPage {

	private WebDriver navegador;

	public VehicleDataForm preencherVehicleData() throws InterruptedException {

		return new VehicleDataForm (navegador);
	}
	public InsurantDataForm preencherInsurantData() throws InterruptedException {

		return new InsurantDataForm (navegador);
	}
	public ProductDataForm preencherProductData() throws InterruptedException {

		return new ProductDataForm (navegador);
	}
	public PriceOptionsForm preencherPriceOptions() throws InterruptedException {

		return new PriceOptionsForm (navegador);
	}
	public SendQuoteForm preencherSendQuote() throws InterruptedException {

		return new SendQuoteForm (navegador);
	}
	public ValidaMensagemForm validaMensagem() throws InterruptedException {

		return new ValidaMensagemForm (navegador);
	}  
}



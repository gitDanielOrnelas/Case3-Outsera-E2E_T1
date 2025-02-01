package br.ornelas.Forms;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ValidaMensagemForm {
	
	private WebDriver navegador;
	
	public ValidaMensagemForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public ValidaMensagemForm validaMensagem() {
	    WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));

	    // Espera o elemento com a mensagem aparecer
	    WebElement telaFinal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Sending e-mail success!')]")));
	    
	    String validaEnvio = telaFinal.getText();
	    
	    // Verifica se a mensagem está correta
	    assertEquals("Sending e-mail success!", validaEnvio);
	  	//assertEquals("Mensagem errada!",validaEnvio); //Mensagem Fail
	   
	 return new ValidaMensagemForm(navegador);
	 
	}

}



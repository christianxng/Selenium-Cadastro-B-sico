package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroGmail {

	
	static WebDriver driver;

	public CadastroGmail(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void preencherCampos()
	{
		// CAMPO Primeiro Nome
		WebElement PrimeiroNome = driver.findElement(By.id("FirstName"));		
		PrimeiroNome.sendKeys("Christian");
		
		// CAMPO Resto Nome
		WebElement SegundoNome = driver.findElement(By.id("LastName"));	
		SegundoNome.sendKeys("Rodrigues Moura");
		
		// CAMPO EMAIL
		WebElement Email = driver.findElement(By.id("GmailAddress"));	
		Email.sendKeys("teste.validacao25165256156");
		
		WebElement Senha = driver.findElement(By.id("Passwd"));	
		Senha.sendKeys("leandroso");
		
		WebElement ConfirmaSenha = driver.findElement(By.id("PasswdAgain"));	
		ConfirmaSenha.sendKeys("leandroso");
		
		WebElement DiaAniversario = driver.findElement(By.id("BirthDay"));	
		DiaAniversario.sendKeys("23");
		
		WebElement MesAniversario = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		MesAniversario.click();
		
		WebElement MesNovembro = driver.findElement(By.xpath(".//*[@id=':b']/div"));
		MesNovembro.click();
		
		WebElement AnoAniversario = driver.findElement(By.id("BirthYear"));	
		AnoAniversario.sendKeys("1996");
		
		
		WebElement Sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div[1]"));
		Sexo.click();
		
		WebElement SexoMasculino = driver.findElement(By.xpath(".//*[@id=':f']/div"));
		SexoMasculino.click();
		
		WebElement NumeroCelular = driver.findElement(By.id("RecoveryPhoneNumber"));	
		NumeroCelular.sendKeys("31993063511");
		
		// CAMPO EMAIL
		WebElement EmailAtual = driver.findElement(By.id("RecoveryEmailAddress"));	
		EmailAtual.sendKeys("teste.validacao@ufv.br");
		
		
		WebElement Cadastrar = driver.findElement(By.id("submitbutton"));
		Cadastrar.click();
		
		
		WebElement ConcordoCadastrar = driver.findElement(By.id("iagreebutton"));
		ConcordoCadastrar.click();
		
	}
}

package Teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.CadastroGmail;


public class AbrirNavegador {

	// instancia a classe web driver 
	static WebDriver driver; 
	static CadastroGmail cadastro;
	
	/**
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// local do executável ForefoxDriver
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		
		/*System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");		
		
		//System.setProperty("webdriver.opera.driver", "C:/operadriver.exe");	*/
		
		
		// instanciando objeto do Firefox
		driver = new FirefoxDriver();
		
		/*WebDriver driver = new OperaDriver();		
		//driver = new OperaDriver();*/
		
		
		
		
		// instanciando a URL a ser acessada 
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		cadastro = new CadastroGmail(driver);
		
		
	}	

	

	@Test
	public void test() {		
		
		cadastro.preencherCampos();
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
		// fecha apenas a aba usada
		//driver.close();
		// fecha o browser inteiro
		//driver.quit();
	}

}

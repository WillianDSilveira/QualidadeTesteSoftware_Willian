package aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CalculadoraSeleniumTest {

	static WebDriver driver = null;
	
	private static String namePaginaPrincipal;
	
	@BeforeAll
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("http://localhost/exercicio1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
	
	@Test
    public void testTituloPaginaLogin(){
    	// arrange
    	driver.get("http://localhost/exercicio1.html");      
    	String tituloExperado ="Calculadora"; 
        
    	// act, assert
    	Assertions.assertEquals(tituloExperado,driver.getTitle());
    }

}

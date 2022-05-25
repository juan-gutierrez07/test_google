package google.test.stepdefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IngresoStepDefinitions {

    @Steps
    ChromeDriver driver = new ChromeDriver();

    @Dado("que tenemos unos datos abrimos google")
    public void que_tenemos_unos_datos_abrimos_google() {
        // Write code here that turns the phrase above into concrete actions
        try {
            System.out.println("Abriendo navegador..");
            driver.get("https://www.google.com/");
        }catch (Exception e){

        }
    }

    @Entonces("consultamos {string} esa informacion")
    public void consultamos_esa_informacion(String string) {
        // Write code here that turns the phrase above into concrete actions
        try {
            WebElement input = driver.findElement(By.xpath("//input[@title='Buscar']"));
            input.sendKeys(string);
            input.sendKeys(Keys.ENTER);
            System.out.println("Consultamos...\n"+ string);
            driver.quit();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Paso algo..");
            driver.quit();
        }
    }

}

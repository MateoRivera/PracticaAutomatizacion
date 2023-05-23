package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.Validacion;
import co.edu.udea.certification.tasks.OpenThe;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
/*import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;*/
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(CucumberWithSerenity.class)
public class FindHomePageStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor estudiante = Actor.named("Mateo");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
        //estudiante.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de Google")
    public void queMeEncuentroPaginaPrincipal(){

        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
    }

    @When("escriba la palabra U. de A.")
    public void escribaLaPalabraUdeA(){
        estudiante.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerLink(){
        estudiante.should(seeThat(Validacion.theHomePage(),equalTo(true)));
    }
}

package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.IAmInConsumerLoansPage;
import co.edu.udea.certification.tasks.OpenTheConsumerLoansPage;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SimulateFreeInvestmentLoanStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor investor = Actor.named("LosSuperConocidos");

    @Before
    public void preStage(){
        /*driver.manage().window().maximize();
        investor.can(BrowseTheWeb.with(driver));*/
    }

    @Given("I am in personas of bancolombia")
    public void iAmInBancolombiaPersonas(){
        // We maximize the window
        driver.manage().window().maximize();

        // The investor can surf through the browser
        investor.can(BrowseTheWeb.with(driver));
    }

    @When("I click the button know more in credits zone")
    public void iClickKnowMoreCreditsZone(){
        investor.attemptsTo(OpenTheConsumerLoansPage.Browser(new UsuarioPage()));
    }

    @Then("it carries me to consumer loans page")
    public void iAmInConsumerLoansPage(){
        investor.should(seeThat(IAmInConsumerLoansPage.verify(),equalTo(true)));
    }
}

package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.IAmInConsumerLoansPage;
import co.edu.udea.certification.questions.ISeeThreeOptionsForInvesting;
import co.edu.udea.certification.tasks.*;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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

    @When("I close offers")
    public void iCloseOffers(){
        investor.attemptsTo(CloseOffers.Browser(new UsuarioPage()));
    }
    @And("I click the button know more in credits zone")
    public void iClickKnowMoreCreditsZone(){
        investor.attemptsTo(OpenTheConsumerLoansPage.Browser(new UsuarioPage()));
    }

    @And("I click on simulate at Free investment credit Bancolombia zone")
    public void iClickSimulateFreeInvestmentCreditBancolombia(){
        investor.attemptsTo(OpenSimulatorFreeInvestmentCredit.Browser(new UsuarioPage()));
    }

    @And("I click on continue")
    public void iClickContinue(){
        investor.attemptsTo(AcceptFeatures.Browser(new UsuarioPage()));
    }

    @And("I select yes")
    public void iKnowHowMuchDoesINeed(){
        investor.attemptsTo(AcceptQuestion.Browser(new UsuarioPage()));
    }

    @And("I set a random number betweeen 1000000 and 500000000 for a loan")
    public void iWriteAmount(){
        investor.attemptsTo(setAmountToBeSimulated.Browser(new UsuarioPage()));
    }

    @And("I set a random number betweeen 48 and 84 for months")
    public void iWriteMonths(){
        investor.attemptsTo(setMonthsToBeSimulated.Browser(new UsuarioPage()));
    }

    @And("I set a random date")
    public void iSelectMyBirthDate(){
        investor.attemptsTo(setMyBirthDate.Browser());
    }

    @And("I click on simulate")
    public void iClickOnSimulate(){
        investor.attemptsTo(Simulate.Browser(new UsuarioPage()));
    }

    @Then("it carries me three options of credits")
    public void iAmInConsumerLoansPage(){
        investor.should(seeThat(ISeeThreeOptionsForInvesting.verify(),equalTo(true)));
    }
}

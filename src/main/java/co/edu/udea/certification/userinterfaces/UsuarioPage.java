package co.edu.udea.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    // EXAMPLE UDEA
    public static final Target INPUT_TEXT = Target.the("INPUT TEXT").located(By.id("APjFqb"));
    public static final Target INPUT_TEXT1 = Target.the("INPUT TEXT").locatedBy("//*[@id='APjFqb']");
    public static final Target LINK_HOMEPAGE_UDEA = Target.the("Link udea").locatedBy("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");
    public static final Target TEXT_VALIDATION = Target.the("Texto en la homepage").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[4]/section/div[2]/footer/div/div[1]/div/div[3]/p[3]");

    // AUTOMATION EXERCISE WITH BANCOLOMBIA PERSONAS
    public static final Target CLOSE_INITIAL_OFFERS = Target.the("Close initial offers").locatedBy("//*[@id=\"closeModalBtn\"]/span");
    public static final Target LINK_KNOW_MORE_CREDIT_ZONE = Target.the("Link know more credit zone").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target TEXT_VALIDATION_I_AM_IN_CONSUMER_LOANS_PAGE =Target.the("Text in consumer loans page").locatedBy("//*[@id=\"dy-wcm-btti-ac2cf362\"]/div/div/div/div/div[1]/div/h1");
}

package co.edu.udea.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    // AUTOMATION EXERCISE WITH BANCOLOMBIA PERSONAS
    public static final Target CLOSE_INITIAL_OFFERS = Target.the("Close initial offers").locatedBy("//*[@id=\"closeModalBtn\"]/span");
    public static final Target LINK_KNOW_MORE_CREDIT_ZONE = Target.the("Link know more credit zone").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target TEXT_VALIDATION_I_AM_IN_CONSUMER_LOANS_PAGE =Target.the("Text in consumer loans page").locatedBy("//*[@id=\"dy-wcm-btti-ac2cf362\"]/div/div/div/div/div[1]/div/h1");
}

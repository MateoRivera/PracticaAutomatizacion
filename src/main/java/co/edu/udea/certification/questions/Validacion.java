package co.edu.udea.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.questions.Text;


import static co.edu.udea.certification.userinterfaces.UsuarioPage.TEXT_VALIDATION;

public class Validacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        //String stringTemporal = Text.of(TEXT_VALIDATION).viewedBy(actor).asString();
        String stringTemporal = actor.asksFor(Text.of(TEXT_VALIDATION).asString());
        //System.out.println("**********************************"+String.valueOf(stringTemporal.contains("Copyright 2020 Todos los Derechos Reservados")));
        if(stringTemporal.contains("Copyright 2020 Todos los Derechos Reservados"))
            return true;
        return false;
    }

    public static Validacion theHomePage(){
        return new Validacion();
    }
}

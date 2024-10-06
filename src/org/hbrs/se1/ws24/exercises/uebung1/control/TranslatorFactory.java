package org.hbrs.se1.ws24.exercises.uebung1.control;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class TranslatorFactory {

    public static Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();

        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("LLL/yyyy");
        translator.setDate(today.format(format));
        return translator;
    }
}

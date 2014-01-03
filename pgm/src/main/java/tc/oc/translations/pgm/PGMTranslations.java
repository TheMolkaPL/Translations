package tc.oc.translations.pgm;

import java.util.Locale;
import java.util.ResourceBundle;

public enum PGMTranslations {
    MESSAGES("Messages"),
    ERRORS("Errors"),
    USER_INTERFACE("UI"),
    MISC("Miscellaneous");
    private final String key;

    PGMTranslations(final String name) {
        this.key = "PGM" + name;
    }

    public ResourceBundle getResourceBundle(Locale locale) {
        return ResourceBundle.getBundle(this.key, locale);
    }
}

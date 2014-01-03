package tc.oc.translations.projectares;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ProjectAresTranslations {
    MESSAGES("Messages"),
    ERRORS("Errors"),
    USER_INTERFACE("UI"),
    MISC("Miscellaneous");
    private final String key;

    ProjectAresTranslations(final String name) {
        this.key = "PGM" + name;
    }

    public ResourceBundle getResourceBundle(Locale locale) {
        return ResourceBundle.getBundle(this.key, locale);
    }
}

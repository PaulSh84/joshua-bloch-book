package enumsandannotations.useenumsetinsteadofbitfields;

import java.util.EnumSet;
import java.util.Set;

public class CorrectText {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // Any Set could be passed in, but EnumSet is clearly best

    public void applyStyles(Set<Style> styles) {}

    public static void main(String[] args) {
        new CorrectText().applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}

package objectscommonmethods.obeygeneralcontractwhenoverridingequals;

// Broken - violates symmetry!

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;


    public CaseInsensitiveString(String s) {

        this.s = Objects.requireNonNull(s);

    }


    // Broken - violates symmetry!

    @Override
    public boolean equals(Object o) {

        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);

    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");

        String s = "polish";

        boolean res = s.equals(cis);
        System.out.println(res);

        List<CaseInsensitiveString> list = new ArrayList<>();

        list.add(cis);
        boolean res2 = list.contains(s);
        System.out.println(res2);
    }

}

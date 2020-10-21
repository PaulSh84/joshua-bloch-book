package enumsandannotations.useinstancefieldsinsteadofordinals;

// Abuse of ordinal to derive an associated value - DON'T DO THIS

public enum Ensemble {

    SOLO, DUET, TRIO, QUARTET, QUINTET,

    SEXTET, SEPTET, OCTET, NONET, DECTET;


    public int numberOfMusicians() {
        return ordinal() + 1;
    }

    public static void main(String[] args) {
        System.out.println(Ensemble.SOLO.numberOfMusicians());
    }

}

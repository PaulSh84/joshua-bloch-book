package methods.makedefensivecopieswhenneeded;

// Broken "immutable" time period class

import java.util.Date;

public final class Period {

    private final Date start;

    private final Date end;


    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException     if start or end is null
     */

    public Period(Date start, Date end) {

        if (start.compareTo(end) > 0)

            throw new IllegalArgumentException(

                    start + " after " + end);

        this.start = start;

        this.end = end;

    }


    // Repaired constructor - makes defensive copies of parameters

  /*  public Period(Date start, Date end) {

        this.start = new Date(start.getTime());

        this.end   = new Date(end.getTime());



        if (this.start.compareTo(this.end) > 0)

            throw new IllegalArgumentException(

                    this.start + " after " + this.end);

    }*/


    // Repaired accessors - make defensive copies of internal fields

    public Date start() {

        return new Date(start.getTime());

    }



    public Date end() {

        return new Date(end.getTime());

    }



    //...    Remainder omitted


    public static void main(String[] args) {
        // Attack the internals of a Period instance

        Date start = new Date();

        Date end = new Date();

        Period p = new Period(start, end);

        end.setYear(78);  // Modifies internals of p!
    }

    // Second attack on the internals of a Period instance

    Date start2 = new Date();

    Date end2 = new Date();

    Period p2 = new Period(start2, end2);

//    p2.end().setYear(78);  // Modifies internals of p!

}

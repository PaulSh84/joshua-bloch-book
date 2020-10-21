package creatinganddestroyingobjects.factorymethodoverconstructors;

import java.lang.reflect.Array;

public class Examples {

    /*
    factory method
     */
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.TRUE;
    }

    public enum Level {
        FIRST,
        SECOND
    }

    public static void main(String[] args) {
//        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        Object newArr = Array.newInstance(String.class, 5);
//        List<String> strList = Collections.list();
    }



}

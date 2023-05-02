package src.main.oops.classobjects;

public class CODemo9 {

    public static void main(String[] args) {

        System.out.println("***Demonstration.Exploring Wrapper classes\n");
        int x = 10;

        // Coverting primitive int to Integer object
        Integer intOb = new Integer(x);

        // Converting back from Integer Object to primitive
        System.out.println("The integer =" + intOb.intValue());

        long myLong1 = 1294569890123L;
        // Coverting primitive long to Long object
        Long longOb = new Long(myLong1);

      // Converting back from Long Object to primitive long
      long l2 = longOb.longValue();
      System.out.println(" long=" + l2);

        // Coverting primitive int to String object
        String mstring = Integer.toString(x);
        System.out.println("The string=" + mstring);

        String myString2 = "5.7";
        // Converting a String object to primitive type
        Double doubleOb = Double.valueOf(myString2);
        double myDouble = doubleOb.doubleValue();

        System.out.println("The myDouble=" + myDouble);
        //Converting numeric String to primitive int
        int myInt3=Integer.parseInt("125");
        System.out.println("The myInt3=" + myInt3);
        //Following line of code will cause runtime error

       // int int4=Integer.parseInt("Hello");
       // System.out.println("The myInt4=" + int4);
    }

}

/*
For generic programming, the primitive types need to be wrapped into objects to solve certain types of problems.

The process of converting a primitive type into an object of the corresponding wrapper class is termed autoboxing.
For example, int to Integer, double to Double, float to Float, etc. the reverse procedure is called unboxing.
* */
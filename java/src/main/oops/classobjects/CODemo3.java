package src.main.oops.classobjects;

public class CODemo3 {

    public static void main(String[] args) {

        int result = sum(12,34,56);
        System.out.println("Result is "+result);

        result = sum(34,89,74,39,53);
        System.out.println("Result is "+result);

    }

    public static int sum(int... varargs){

        System.out.println("Total number of arguments is "+varargs.length);

        int total = 0;

        for(int k: varargs){
            total += k;
        }

        return total;
    }


}


/*
Passing Variable-Length Arguments to Methods
--------------------------------------------

We can pass a variable number of arguments in the method. This is often referred to as varargs (short name for variable-length arguments).
A method that can accept variable-length arguments is also termed a vararg method (or, variable-arity method).
In Java, you need to put three dots/periods (...) (as shown in sum() method) to be able to use a vararg method.

 */
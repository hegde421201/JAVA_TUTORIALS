package src.main.oops.classobjects;

public class CODemo7 {

    static int x=10;
    int y=20;

    class InnerClass{

        void showInnerMethod() {
            System.out.println("Inside InnerClass.");
            System.out.println("The static Integer ="+x );
            System.out.println("The nonStatic Integer ="+y+"\n");
        }

    }

    // An outer class method that can invoke an inner class method
    void invokeInnerClass(){

        InnerClass innerClass = new InnerClass();
        System.out.println("Invoking an inner class method from an outer class method");
        //Calling the inner class method
        innerClass.showInnerMethod();
    }

    public static void main(String[] args) {

        CODemo7 coDemo7 = new CODemo7();
        coDemo7.invokeInnerClass(); //Invoking an inner class method from an outer class method.

        //creating the inner class object  -- Invoking the inner class method through an inner class object.
        CODemo7.InnerClass innerClass = coDemo7.new InnerClass();
        innerClass.showInnerMethod();
    }
}

/*
 When we place one class inside another class, such a class is called a nested class.
 Java supports both static nested classes and non-static nested classes.
 A non-static nested class is often called an inner class.Here, our focus will be on inner classes only.

 In this context, you need to remember following points:

 The outer class is the one that contains the nested class.
 An inner class can have access to both the static and the non-static members of the outer class.


Nested classes are useful
because they can promote encapsulation with better security.
The logical grouping of the classes is easily maintainable too.

* */


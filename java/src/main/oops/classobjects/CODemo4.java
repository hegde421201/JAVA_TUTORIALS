package src.main.oops.classobjects;

public class CODemo4 {

    //static variables
    static double length=55.9, breadth=18.34;

    //static method
    public static double perimeter() {

        return 2*(length + breadth);
    }


    public static void main(String[] args) {

        System.out.println("Length of the rectangle is "+length);
        System.out.println("Breadth of the rectangle is "+breadth);
        System.out.println("Perimeter of the rectangle is "+perimeter());
    }
}

/*

So far we have seen that a class can have either variables or methods or both.
Collectively, these are called class members.
These variables and methods are called instance variables and instance methods because each time you instantiate a class, a new copy of each is created.
Once we create an object, we can use the dot operator (.) to access these instance variables or methods. We have seen these examples in CODemo2 and CODemo3.java classes

Sometimes we may want a class member to be common to all the class’s objects.
In this case, it makes sense to be able to access them using the class (instead of using an object of the class).
When we create such members, they are called class variables or class methods.
A class member is also known as a static member because in Java, to create a class variable or a class method, you tag them with the static keyword.
*/
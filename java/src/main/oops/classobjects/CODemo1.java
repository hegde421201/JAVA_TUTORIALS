package src.main.oops.classobjects;

//CO --- class object
public class CODemo1 {

int x; //data

void calculate(){ //method
}

public CODemo1(){

    System.out.println("Constructor with no parameter");
}

public CODemo1(int x){
    System.out.println("Constructor with one integer parameter");

    this.x = x;
}

    public CODemo1(int x,int y){
        System.out.println("Constructor with two integer parameters");
    }

    public CODemo1(String x){
        System.out.println("Constructor with one String parameter");
    }


    public static void main(String[] args) {

    CODemo1 cd = new CODemo1();
    }

}





/*
 Class
A class is a blueprint, template, or prototype.
It can describe the behaviors of its objects and is the foundation for how the objects are built or instantiated.

 Object
An object is an instance of a class.
For example : Bus is an object of the Vehicle class.

In a real-world scenario, each of the objects must have two basic characteristics: state and behavior

Java objects follow the same pattern as in any other object-oriented programming language:
Their states are stored in fields (variables), and their capabilities (behaviors) are described through different methods (functions).

To create a class we use the class keyword as seen on line 4 above. The class body is enclosed within curly braces. { }
The data or variables inside a class are termed instance variables.
We can have some methods in the class. Collectively, these data and methods are referred to as class members.

In the above class created with the name CODemo1, we have some integer data - int x. We also have one method defined with the name calculate

For illustration purposes, we have also created the main() method (line 29) inside the class. This is the entry point of our short program.
Line no 14 tells us that we have instantiated the class CODemo1 using the new keyword. The name of this object is cd.
To be more specific, cd is the reference to the object that is created. Due to the new keyword, the object created is referenced by the variable
cd and is also allocated some memory.

Constructors

If we observe carefully, after the new keyword, the class name is followed by a parenthesis. You use this approach to construct an object.
These are constructors that are used to run initialization. Constructors can be both parameterized and non-parameterized.
So, We can pass different arguments to them. In other words, constructors can vary, with a different number of parameters or different types of parameters.

Between line number 11 and 26 we have created 4 different constructors.
Thus the object creation call on line 31 invokes the no-argument constructor. Run this program to verify this concept.

The key points about constructors:
• Constructors are used to initialize objects.
• The class name and the corresponding constructor’s name(s) must be the same.
• Constructors do not have any return types.
• There are two types of constructors: parameterless constructors (sometimes referred to as constructors with no argument or default constructor)
  and constructors with parameter(s) (known as parameterized constructors).
• In general, the common tasks, like initialization of all the variables inside a class, are achieved through constructors

this keyword
--------

If your local variable has the same name as the instance variable, the local variable will
hide the instance variable. In this type of scenario, the keyword this helps to resolve the namespace collision because
it helps to identify which one is a local variable (method parameter) and which one is the instance variable (field). Checkout line 19 for this.
* */
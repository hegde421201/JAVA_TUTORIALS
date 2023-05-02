package src.main.oops.classobjects;

public class CODemo5 {

    private int a;
    public int b;

    private void methodA(){
        System.out.println("Private methodA");
    }

    public void methodB(){
        System.out.println("Public methodB");
    }

    //getter setter methods to set and retrieve the private variable a.
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


}

/*
 When we attach a class member with the public modifier,
 we can access the member from outside the code.
 On the contrary, when you use a private modifier, the member can be accessed only by other members of the class.

 This is why the main() method is always public. It is called by the java runtime system, which is outside the code.

 If we do not use any access modifier for a member, it can be accessed only within the package.

Use the Driver.java to see how these methods are executed.

Here are some benefits of using getter-setter methods:
• We can provide controlled access to data. Notice that now the client code cannot access the private field "a" directly.
• We can make the class variable either read-only or write-only.
  When we provide the getter method only, we can only get the value of the private variable, so it becomes read-only.
Similarly, when you provide only the setter method, you make the variable write-only.
• The prior two points promote the security of the data.
* */

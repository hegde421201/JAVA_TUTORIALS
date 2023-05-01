Class and Objects
-----------------------
These are at the core of OOP. 
A class is the blueprint or template for its objects. 
Objects are instances of a class. Each object has its own state, behavior, and identity. 

In structured programming, we segregate the problem into small functions, and in OOP, we divide the problem into objects. 
We are familiar with data types like int, double, float, and so on. We know that these are built-in data types or primitive data types because they are already defined in the Java language. 
But when we create our own data type, let’s say, Employee, we need to create an Employee class. Just as when you need to create a double variable, we mention the double first,
Similarly, when we need to create a Employee object (e.g., Rajat), we need to mention our Employee class first. So, when we are familiar with OOP, we may say something like this: A
cat is an object from a Mammal class, our bus is an object from a Vehicle class, and so on.

Encapsulation
----------------

In object-oriented programming, we do not allow data to flow freely inside the
system. Instead, we wrap the data and functions into a single unit (i.e., inside a class). The
purpose of encapsulation is at least one of the following:
1) Putting restrictions in place so that the components of an object cannot be accessed directly
2) Binding the data with methods that will act on that data (i.e., forming a capsule)

We will see that data encapsulation is one of the key features in a class. If we
want to promote security, then the data should not be visible to the outside world. We access these data only through the methods defined inside the class.
Therefore, we can think of these methods as the interface between the objects' data and the outside world.
In Java, we can implement encapsulation in various ways. For example, we can use the access specifiers (or modifiers) and getter-setter methods in this context.

Abstraction
------------

The key purpose of abstraction is to show only the essential features and to hide
the background details of implementation. 
Abstraction is also very much related to encapsulation, but the difference may be easily understood with a simple day-to-day
scenario.

When we press a button on the remote control to switch on the television, we do not care
about the internal circuits of the television or how the remote control controls the operation
of the television. 
We know that different buttons on the remote control have different functionalities, and as long as they work properly, we do not care. So, the user is isolated
from the complex implementation details, which are encapsulated within the remote
control (and the television). 
At the same time, the common operations that can be performed through the remote control can be thought of as an abstraction. A manufacturer can
enhance this feature when the same remote can also perform on a different model or product. For example, a music player’s remote control can also be used to control the volume of a television.

Abstraction focuses on the noticeable behavior of an object, and encapsulation focuses on the implementation part of that behavior. 
Encapsulation helps us to bundle the data, and at the same time it can hide some information that you do not want to disclose
to the outside world.

Inheritance
-----------
Inheritance is a process in which one object acquires the properties of another object. Consider the following example. 
Bus is one type of Vehicle because it fulfills the basic criteria of a Vehicle that is used for transportation purposes. 
Similarly, Car is another type of Vehicle. And even though an SUV and a Sedan are different, we can say that
both inherit from the Car category (or class) because ultimately both of them fulfill the basic criteria of a Car, which in turn is a Vehicle.
So, we can simply say that hierarchical classifications are supported with the concept of inheritance.

In Java, inheritance creates a new child class from an existing parent class. This parent class is also called the Base class or the super class.
A parent class is placed one level up in that hierarchical chain. We can add new functionalities (methods) or modify the super class
functionalities (by overriding the functionalities) into the child class. 

The key advantage is that we can avoid lots of duplicate code with this mechanism.

Polymorphism
------------

Polymorphism is generally associated with one name but many forms. Consider the behavior of a dog. When it sees an unknown person, it is angry and starts barking
a lot. But when it sees the master, it makes different noises and behaves differently. Similarly, in the case of addition of two integers, 
we expect to get a sum of the integers. But for string operands, we expect to get a concatenated string.

The two types of polymorphism are:

1) Compile-time polymorphism: 
   The compiler can decide which method to invoke in which situation once the program is
   compiled. This is also known as static binding or early binding.
2) Runtime polymorphism:
   The actual method calls are resolved at runtime. At compile time, we cannot predict which method will be
   invoked when the program runs (for example, the program may behave
   differently with different inputs). 
   Consider the following case: Suppose we want to generate a random number at the very first line when you
   execute a program. If the generated number is an even number, you
   will call a method, printing(), which prints "EVEN Hello" otherwise, you’ll
   call a method whose name is the same but prints "ODD Hello". We can only see which method is
   invoked (i.e., the compiler cannot resolve the call at compile time). In a situation like this, we do not have any clue whether, we will see
   "EVEN Hello" or "ODD Hello" prior to the program’s execution. Therefore, sometimes it is also termed dynamic binding or late binding. 


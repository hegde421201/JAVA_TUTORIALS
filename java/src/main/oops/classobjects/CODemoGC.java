package src.main.oops.classobjects;

public class CODemoGC {

    public static void main(String[] args) {

        Employee emp1, emp2, emp3;

        //Three objects and three reference variables are created.
        emp2 = new Employee("Tareq",42456.9);
        emp1 = new Employee("Sumit",46245.95);
        emp3 = new Employee("Rama",89476.78);

        //When you assign emp1=null, the Employee#1 object is now eligible for garbage collection.
        emp1 = null;

        //When you write
        //emp3=emp2;
        //both emp3 and emp2 refer to Employee#2. And the Employee#3 object is now
        //eligible for garbage collection.
        emp3 = emp2;

        /*
         In this stage, even if you write
         emp2=null;
         Employee#2 still has a reference (employee 3) to it. So, it is not eligible for garbage collection yet.
         In this case, the reference employee3 can go out of scope at the end of main() only.
         But we can make it null before the end of main() to make it eligible for garbage collection much earlier.
        * */

    }

}

/*
 JVM uses a background thread, commonly known as the garbage collector,to detect unused objects and free up the memory occupied by them.
 This technique is called garbage collection (GC).

 The biggest advantage of GC is that normally we do not need to worry about memory leaks, because we can rely on the automatic garbage-collection technique.
 But in some special cases, we may explicitly need to free up memory to avoid memory leaks,
 because the garbage collector is for some reason unable to detect those special scenarios.

 The basic thing to remember is that when an object is unreachable from a root object (a root object is a root in an object tree),
 the object is eligible for garbage collection. An object can have multiple references to it.

 It is a common misunderstanding that when the reference count is zero, the object will be garbage collected.

 Also, two objects can be garbage collected if there is a connection between them.
 But if such a connection is further connected to a root object, those two objects will not be garbage collected.

 Memory leak
 ----------
 In general, when a computer program runs over a long period of time but fails to release memory resources that are no longer needed, we can feel the impact of memory leaks
 (for example, machines become slow over time, or, in the worst case, they can crash).
 With this information, it is apparent that the leaking rate of our application is directly proportional to our understanding of memory issues with the application.

Consider an example. Suppose that we have an online application where users need to fill in some data and then click a ‘Submit’ button.
Now, assume that the developers of the application mistakenly forgot to deallocate some memory that is no longer needed once a user presses the Submit button, and due to this misjudgment,
the application is leaking 512 bytes per click. We probably won’t notice any performance degradation in some initial clicks. But what happens if thousands
of online users are using the application simultaneously? If 100,000 users press the Submit button, we will eventually lose 48.8 MB of memory; 10,000,000 clicks leads to the loss of 4.76 GB; and so on.

In short, even if our application or program is leaking a very small amount of data per execution, we will see some kind of malfunctioning over a period of time;
for example, operations in the device might become so slow that you need to restart the application often.

Java’s garbage-collection mechanism rescues us from most of these cases.
Still, there are instances that we may need to handle with care; otherwise, we may notice the impact of memory leaks.

Automatic garbage collection
----------------------------

It is a process that investigates the heap memory and identifies which objects are in use and which are not.
Then, it deletes the unused objects. In this context, you may notice the following terms:

A referenced object: It means that the object is currently in use. In other words, in your program, there is still a pointer to this object.

An unreferenced object: This object is no longer referenced by any part of the program, so GC can reclaim the memory occupied by the unused object.

After these deletion operations, to improve performance, the compaction technique can be used. A compaction technique moves all free blocks of memory to one contiguous location
and all occupied block in a different location. As a result, if needed, we can allocate a large block of memory which may not possible when available memories are scattered or the memory pool is fragmented.
After the compaction, objects generally stay in the same area, so, accessing them also becomes faster and easier.

Root Object
-----------

We should just know that objects are allocated on a heap area, which is managed by JVM.
We can draw/  imagine a tree that connects all these objects.

In general, we say an object is live if you have a reference to it.

what is the first reference in the tree?
To answer this question, we need to know that an object tree can have one or more roots.
When your application can reach these roots, the entire tree is reachable.

 */

package src.main.oops.classobjects;

public class CODemoFinal {


    protected void finalize() {
        System.out.println("Freeing memory. The object with hashcode " + hashCode() + " is collected.");
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("*Demo - Exploring Garbage Collection.\n");

        //Step - 1
        CODemoFinal emp1, emp2, emp3;
        emp1 = new CODemoFinal();// Employee # 1
        System.out.println("The employee 1 hashCode()=" + emp1.hashCode());

        emp2 = new CODemoFinal();
        System.out.println("The employee 2 hashCode()=" + emp2.hashCode());

        emp3 = new CODemoFinal();
        System.out.println("The employee 3 hashCode()=" + emp3.hashCode());

        //Step 2
        emp1 = null;
        // Requesting JVM to run Garbage Collector
        System.out.println("Requesting GC-1");
        System.gc();
        Thread.sleep(5000);

        //Step 3
        emp3 = emp2;
        // Requesting JVM to run Garbage Collector
        System.out.println("Requesting GC-2");
        System.gc();
        Thread.sleep(5000);

        //Step 4
        emp2 = null;
        // Requesting JVM to run Garbage Collector
        System.out.println("Requesting GC-3");
        System.gc();
        Thread.sleep(5000);

        //Step 3
        emp3 = null;
        // Requesting JVM to run Garbage Collector
        System.out.println("Requesting GC-4");
        System.gc();
        Thread.sleep(5000);



    }
}

/*
Just before destroying an object and reclaiming the memory, the GC calls finalize() method.
It is a protected method defined in the Object class. You’ll see this general form of finalize() method :

protected void finalize() {
           //Some code
}

It is suggested that we put our cleanup code (for example, closing a file, closing a database connection, releasing any occupied non-Java resources, etc.) inside
this method.

As a result, an object can perform some desired action just before it is destroyed. This process is called finalization.
But the problem is that we never know when finalize() will be called.

We only know that the finalize() method will be called just before garbage collection.

Finalizers provide a chance to free up resources that cannot be freed automatically by an automatic storage manager.
In such situations, simply reclaiming the memory used by an object would not guarantee that the resources it held would be reclaimed.
The Java programming language does not specify how soon a finalizer will be invoked, except to say that it will happen before the storage for the object is reused.

So, we cannot always rely on finalize(), and we may implement other ways to release the resources.
Still, there is a workaround. You can make a request to the garbage collector when you invoke System.gc(). It simply tells the GC that you want it to start its job.
 */
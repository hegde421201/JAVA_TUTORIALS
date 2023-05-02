package src.main.oops.classobjects;

public class CODemo6 {

    int x,y,z;

    { //Initialization Block 1

        System.out.println("Initialization block-1 is executed. Setting x=10.");
        x = 10;
    }

    public CODemo6() {

        System.out.println("User-defined parameterless constructor is executed.Setting z=60");
        z = 60;
    }

    public static void main(String[] args) {

        CODemo6 coDemo6 = new CODemo6();
        System.out.println(" x is "+coDemo6.x);
        System.out.println(" y is "+coDemo6.y);
        System.out.println(" z is "+coDemo6.z);
    }


    // Initialization block-2
    {
        System.out.println("Initialization block-2 is executed. Setting y=20");
        y = 20;
    }

}

/*
 Initialization Block

  An initialization block is an alternative to constructors for initialising variables.
  They can be either static or non-static. In the upcoming section,
  Here we see non-static initialization blocks.

  Constructor is called after all the Initialization Blocks are executed.
  If we have multiple constructors in your class, we can share common code between the constructors by using
  Initialization Blocks.
* */